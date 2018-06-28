package br.com.sp.gov.Locadora;

import java.sql.SQLException;

public class LocadoraTeste {
	
	public void CRUDLocadora(){
		
		
		try {
			
			LocadoraVO locadoraVO = new LocadoraVO();
			locadoraVO=populaLocadora();
			LocadoraDAO locadoraDAO = new LocadoraDAO();
			locadoraDAO.inserirLocadora(locadoraVO);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}



	private LocadoraVO populaLocadora(){
	
	LocadoraVO l=new LocadoraVO();
	l.setCodigo(1);
	l.setNome("Vingadores: Guerra Infinita");
	l.setGenero("Ação");
	l.setData_lancamento("110518");
	return l;
	
}
}