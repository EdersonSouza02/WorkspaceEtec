package br.com.sp.gov.TOO.Polimorfismo;

public class Cd extends Produto {

	private String artista;
	private String gravadora;
	private String PaisOrigem;

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public String getPaisOrigem() {
		return PaisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		PaisOrigem = paisOrigem;
	}

	public double CalcularPrecoVenda(double precovenda) {
		double precoCusto = 0;
		precovenda = (precoCusto * 0.13) + precovenda;
		return precovenda;

	}

}
