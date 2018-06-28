package br.com.sp.gov.mercado;

public class ProdutoTeste {

	
	public void CRUDProduto(){
		
		try {
			ProdutoVO produtoVO = new ProdutoVO();
			produtoVO= populaProduto();
			ProdutoDAO produtoDAO = new ProdutoDAO();
			produtoDAO.inserirProduto(produtoVO);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	private ProdutoVO populaProduto(){
		ProdutoVO p = new ProdutoVO();
		p.setCodigo(1);
		p.setNome("Coca-Cola");
		p.setTipo("Refrigerante");
		p.setValidade(110519);
		return p;
		
		
		
	}
	
	
}
