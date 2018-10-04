package com.desafio.solutis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.solutis.dao.ResultadoDAO;
import com.desafio.solutis.model.Resultado;

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
	public Resultado processarAnaliseLexica(Resultado pResultado) {
		//TODO, implementar lógica para analise da string	
		return dao.save(pResultado);
	}
	
}




