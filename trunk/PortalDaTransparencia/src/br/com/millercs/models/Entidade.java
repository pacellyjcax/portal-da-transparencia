package br.com.millercs.models;


public class Entidade {

	private int id;

	private String tituloDaEntidade;

	private int ambito;

	public Entidade(int id, String titulo, int ambitoID) {
		setId(id);
		setTituloDaEntidade(titulo);
		setAmbito(ambitoID);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTituloDaEntidade() {
		return tituloDaEntidade;
	}

	public void setTituloDaEntidade(String tituloDaEntidade) {
		this.tituloDaEntidade = tituloDaEntidade;
	}

	public int getAmbito() {
		return ambito;
	}

	public void setAmbito(int ambitoID) {
		this.ambito = ambitoID;
	}
	
	

	

}