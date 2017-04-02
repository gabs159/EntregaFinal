package com.dev.web.mobile.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.dev.web.mobile.impl.ValorFreteAte100Km;
import com.dev.web.mobile.impl.ValorFreteDe101Ate300Km;
import com.dev.web.mobile.impl.ValorFreteMaior300Km;

@XmlRootElement
public class Frete implements Serializable {
	private static final long serialVersionUID = -3654883223185910358L;
	
	private String pontoA;
	private String pontoB;
	private double distancia;
	private double valorFrete;
	
	public Frete() {
		super();
	}

	public String getPontoA() {
		return pontoA;
	}

	public void setPontoA(String pontoA) {
		this.pontoA = pontoA;
	}

	public String getPontoB() {
		return pontoB;
	}

	public void setPontoB(String pontoB) {
		this.pontoB = pontoB;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	
	public void calculaValorFrete(){
		if(this.getDistancia() <= 100){
			this.valorFrete = new ValorFreteAte100Km().calcula(this);
		} else if((this.getDistancia() > 100) && (this.getDistancia() <= 300)){
			this.valorFrete = new ValorFreteDe101Ate300Km().calcula(this);
		} else {
			this.valorFrete = new ValorFreteMaior300Km().calcula(this);
		}
	}
}
