package com.example.objetoaprendizagem.Entidade;

import java.util.ArrayList;

//@Entity(name = "Interesses")
public class Interesses {
	
	//@Column
	int[] metadados = new int[20];
	
	//@ManyToOne(cascade = CascadeType.ALL)
	ArrayList<String> Alunos = new ArrayList<String> ();
}
