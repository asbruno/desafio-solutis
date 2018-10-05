package com.desafio.solutis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 * Classe que representa uma entidade.
 * 
 * @author Bruno Souza.
 *
 */
@Entity(name="resultado_analise")
public class Resultado {

//	@Id	
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	private Integer id;

	@Id
	@NotBlank(message="{notblank}")
	private String string;
	
	@Column
	private String vogal;
	
	@Column
	private Long tempoTotal;
	
	public Resultado() {}
	
	public Resultado(String string, String vogal, Long tempoTotal) {
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
	
	public Long getTempoTotal() {
		return tempoTotal;
	}
	
	public void setTempoTotal(Long tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

}
