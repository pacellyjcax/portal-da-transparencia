package br.com.millercs.models;

public class Integer {

	private int codigoDoAmbito;
	private String tituloDoAmbito;

	public Integer(int id, String titulo) {
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