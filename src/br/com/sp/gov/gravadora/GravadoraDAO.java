package br.com.sp.gov.gravadora;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GravadoraDAO {

	public List<GravadoraVO> buscarGravadoras() throws SQLException {

		List<GravadoraVO> lista = new ArrayList<GravadoraVO>();

		String comandoSql = "SELECT codigo_gravadora  , " + "       nome_gravadora    , "
				+ "       endereco_gravadora, " + "       telefone_gravadora, " + "       contato_gravadora , "
				+ "       url_gravadora       " + "  FROM gravadora";

		Connection conexao = FabricaDeConexao.criarConexao();

		PreparedStatement prepareStatement = conexao.prepareStatement(comandoSql);
		ResultSet resultSet = prepareStatement.executeQuery();

		while (resultSet.next()) {
			GravadoraVO gravadoraVO = new GravadoraVO();
			gravadoraVO.setCodigoGravadora(resultSet.getInt("codigo_gravadora"));
			gravadoraVO.setNomeGravadora(resultSet.getString("nome_gravadora"));
			gravadoraVO.setEnderecoGravadora(resultSet.getString("endereco_gravadora"));
			gravadoraVO.setTelefoneGravadora(resultSet.getString("telefone_gravadora"));
			gravadoraVO.setContatoGravadora(resultSet.getString("contato_gravadora"));
			gravadoraVO.setUrlGravadora(resultSet.getString("url_gravadora"));
			lista.add(gravadoraVO);
		}
		return lista;
	}

	public GravadoraVO buscarGravadoraPorId(int codigoGravadora) throws SQLException {
		GravadoraVO gravadoraVO = new GravadoraVO();
		String comandoSql = "SELECT codigo_gravadora  , " + "       nome_gravadora    ,  "
				+ "       endereco_gravadora,  " + "       telefone_gravadora,  " + "       contato_gravadora ,  "
				+ "       url_gravadora        " + "  FROM gravadora            " + " WHERE codigo_gravadora = ? ";
		Connection conexao = FabricaDeConexao.criarConexao();
		PreparedStatement prepareStatement = conexao.prepareStatement(comandoSql);
		prepareStatement.setInt(1, codigoGravadora);
		ResultSet resultSet = prepareStatement.executeQuery();
		if (resultSet.next()) {
			gravadoraVO.setCodigoGravadora(resultSet.getInt("codigo_gravadora"));
			gravadoraVO.setNomeGravadora(resultSet.getString("nome_gravadora"));
			gravadoraVO.setEnderecoGravadora(resultSet.getString("endereco_gravadora"));
			gravadoraVO.setTelefoneGravadora(resultSet.getString("telefone_gravadora"));
			gravadoraVO.setContatoGravadora(resultSet.getString("contato_gravadora"));
			gravadoraVO.setUrlGravadora(resultSet.getString("url_gravadora"));
		}
		return gravadoraVO;
	}

	public List<GravadoraVO> buscarGravadora(GravadoraVO gravadoraVO) throws SQLException {
		
		boolean montaWhere = true;
		List<GravadoraVO> lista = new ArrayList<GravadoraVO>();
		
		Connection conexao = FabricaDeConexao.criarConexao();

		String comandoSql = "SELECT codigo_gravadora, " + 
	                "       nome_gravadora    ,  " +
		            "       endereco_gravadora,  " +
	                "       telefone_gravadora,  " +
		            "       contato_gravadora ,  " +
	                "       url_gravadora        " +
		            "  FROM gravadora            ";
		
		comandoSql = montaComando(gravadoraVO, montaWhere, comandoSql);
		
		PreparedStatement preparedStatement = preparaComando(gravadoraVO, conexao, comandoSql);
		
		
		executa(lista, comandoSql, preparedStatement);
		return lista;
		
		
	}

	private void executa(List<GravadoraVO> lista, String comandoSql, PreparedStatement preparedStatement)
			throws SQLException {
		ResultSet resultSet= preparedStatement.executeQuery(comandoSql);
		while(resultSet.next()) {
			GravadoraVO vo = new GravadoraVO();
			vo.setCodigoGravadora(resultSet.getInt("codigo_gravadora"));
			vo.setNomeGravadora(resultSet.getString("nome_gravadora"));
			vo.setEnderecoGravadora(resultSet.getString("endereco_gravadora"));
			vo.setTelefoneGravadora(resultSet.getString("telefone_gravadora"));
			vo.setContatoGravadora(resultSet.getString("contato_gravadora"));
			vo.setUrlGravadora(resultSet.getString("url_gravadora"));
			lista.add(vo);
		}
	}

	private PreparedStatement preparaComando(GravadoraVO gravadoraVO, Connection conexao, String comandoSql)
			throws SQLException {
		PreparedStatement preparedStatement = conexao.prepareStatement(comandoSql);
		int indice=1;
		
		if(gravadoraVO.getCodigoGravadora()!=0) {
			preparedStatement.setInt(indice++,gravadoraVO.getCodigoGravadora());
		}
		if(gravadoraVO.getNomeGravadora()!=null) {
			preparedStatement.setString(indice++,gravadoraVO.getNomeGravadora());
			
		}
		if(gravadoraVO.getEnderecoGravadora()!=null) {
			preparedStatement.setString(indice++,gravadoraVO.getNomeGravadora());
		}	
		if(gravadoraVO.getTelefoneGravadora()!=null) {
			preparedStatement.setString(indice++,gravadoraVO.getNomeGravadora());
		}
		return preparedStatement;
	}

	private String montaComando(GravadoraVO gravadoraVO, boolean montaWhere, String comandoSql) {
		if(gravadoraVO.getCodigoGravadora()!=0) {
			comandoSql += " WHERE codigo_gravadora = ? ";
			montaWhere = false;
		}
		if(gravadoraVO.getNomeGravadora() !=null) {
			if(montaWhere) {
			comandoSql+="Where nome_gravadora=?";
		}else {
			comandoSql+="AND nome_gravadora=?";
		}
		}
		
		if(gravadoraVO.getEnderecoGravadora()!=null) {
			if(montaWhere) {
				comandoSql+="Where endereco_gravadora=?";
				montaWhere = false;
			}else {
				comandoSql+="and endereco_gravadora=?";
			}
			}
			
		if(gravadoraVO.getTelefoneGravadora()!=null) {
			if(montaWhere) {
				comandoSql+="Where telefone_gravadora=?";
				montaWhere = false;
				
			}else {
				comandoSql+="and telefone_gravadora=?";
			}
		}
		
			if(gravadoraVO.getContatoGravadora()!=null) {
				if(montaWhere) {
					comandoSql+="Where contato_gravadora=?";
					montaWhere = false;
			}else {
				comandoSql+="and contato_gravadora=?";
			}
			}	
		if(gravadoraVO.getUrlGravadora()!=null) {
			if(montaWhere) {
				comandoSql+="Where url_gravadora=?";
				montaWhere = false;
		}else {
			comandoSql+="and url_gravadora=?";
		
		}
		
		}
		return comandoSql;
	}
}
	
