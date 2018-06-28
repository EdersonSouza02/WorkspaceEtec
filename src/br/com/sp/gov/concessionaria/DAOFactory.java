package br.com.sp.gov.concessionaria;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DAOFactory {

	public static Connection getConnection() throws SQLException{
		String url="jdbc:mysql://localhost:3306/Concessionaria";
		String user="root";
		String password="";
		
		
	return (Connection) DriverManager.getConnection(url, user, password);
		
		
		
	}

	
}
