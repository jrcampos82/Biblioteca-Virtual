package br.com.biblioteca.model;

public abstract class Exemplares {
	
	private int codigo;
	private String nome;
	private int tipoExemplar;
	
	
	
	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getTipoExemplar() {
		return tipoExemplar;
	}



	public void setTipoExemplar(int tipoExemplar) {
		this.tipoExemplar = tipoExemplar;
	}



	public void manterExemplares() {
		
	}

}
