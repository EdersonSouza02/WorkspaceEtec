package br.com.sp.gov.TOO.Polimorfismo;

public class Livro extends Produto {

	private String autor;
	private String editora;
	private String edicao;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public double CalcularPrecoVenda(double precovenda) {
		double precoCusto = 0;
		precovenda = (precoCusto * 0.05) + precovenda;
		return precovenda;

	}

}
