package br.com.sp.gov.mercado;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ProdutoDAO {
	private Connection connection;
	public ProdutoDAO() throws SQLException{
		this.connection=DAOFactory.getConnection();
	
	}
	public void inserirProduto(ProdutoVO produtoVO) throws SQLException{	
		
		PreparedStatement preparedStatement= this.connection.prepareStatement(buscaComandoInsert());
		int parameterIndex=1;
		preparedStatement.setInt(parameterIndex++,produtoVO.getCodigo());
		preparedStatement.setString(parameterIndex++,produtoVO.getNome());
		preparedStatement.setInt(parameterIndex++,produtoVO.getValidade());
		preparedStatement.setString(parameterIndex++,produtoVO.getTipo());
		preparedStatement.execute();
	
	}
	


private String buscaComandoInsert(){
	return "insert into produto (codigo,nome,validade,tipo) values(???)";
	
}
}

