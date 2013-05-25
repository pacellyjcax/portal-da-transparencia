package br.com.millercs.models;

public class Despesa {

	private int idDaDespesa;

	private String numeroDoEmpenho;

	private String tipoDoEmpenho;

	private String dataDoEmpenho;

	private double valorDaDespesa;

	private double valorLiquidado;

	private String dataDaLiquidacao;

	private String nomeDoCredor;

	private String descricaoDaDespesa;

	private int idDaEntidade;

	
	
	public Despesa(int idDaDespesa,String numeroDoEmpenho, String tipoDoEmpenho,
			String dataDoEmpenho, double valorDaDespesa, double valorLiquidado,
			String dataDaLiquidacao, String nomeDoCredor,
			String descricaoDaDespesa, int idDaEntidade) {
		this.idDaDespesa = idDaDespesa;
		this.numeroDoEmpenho = numeroDoEmpenho;
		this.tipoDoEmpenho = tipoDoEmpenho;
		this.dataDoEmpenho = dataDoEmpenho;
		this.valorDaDespesa = valorDaDespesa;
		this.valorLiquidado = valorLiquidado;
		this.dataDaLiquidacao = dataDaLiquidacao;
		this.nomeDoCredor = nomeDoCredor;
		this.descricaoDaDespesa = descricaoDaDespesa;
		this.idDaEntidade = idDaEntidade;
	}

	public int getIdDaDespesa() {
		return idDaDespesa;
	}

	public void setIdDaDespesa(int idDaDespesa) {
		this.idDaDespesa = idDaDespesa;
	}

	public String getNumeroDoEmpenho() {
		return numeroDoEmpenho;
	}

	public void setNumeroDoEmpenho(String numeroDoEmpenho) {
		this.numeroDoEmpenho = numeroDoEmpenho;
	}

	public String getTipoDoEmpenho() {
		return tipoDoEmpenho;
	}

	public void setTipoDoEmpenho(String tipoDoEmpenho) {
		this.tipoDoEmpenho = tipoDoEmpenho;
	}

	public String getDataDoEmpenho() {
		return dataDoEmpenho;
	}

	public void setDataDoEmpenho(String dataDoEmpenho) {
		this.dataDoEmpenho = dataDoEmpenho;
	}

	public double getValorDaDespesa() {
		return valorDaDespesa;
	}

	public void setValorDaDespesa(double valorDaDespesa) {
		this.valorDaDespesa = valorDaDespesa;
	}

	public double getValorLiquidado() {
		return valorLiquidado;
	}

	public void setValorLiquidado(double valorLiquidado) {
		this.valorLiquidado = valorLiquidado;
	}

	public String getDataDaLiquidacao() {
		return dataDaLiquidacao;
	}

	public void setDataDaLiquidacao(String dataDaLiquidacao) {
		this.dataDaLiquidacao = dataDaLiquidacao;
	}

	public String getNomeDoCredor() {
		return nomeDoCredor;
	}

	public void setNomeDoCredor(String nomeDoCredor) {
		this.nomeDoCredor = nomeDoCredor;
	}

	public String getDescricaoDaDespesa() {
		return descricaoDaDespesa;
	}

	public void setDescricaoDaDespesa(String descricaoDaDespesa) {
		this.descricaoDaDespesa = descricaoDaDespesa;
	}

	public int getIdDaEntidade() {
		return idDaEntidade;
	}

	public void setIdDaEntidade(int idDaEntidade) {
		this.idDaEntidade = idDaEntidade;
	}
	
	
	

}
