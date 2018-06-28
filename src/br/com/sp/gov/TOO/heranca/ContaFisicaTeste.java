package br.com.sp.gov.TOO.heranca;

import javax.swing.JOptionPane;

public class ContaFisicaTeste {

	public static void main(String[] args) {
		

		ContaFisica contaFisica = new ContaFisica();
		
		contaFisica.setNome("Ederson");
		contaFisica.setNumero(1958456);
		contaFisica.setCpf("55545455445" );
		
		
	String aux =	JOptionPane.showInputDialog("Informe o valor do seu saque");
		
		double valor = Double.parseDouble(aux);
		
		contaFisica.saque(valor);
	}

}
