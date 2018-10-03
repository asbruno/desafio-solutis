package com.desafio.solutis.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.desafio.solutis.model.Resultado;

@Service
public class AnaliseService {

	public List<Resultado> getAll() {
		//TODO, implementar o DAO
		return Arrays.asList(
				new Resultado("Bruno", null, "10ms"),
				new Resultado("Artur", null, "10ms"),
				new Resultado("Desirrê", null, "10ms")
			);
	}

	public Resultado processarAnaliseLexica(Resultado pResultado) {
		//TODO, implementar lógica para analise da string
		return pResultado;
	}
	
}




