package br.com.sp.gov.TOO.Polimorfismo;

public class DvdTeste {

	public static void main(String[] args) {
		
	Dvd d = new Dvd();
	d.setCensura("censura");
	d.setDescricao("descrição");
	d.setDuracao("druacao");
	d.setDvd("dvd");
	d.setEstoquedisponivel(100);
	d.setGenero("genero");
	d.setPrecoCusto(100);
	
	d.comprar(20);
	d.vender(20);
	
	System.out.println(d.CalcularPrecoVenda());
	System.out.println(d.CalcularPrecoVenda(3.5));
	System.out.println(d.getCensura());
	System.out.println(d.getDescricao());
	System.out.println(d.getDuracao());
	System.out.println(d.getDvd());
	System.out.println(d.getEstoquedisponivel());
	System.out.println(d.getGenero());
	System.out.println(d.getPrecoCusto());

	
	}
	
	
}
