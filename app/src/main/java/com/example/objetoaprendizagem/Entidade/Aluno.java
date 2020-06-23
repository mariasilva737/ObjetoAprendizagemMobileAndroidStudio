package com.example.objetoaprendizagem.Entidade;

import java.sql.Date;


public class Aluno {
	
	private String id;
	

	private String senha;
	public String nome;
	public String email;
	public Date data_nascimento;
	

	int[] interesses = new int[20]; // aluno diz o que se interessa no primeiro acesso

	int[] recomendacoes = new int[20]; // o que nos recomendamos para o aluno
	
	int[] metadados = new int[20]; //o que capturamos da busca do aluno
	
	//Construtores

	public Aluno(String id, String senha, String nome, String email, Date data_nascimento, int[] interesses, int[] recomendacoes, int[] metadados) {
		this.id = id;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.data_nascimento = data_nascimento;
		this.interesses = interesses;
		this.recomendacoes = recomendacoes;
		this.metadados = metadados;
	}

	public Aluno() {
	}

	public String getId() {
		return id;
	}

	public String getSenha() {
		return senha;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public int[] getInteresses() {
		return interesses;
	}

	public int[] getRecomendacoes() {
		return recomendacoes;
	}

	public int[] getMetadados() {
		return metadados;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public void setInteresses(int[] interesses) {
		this.interesses = interesses;
	}

	public void setRecomendacoes(int[] recomendacoes) {
		this.recomendacoes = recomendacoes;
	}

	public void setMetadados(int[] metadados) {
		this.metadados = metadados;
	}
}
