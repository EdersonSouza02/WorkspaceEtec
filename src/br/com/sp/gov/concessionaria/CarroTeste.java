package br.com.sp.gov.concessionaria;

import java.sql.SQLException;

public class CarroTeste {
	public static void main(String[]args) {
	try {
		
		CarroVO carroVO= new CarroVO();
		CarroDAO carroDAO= new CarroDAO();
		carroVO=populaCarro();
		carroDAO.inserirCarro(carroVO);
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
}
	

	private static CarroVO populaCarro() {
		CarroVO c = new CarroVO();
		c.setId(1);
		c.setNome("Pálio");
		c.setMarca("Fiat");
		return c;
	}
}