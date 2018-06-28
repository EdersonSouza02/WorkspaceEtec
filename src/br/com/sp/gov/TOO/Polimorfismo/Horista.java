package br.com.sp.gov.TOO.Polimorfismo;

public class Horista extends Empregado {
		
	private double horasTrabalhadas;
	private double precoHora;
	
	public double getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double vencimento() {
		
		return precoHora*horasTrabalhadas;
	
	
	
		
}
}
