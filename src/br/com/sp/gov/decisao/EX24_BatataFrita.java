package br.com.sp.gov.decisao;
import java.util.Scanner;

public class EX24_BatataFrita {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
       
       
       System.out.println("Digite a senha:");
       String senha=teclado.next();
       
        if(senha.equals("batatafrita")) {
            
            System.out.println("Acesso permitido");
            
            
            
            
        }else{
            
            System.out.println("Você não tem acesso ao sistema");
            
            teclado.close();
            System.exit(0);
        }
        
        
        
    }
}
