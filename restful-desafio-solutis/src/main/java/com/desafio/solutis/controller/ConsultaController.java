package com.desafio.solutis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.solutis.model.Resultado;
import com.desafio.solutis.service.AnaliseService;

@RestController
@RequestMapping("/analise")
public class ConsultaController {

	@Autowired
	private AnaliseService service;
	
	@GetMapping
	public ResponseEntity<List<Resultado>> listagemAnalises() {
		List<Resultado> lListaAnalise = service.getAll();
		return new ResponseEntity<List<Resultado>>(
				lListaAnalise,
				(lListaAnalise.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK)
			);
	}
	
	@PostMapping
	public ResponseEntity<Resultado> processarAnaliseString(
			@RequestBody Resultado pResultado
		) {
		return new ResponseEntity<Resultado>(
				service.processarAnaliseLexica(pResultado),
				HttpStatus.OK
			);
	}
	
}
