package com.desafio.solutis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.solutis.dao.ResultadoDAO;
import com.desafio.solutis.model.Resultado;

@Service
public class AnaliseService {

	@Autowired
	private ResultadoDAO dao;
	
	public List<Resultado> getAll() {
		return dao.findAll();
	}

	public Resultado processarAnaliseLexica(Resultado pResultado) {
		//TODO, implementar lógica para analise da string	
		return dao.save(pResultado);
	}
	
}




