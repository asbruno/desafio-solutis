package com.desafio.solutis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.solutis.model.Resultado;
import com.desafio.solutis.service.AnaliseService;
import com.desafio.solutis.vo.ResultadoVO;

/**
 * Classe responsável pela gestão do modelo RESTful para o FrontEnd.
 * >>>>> http://servidor:porta/analise
 * 
 * @author Bruno Souza
 *
 */
@RestController
@RequestMapping("/analise")
//No 'Access-Control-Allow-Origin' header is present on the requested resource.
@CrossOrigin
public class ConsultaController {

	@Autowired
	private AnaliseService service;

	/**
	 * Método responsável pela gerencia de requisições GET.
	 * 
	 * 
	 * @return, lista de analise já realizada pelo sistema e seus resultados;
	 */
	@GetMapping(value="/listagem", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ResultadoVO>> listagemAnalises() {
		List<Resultado> lListaAnalise = service.getAll();
		List<ResultadoVO> listaVO = new ArrayList<>();
		for (Resultado tResultado : lListaAnalise)
			listaVO.add(new ResultadoVO(tResultado));
		return new ResponseEntity<List<ResultadoVO>>(
			listaVO,
			(lListaAnalise.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK)
		);
	}
	
	/**
	 * 
	 * 	 Método responsável pela gerencia de requisições POST.
	 * 
	 * @param pResultado, atributo que contém a string a ser analisado.
	 * @return, json com o resultado da analise léxica.
	 */
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResultadoVO> processarAnaliseString(
			@RequestBody @Valid Resultado pResultado
		) {
		return new ResponseEntity<ResultadoVO>(
				new ResultadoVO(service.processarAnaliseLexica(pResultado)),
				HttpStatus.OK
			);
	}
	
}
