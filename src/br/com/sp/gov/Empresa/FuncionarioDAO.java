package br.com.sp.gov.Empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {

	private Connection connection;
	
	public FuncionarioDAO() throws SQLException{
		this.connection=DAOFactory.getConnection();
		
		
	}
	public void InserirFuncionario(FuncionarioVO funcionarioVO) throws SQLException {
	PreparedStatement preparedStatement = this.connection.prepareStatement(buscaComandoInsert());
	int parameterIndex=1;
	preparedStatement.setInt(parameterIndex, funcionarioVO.getCodigo());
	preparedStatement.setString(parameterIndex++, funcionarioVO.getNome());
	preparedStatement.setString(parameterIndex++, funcionarioVO.getEndereco());
	preparedStatement.setString(parameterIndex++, funcionarioVO.getCpf());
	preparedStatement.setString(parameterIndex++, funcionarioVO.getRg());


}
	
	
	
	


private String buscaComandoInsert(){
	return "insert into funcionario (codigo,nome,endereco,cpf,rg)";
	
	
}

}