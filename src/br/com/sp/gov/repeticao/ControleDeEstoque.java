package br.com.sp.gov.repeticao;

import java.util.Scanner;

public class ControleDeEstoque {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double prodcusto = 0, prodv = 0,mcusto = 0, mvenda = 0;
		
		
	for (int i = 0; i <=40 ; i++) {
		
		
	System.out.println("Informe o nome do produto : ");
        
		String nome=teclado.next();
        
		System.out.println("Informe o preço de custo : ");
		
		prodcusto =teclado.nextDouble();
		
		System.out.println("Informe o preço de venda : ");
		 	
                prodv = teclado.nextDouble();
		 	
		 	mvenda = prodv + mvenda /40;
		 	mcusto = prodcusto + mcusto /40;
    
		if (prodcusto < prodv) {
			
		System.out.println("Produto : " + nome );
		System.out.println("Houve lucro "  );

		}else if (prodcusto > prodv ) {
			
			System.out.println("Produto : " + nome );
			System.out.println("Houve Prejuizo"  );
			
		}else {
			
			System.out.println("Produto : " + nome );
			System.out.println("Houve Empate "  );
		}
	}
		
		teclado.close();
		System.exit(0);
	}

}