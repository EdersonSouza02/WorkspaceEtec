package br.com.sp.gov.TOO.Polimorfismo;

public class ComissionadoTeste {
public static void main(String[] args) {
	
	Comissionado c = new Comissionado();
	c.setCpf("154515");
	c.setNome("Marcos");
	c.setSobrenome("Souza");
	c.setTaxaComissao(0.05);
	c.setTotalVenda(10000.00);
	
	c.vencimento();
	
	System.out.println(c.getCpf());
	System.out.println(c.getNome());
	System.out.println(c.getSobrenome());
	System.out.println(c.getTaxaComissao());
	System.out.println(c.getTotalVenda());
	System.out.println(c.vencimento());
	
	
	
}
	
	
	
	
}
