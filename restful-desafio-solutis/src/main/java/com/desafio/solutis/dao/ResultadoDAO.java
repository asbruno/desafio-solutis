package com.desafio.solutis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.solutis.model.Resultado;

/**
 * Interface para acesso a base de dados.
 * 
 * @author Bruno Souza, não conhecia esta Interface JpaRepositoty. 
 * 
 * 	Já utilizei outras entre elas a jdbcTemplate para consulta em SQLnativo.
 * 
 *  Bem interesante os recursos para criacao de metodos (nomes) para auxilar na busca, 
 *     paginação e com consulta nomeadas.  
 *     
 */
public interface ResultadoDAO extends JpaRepository<Resultado, String> {

}