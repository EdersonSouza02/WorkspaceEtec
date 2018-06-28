package br.com.sp.gov.gravadora;

import java.sql.SQLException;
import java.util.List;

public class GravadoraMain {

	public static void main(String[] args) {

		try {
			GravadoraDAO gravadoraDAO = new GravadoraDAO();
			List<GravadoraVO> lista = gravadoraDAO.buscarGravadoras();
			for(GravadoraVO vo : lista) {
				System.out.println("Codigo   : " + vo.getCodigoGravadora());
				System.out.println("Nome     : " + vo.getNomeGravadora());
				System.out.println("Endereço : " + vo.getEnderecoGravadora());
				System.out.println("Telefone : " + vo.getTelefoneGravadora());
				System.out.println("Contato  : " + vo.getContatoGravadora());
				System.out.println("URL      : " + vo.getUrlGravadora());
			}
			
			
			GravadoraVO gravadoraVO = gravadoraDAO.buscarGravadoraPorId(1);
			System.out.println("Codigo   : " + gravadoraVO.getCodigoGravadora());
			System.out.println("Nome     : " + gravadoraVO.getNomeGravadora());
			System.out.println("Endereço : " + gravadoraVO.getEnderecoGravadora());
			System.out.println("Telefone : " + gravadoraVO.getTelefoneGravadora());
			System.out.println("Contato  : " + gravadoraVO.getContatoGravadora());
			System.out.println("URL      : " + gravadoraVO.getUrlGravadora());
			
			GravadoraVO gravadoraVO2 = new GravadoraVO();
			gravadoraVO2.setCodigoGravadora(1);
			gravadoraVO2.setNomeGravadora("EMI");
			gravadoraVO2.setEnderecoGravadora(null);
			gravadoraVO2.setTelefoneGravadora(null);
			gravadoraVO2.setContatoGravadora(null);
			gravadoraVO2.setUrlGravadora(null);
			
			
			List<GravadoraVO> list = gravadoraDAO.buscarGravadora(gravadoraVO2);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}