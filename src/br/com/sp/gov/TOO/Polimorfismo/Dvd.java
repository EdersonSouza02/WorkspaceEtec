package br.com.sp.gov.TOO.Polimorfismo;

public class Dvd extends Produto {

	private String dvd;
	private String duracao;
	private String censura;

	public String getDvd() {
		return dvd;
	}

	public void setDvd(String dvd) {
		this.dvd = dvd;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getCensura() {
		return censura;
	}

	public void setCensura(String censura) {
		this.censura = censura;
	}

	public double CalcularPrecoVenda() {
	
		return super.CalcularPrecoVenda()+super.getPrecoCusto()*0.03;
	}

	public double CalcularPrecoVenda(double cotacao) {
		return this.CalcularPrecoVenda()*cotacao;

	}
}
