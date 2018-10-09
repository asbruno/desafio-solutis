package com.desafio.solutis.parser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

/**
 * Classe que realiza os Parser de extração da vogal, desafio Solutis.
 * 
 * @author Bruno Souza.
 *
 */
@Component
public class Parser {

	/**
	 * @param pString, string que contém o texto a ser analisado.
	 * @return se null não tem vogal válida
	 */
	public String iniciarAnaliseTexto(String pString) {
		if (pString == null || pString.length()<3)
			return null;
		
		pString = pString.toLowerCase();
		List<ElementoParser> lListaParser = Arrays.asList(
				new ElementoParser("a"),new ElementoParser("e"),new ElementoParser("i"),new ElementoParser("o"),new ElementoParser("u")
			);
		
		int lPosAtualString = 0;
		for (int i=0;i<pString.length()-2;i++) {
			String tSequencia = pString.substring(i, (i+3));
			lPosAtualString = lPosAtualString + 1;
			processarOcorrenciaVogal(tSequencia, (i+1)>=pString.length()-2, lListaParser, lPosAtualString);
			
			//validação por expressão regular
			if (!tSequencia.matches("[aeiou][a-z^aeiou][aeiou]"))
				continue;
			
			String tUltimaVogalSequencia = tSequencia.substring(2);
			ElementoParser tParser = lListaParser.get(lListaParser.indexOf(new ElementoParser(tUltimaVogalSequencia)));
			tParser.addSequenciaValida(tSequencia);
		}
		
		List<ElementoParser> result =
				lListaParser.stream()
					.sorted((p1,p2)->p1.compareTo(p2))
					.filter(p->p.getListaSequenciaValida().isEmpty()==false && p.getOcorrencia() == 1)
					.limit(1)
					.collect(Collectors.toList())
					//.forEach(p->System.out.println(p))
				;
			
		if (result.size()==1)
			return result.get(0).getVogal();		
		if (result.isEmpty())
			return null;
		
		//TODO, parametrizar mensagem, retirar a string do código....
		throw new RuntimeException("ERRO inesperado");
	}
	
	private void processarOcorrenciaVogal(String pSequencia, boolean pFlagFim, List<ElementoParser> pListaParser, int pPosAtualString) {
		if (pFlagFim) {
			for (int i=0;i<pSequencia.length();i++) {
				String tVogalIncrement = pSequencia.substring(i, (i+1));
				incrementarVogal(pSequencia, pListaParser, pPosAtualString+1, tVogalIncrement);
			}			
		} else {
			String tVogalIncrement = pSequencia.substring(0, 1);
			incrementarVogal(pSequencia, pListaParser, pPosAtualString, tVogalIncrement);
		}
	}
	
	private void incrementarVogal(String pSequencia, List<ElementoParser> pListaParser, int pPosAtualString, String pVogalIncrement) {
		if (pVogalIncrement.matches("[aeiou]")) {
			ElementoParser tParser = pListaParser.get(pListaParser.indexOf(new ElementoParser(pVogalIncrement)));
			tParser.incremento();
			tParser.setPosUltimaOcorrencia(pPosAtualString);
		}
	}
	
}
