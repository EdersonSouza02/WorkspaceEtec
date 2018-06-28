package br.com.sp.gov.TOO.heranca;

import javax.swing.JOptionPane;

public class ContaJuridicaTeste {

	public static void main(String[] args) {

		ContaJuridica contaJuridica =  new ContaJuridica();
		
	
		
		contaJuridica.setNome("Daniel");
		contaJuridica.setNumero(1958);
		contaJuridica.setCnpj("55545455445" );
		
		
	String aux =	JOptionPane.showInputDialog("Informe o valor do seu saque");
		
		double valor = Double.parseDouble(aux);
		
		contaJuridica.saque(valor);
	}

}
