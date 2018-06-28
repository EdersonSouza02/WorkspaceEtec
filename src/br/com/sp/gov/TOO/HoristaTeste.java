package br.com.sp.gov.TOO;

import br.com.sp.gov.TOO.Polimorfismo.Horista;

public class HoristaTeste {
public static void main(String[] args) {
	
	Horista h = new Horista();
	h.setCpf("54545");
	h.setHorasTrabalhadas(5);
	h.setNome("Ederson");
	h.setSobrenome("Souza");
	h.setPrecoHora(15.5);
	
	
	h.vencimento();
	
	System.out.println("O cpf informado é"+h.getCpf());
	System.out.println("As horas tabalhadas são" + h.getHorasTrabalhadas());
	System.out.println("O nome é " + h.getNome());
	System.out.println("O preço de venda é:" + h.getPrecoHora());
	System.out.println("O sobrenome é:" + h.getSobrenome());
	System.out.println("O vencimento é:" + h.vencimento());
	
	
	
}
	
	
	
}
