package br.com.sp.gov.Locadora;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;


public class LocadoraDAO {

	private Connection connection;
	
	public LocadoraDAO() throws SQLException{
		this.connection=DAOFactory.getConnection();
		
	}
	public void inserirLocadora(LocadoraVO locadoraVO) throws SQLException{
		PreparedStatement preparedStatement = this.connection.prepareStatement(buscaComandoInsert());
		int parameterIndex=1;
		preparedStatement.setInt(parameterIndex++, locadoraVO.getCodigo());
		preparedStatement.setString(parameterIndex++, locadoraVO.getNome());
		preparedStatement.setString(parameterIndex++, locadoraVO.getGenero());
		preparedStatement.setString(parameterIndex++, locadoraVO.getData_lancamento());
		
		
		
	}
	
	
	
	


private String buscaComandoInsert(){
	return "insert into Locadora(codigo,nome,genero,data_lancamento) values(???)";
	
	
}
}
