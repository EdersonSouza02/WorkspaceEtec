package br.com.sp.gov.TOO;

import br.com.sp.gov.TOO.Polimorfismo.Assalariado;

public class AssalariadoTeste {

	public static void main(String[] args) {
		
	Assalariado a = new Assalariado();
	a.setCpf("154515");
	a.setNome("João");
	a.setSobrenome("Pedro");
	a.setSalario(100);
	
	
	a.vencimento();
	
	System.out.println(a.getCpf());
	System.out.println(a.getNome());
	System.out.println(a.getSobrenome());
	System.out.println(a.vencimento());
	
	}
	
	
	
}
