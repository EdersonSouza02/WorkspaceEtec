package br.com.sp.gov.Empresa;

import br.com.sp.gov.TOO.Funcionario;

public class FuncionarioTeste {

	public void CRUDFuncionario(){
		
		try {
			FuncionarioVO funcionarioVO = new FuncionarioVO();
			funcionarioVO=populaFuncionario();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public FuncionarioVO populaFuncionario(){
		FuncionarioVO f = new FuncionarioVO();
		f.setCodigo(1);
		f.setNome("Marcos");
		f.setEndereco("Rua 2");
		f.setCpf("12345");
		f.setRg("1244135");
		return f;
		
		
		
	}
	
	
	
	
}
