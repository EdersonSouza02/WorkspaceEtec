package br.com.sp.gov.gravadora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {

	public static Connection criarConexao() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/gravadora";
		String usuario = "root";
		String senha = "";
		return DriverManager.getConnection(url, usuario, senha);
	}
	
}
