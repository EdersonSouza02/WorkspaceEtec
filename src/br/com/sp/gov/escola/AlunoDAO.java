package br.com.sp.gov.escola;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {

	public Connection connection;

	public AlunoDAO() throws SQLException {
		connection = DAOFactory.getConnection();
	}

	public void InserirAluno(AlunoVO alunoVO) throws SQLException {
		int parameterIndex = 1;
		PreparedStatement preparedStatement = this.connection.prepareStatement(buscaComandoInsert());
		preparedStatement.setInt(parameterIndex++, alunoVO.getRm());
		preparedStatement.setString(parameterIndex++, alunoVO.getNome());
		preparedStatement.setString(parameterIndex++, alunoVO.getEndereco());
		preparedStatement.setInt(parameterIndex++, alunoVO.getIdade());
		preparedStatement.execute();
	}

	private String buscaComandoInsert() {
		return "Insert into aluno(rm,nome,endereco,idade) values(???)";

	}
}
