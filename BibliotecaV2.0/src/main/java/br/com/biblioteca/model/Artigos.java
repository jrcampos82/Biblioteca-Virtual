package br.com.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artigos {
	@Id
	private int id;
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	

}
