package com.dev.web.mobile.impl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.mobile.dao.CityDAO;
import com.dev.web.mobile.util.ActExec;
import com.dev.web.mobile.util.DistanceCalculator;
import com.dev.web.mobile.model.City;
import com.dev.web.mobile.model.Frete;
import com.dev.web.mobile.util.Constantes;
import com.dev.web.mobile.util.Utilities;

public class CalculaFrete implements ActExec {
	
	private static final CityDAO cityDAO = CityDAO.getInstance();
	private DistanceCalculator distanceCalculator = new CityDistanceCalculator();	

	@Override
	public String exc(HttpServletRequest request, HttpServletResponse response) {
		String codigoA = request.getParameter("geocodigoA");
		String codigoB = request.getParameter("geocodigoB");

		validateCityCode(codigoA);
		validateCityCode(codigoB);

		double geocodigoA = new Double(codigoA);
		double geocodigoB = new Double(codigoB);

		try {

			City cityA = cityDAO.getCityByGeocodigo(geocodigoA);
			City cityB = cityDAO.getCityByGeocodigo(geocodigoB);

			validateCityState(cityA, geocodigoA);
			validateCityState(cityB, geocodigoB);
			
			double distanceCalculated = distanceCalculator.calculateDistanceInKilometers(cityA, cityB);

			Frete frete = getFreteCalculated(cityA, cityB, distanceCalculated);
			setFreteInResponse(request, frete);

		} catch (ClassNotFoundException | SQLException | IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		
		return Utilities.buildJSPPagesPath(Constantes.CALCULA_FRETE_JSP);
	}

	private void setFreteInResponse(HttpServletRequest request, Frete frete) {
		List<Frete> lista = new ArrayList<Frete>();
		lista.add(frete);
		request.setAttribute("frete", lista);
		
		try {
			request.setAttribute("citiesA", cityDAO.getCities());
			request.setAttribute("citiesB", cityDAO.getCities());
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	private Frete getFreteCalculated(City cityA, City cityB, double distCalc) {
		Frete frete = new Frete();
		frete.setPontoA(cityA.getNome());
		frete.setPontoB(cityB.getNome());
		frete.setDistancia(distCalc);

		frete.getValorFrete();
		return frete;
	}

	private void validateCityState(City city, double geocodigo) {
		if (city == null ) {
			throw new IllegalStateException("One of the geocode are not available. Plese check if it was inserted: " + geocodigo);
		}
	}

	private void validateCityCode(String codigoA) {
		if (codigoA == null)
			throw new IllegalArgumentException("The city geocod value cannot be null.");
	}

}