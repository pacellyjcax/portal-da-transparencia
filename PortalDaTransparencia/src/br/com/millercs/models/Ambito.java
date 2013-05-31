package br.com.millercs.models;

public class Ambito {

	private int codigoDoAmbito;
	private String tituloDoAmbito;

	public Ambito(int id, String titulo) {
		setCodigoDoAmbito(id);
		setTituloDoAmbito(titulo);
	}

	public int getCodigoDoAmbito() {
		return codigoDoAmbito;
	}

	public void setCodigoDoAmbito(int codigoDoAmbito) {
		this.codigoDoAmbito = codigoDoAmbito;
	}

	public String getTituloDoAmbito() {
		return tituloDoAmbito;
	}

	public void setTituloDoAmbito(String tituloDoAmbito) {
		this.tituloDoAmbito = tituloDoAmbito;
	}

}