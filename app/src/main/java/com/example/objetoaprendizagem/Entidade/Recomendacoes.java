package com.example.objetoaprendizagem.Entidade;

import java.util.ArrayList;


public class Recomendacoes {
	
	ArrayList<String> ObjetoDeAprendizagem = new ArrayList<String> ();
	public String id;

	public Recomendacoes(ArrayList<String> objetoDeAprendizagem, String id) {
		ObjetoDeAprendizagem = objetoDeAprendizagem;
		this.id = id;
	}

	public Recomendacoes() {
	}

	public ArrayList<String> getObjetoDeAprendizagem() {
		return ObjetoDeAprendizagem;
	}

	public void setObjetoDeAprendizagem(ArrayList<String> objetoDeAprendizagem) {
		ObjetoDeAprendizagem = objetoDeAprendizagem;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
