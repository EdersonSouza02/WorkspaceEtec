package br.com.sp.gov.escola;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOFactory {

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/Escola";
		String user = "root";
		String password = "";

		return (Connection) DriverManager.getConnection(url, user, password);

	}
}
