package com.dev.web.mobile.impl;

import com.dev.web.mobile.util.DistanceCalculator;
import com.dev.web.mobile.model.City;

/**
 * 
 * @author JETHER ROIS
 *
 */
public class CityDistanceCalculator implements DistanceCalculator{

	public double calculateDistanceInKilometers(City from, City to) {
		final int R = 6371; 
     
		Double latDistance = deg2rad(to.getLatitude() - from.getLatitude());
        Double lonDistance = deg2rad(to.getLongitude() - from.getLongitude());
        Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(deg2rad(from.getLatitude())) * Math.cos(deg2rad(to.getLatitude()))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c;
     
        distance = Math.pow(distance, 2);
        return Math.sqrt(distance);
	}

	public double calculateDistanceInMilles(City from, City to) {
		final double MILES_CONVERSION = 0.6214; 
		return calculateDistanceInKilometers(from, to) * MILES_CONVERSION;
	}

	private double deg2rad(double deg){
		return (deg * Math.PI / 180);
	}
}
