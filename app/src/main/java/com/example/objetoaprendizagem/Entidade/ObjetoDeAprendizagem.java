package com.example.objetoaprendizagem.Entidade;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;


public class ObjetoDeAprendizagem {
	

	ArrayList<String> conteudo = new ArrayList<String> ();
	
	public String id;
	public String autor;
	public String fonte;
	public String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ObjetoDeAprendizagem(String autor, String fonte, String titulo) {
		this.autor = autor;
		this.fonte = fonte;
		this.id = id;
		this.titulo = titulo;
		
	}

	public ObjetoDeAprendizagem() {
	}

	public ArrayList<String> getConteudo() {
		return conteudo;
	}

	public String getId() {
		return id;
	}

	public String getAutor() {
		return autor;
	}

	public String getFonte() {
		return fonte;
	}

	public void setConteudo(ArrayList<String> conteudo) {
		this.conteudo = conteudo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setFonte(String fonte) {
		this.fonte = fonte;
	}
}
