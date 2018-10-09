package com.desafio.solutis.vo;

import com.desafio.solutis.model.Resultado;

/**
 * Classe que server de apoio a formação do JSON e transferencia de dados.
 * 
 * Padrão para conversão de formatação.
 * 
 * @author Bruno Andrade
 *
 */
public class ResultadoVO {
	
	private String string;
	private String vogal;
	private String tempoTotal;
	
	/**
	 * Construtor que realizar o parser do objeto model/entity para o VO.
	 * 
	 * @param entity, Entidade que tá vinculado ao banco de dados.
	 * @return, objeto já no modelo de envio de dados.
	 */
	public ResultadoVO(Resultado entity) {
		setString(entity.getString());
		setVogal(entity.getVogal());
		setTempoTotal(String.valueOf(entity.getTempoTotal()).concat("ms"));
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
