package com.desafio.solutis.model;

public class Resultado {

	private String string;
	private String vogal;
	private String tempoTotal;
	
	public Resultado() {}
	
	public Resultado(String string, String vogal, String tempoTotal) {
		setString(string);
		setVogal(vogal);
		setTempoTotal(tempoTotal);
	}
	
	public String getString() {
		return string;
	}
	
	public void setString(String string) {
		this.string = string;
	}
	
	public String getVogal() {
		return vogal;
	}
	
	public void setVogal(String vogal) {
		this.vogal = vogal;
	}
	
	public String getTempoTotal() {
		return tempoTotal;
	}
	
	public void setTempoTotal(String tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

}
