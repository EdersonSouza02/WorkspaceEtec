package br.com.sp.gov.TOO.Polimorfismo;


public class Produto {

	private String genero;
	private int estoquedisponivel;
	private double precoCusto;
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEstoquedisponivel() {
		return estoquedisponivel;
	}

	public void setEstoquedisponivel(int estoquedisponivel) {
		this.estoquedisponivel = estoquedisponivel;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public int comprar(int quantidade) {
		this.estoquedisponivel = estoquedisponivel + quantidade;
		return estoquedisponivel;

	}

	public int vender(int quantidade) {
		this.estoquedisponivel = estoquedisponivel - quantidade;
		return estoquedisponivel;
		
	}

	public double CalcularPrecoVenda() {
		return this.precoCusto*1.1;
		

	}
}
