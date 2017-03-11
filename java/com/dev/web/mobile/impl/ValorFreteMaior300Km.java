package com.dev.web.mobile.impl;

import com.dev.web.mobile.model.Frete;
import com.dev.web.mobile.util.RegraDeCalculo;

public class ValorFreteMaior300Km implements RegraDeCalculo{

	@Override
	public double calcula(Frete frete) {
		double retorno = 0;
		if(frete.getDistancia() > 300)
			retorno = frete.getDistancia() * 1.75;
		return retorno;
	}
}