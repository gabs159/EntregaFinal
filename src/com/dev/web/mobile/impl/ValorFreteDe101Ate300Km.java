package com.dev.web.mobile.impl;

import com.dev.web.mobile.util.RegraDeCalculo;
import com.dev.web.mobile.model.Frete;

public class ValorFreteDe101Ate300Km implements RegraDeCalculo{

	@Override
	public double calcula(Frete frete) {
		double retorno = 0;
		if((frete.getDistancia() > 100) && (frete.getDistancia() <= 300))
			retorno = frete.getDistancia() * 0.75;
		return retorno;
	}

}