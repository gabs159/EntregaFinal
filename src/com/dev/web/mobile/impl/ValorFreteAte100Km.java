package com.dev.web.mobile.impl;

import com.dev.web.mobile.util.RegraDeCalculo;
import com.dev.web.mobile.model.Frete;

public class ValorFreteAte100Km implements RegraDeCalculo{

	@Override
	public double calcula(Frete frete) {
		double retorno = 0;
		if(frete.getDistancia() <= 100)
			retorno = frete.getDistancia() * 0.15;
		return retorno;
	}

}
