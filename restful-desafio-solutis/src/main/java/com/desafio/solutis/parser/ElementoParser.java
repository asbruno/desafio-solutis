package com.desafio.solutis.parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de apoio, seu uso tá restrito a este package somente, ou seja, nivel default de acesso.
 * 
 * Esta estrutura foi criada para auxiliar no processo de extração da vogal do desafio. 
 *
 * @author Bruno Andrade
 */
class ElementoParser implements Comparable<ElementoParser>{
		
		private String vogal;
		private int ocorrencia;
		private int posInicialOcorrencia;
		private int posUltimaOcorrencia;
		private List<String> listaSequenciaValida;

		public ElementoParser(String pVogal) {
			vogal = pVogal;
			ocorrencia = 0;
			listaSequenciaValida = new ArrayList<String>();
		}
		
		@Override
		public boolean equals(Object pObj) {
			return vogal.equals(((ElementoParser)pObj).vogal);
		}

		public void incremento() {
			ocorrencia = ocorrencia+1;
		}
		
		public int getOcorrencia() {
			return ocorrencia;
		}
		
		public List<String> getListaSequenciaValida() {
			return listaSequenciaValida;
		}
		
		public void addSequenciaValida(String pSequencia) {
			listaSequenciaValida.add(pSequencia);
		}
		
		public int getPosInicialOcorrencia() {
			return posInicialOcorrencia;
		}

		public void setPosUltimaOcorrencia(int posUltimaOcorrencia) {
			if (posInicialOcorrencia == 0)
				this.posInicialOcorrencia = posUltimaOcorrencia;
			this.posUltimaOcorrencia = posUltimaOcorrencia;
		}

		@Override
		public String toString() {
			return "{"+vogal +"{Ocorrencia:"+ocorrencia+" ; Ordem ocorrência:"+posInicialOcorrencia+"}" + listaSequenciaValida.toString()+"}";
		}

		public int compareTo(ElementoParser pParser) {
			return Integer.compare(posInicialOcorrencia, pParser.getPosInicialOcorrencia());
		}

		public String getVogal() {
			return vogal;
		}
		
}
