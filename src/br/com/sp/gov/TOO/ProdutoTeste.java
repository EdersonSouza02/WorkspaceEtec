package br.com.sp.gov.TOO;

import java.util.Scanner;
public class ProdutoTeste {
   
    public static void main(String[]args){
    
        
        Produto p= new Produto();
        
        Scanner Dados = new Scanner(System.in);
        
        System.out.println("Digite o id:");
        p.setId (Dados.nextInt());
        
        System.out.println("Digite o nome:" );
        p.setNome(Dados.next());
        
        System.out.println("Descição:");
        p.setDescricao (Dados.next());
        
        System.out.println("Digite o valor:");
        p.setValor (Dados.nextDouble());
        
        
        
        
        
        System.out.println("Id:" + p.getId());
        System.out.println("Nome:" +p.getNome());
        System.out.println("Descri��o:"+ p.getDescricao());
        System.out.println("Valor"+ p.getValor());
        
        p.calcular();
        
        
        Dados.close();
        
        
    }

   
    
    }
    


    

