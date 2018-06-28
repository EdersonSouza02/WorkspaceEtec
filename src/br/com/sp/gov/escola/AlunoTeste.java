package br.com.sp.gov.escola;

import java.sql.SQLException;

public class AlunoTeste {

	public void CRUDAluno() {

		try {
			AlunoVO alunoVO = new AlunoVO();
			alunoVO = populaAluno();
			AlunoDAO alunoDAO = new AlunoDAO();
			alunoDAO.InserirAluno(alunoVO);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private AlunoVO populaAluno() {
		AlunoVO a = new AlunoVO();
		a.setRm(1);
		a.setNome("Francisco");
		a.setIdade(25);
		a.setEndereco("Rua José Albino");
		return a;

	}

}
