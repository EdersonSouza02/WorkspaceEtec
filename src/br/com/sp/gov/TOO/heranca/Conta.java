package br.com.sp.gov.TOO.heranca;

import javax.swing.JOptionPane;

public class Conta {

	
	private String nome ;
	private int numero;
	
 public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	} 
	
	
	public void saque (double valor) {
		
		JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso");
		
		return ;
	}
	
}
