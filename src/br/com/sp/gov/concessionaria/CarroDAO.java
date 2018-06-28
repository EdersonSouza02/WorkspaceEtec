package br.com.sp.gov.concessionaria;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class CarroDAO {
	private Connection connection;

	public CarroDAO() throws SQLException {
		this.connection = DAOFactory.getConnection();

	}

	public void inserirCarro(CarroVO carroVO) throws SQLException{
	
		PreparedStatement preparedStatement = this.connection.prepareStatement(buscaComandoInsert());
		int parameterIndex=1;
		preparedStatement.setInt(parameterIndex++, carroVO.getId());
		preparedStatement.setString(parameterIndex, carroVO.getNome());
		preparedStatement.setString(parameterIndex++, carroVO.getMarca());
		preparedStatement.execute();
		
	}
	
	
	
	
	private String buscaComandoInsert() {
	return "insert into Carro (id,nome,marca) values (?,?,?)";

	}
	private String buscaComandoDelete(){
		return "delete from carro where carro.id=?";
		
	}
	
	
	
}
