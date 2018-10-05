package com.desafio.solutis.service;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.desafio.solutis.dao.ResultadoDAO;
import com.desafio.solutis.model.Resultado;
import com.desafio.solutis.parser.Parser;

/**
 * Classe que realizar a lógica de negócio e acesso ao DAO
 * 
 * @author Bruno Souza.
 *
 */
@Service
public class AnaliseService {

	@Autowired
	private ResultadoDAO dao;
	
	@Autowired
	private Parser parser;
	
	/**
	 * Gera uma lista de todos os Resultado já analisados.
	 * 
	 * @return, todos os registro que foram processados e seus resultados.
	 */
	public List<Resultado> getAll() {
		return dao.findAll();
	}

	/**
	 * Realiza a analise léxica da string informado e grava na base de dados seu resultado.
	 * 
	 * @param pResultado, objeto que contém a strng a ser analisada.
	 * @return objeto da classe com.desafio.solutis.model.Resultado que contém dados da analise.
	 */	
	@Transactional(propagation=Propagation.REQUIRED)
	public Resultado processarAnaliseLexica(Resultado pResultado) {
		
		Instant inicio = Instant.now();
		pResultado.setVogal(
			parser.iniciarAnaliseTexto(pResultado.getString())
		);
		Instant fim = Instant.now();
		Duration duracao = Duration.between(inicio, fim);
		long tempoDuracao = duracao.toMillis();
		pResultado.setTempoTotal(tempoDuracao);
		
		return dao.save(pResultado);
	}
	
}




