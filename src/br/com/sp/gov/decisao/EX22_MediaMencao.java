package br.com.sp.gov.decisao;
import java.util.Scanner;

public class EX22_MediaMencao {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        
        double media;
        
        System.out.println("Informe o nome do aluno");
        String nome=teclado.next();
        
        System.out.println("Informe a primeira nota do"+nome);
        double nota1=teclado.nextDouble();
        
        System.out.println("Informe a segunda nota do"+nome);
        double nota2=teclado.nextDouble();
  
        System.out.println("Informe a terceira nota do"+nome);
        double nota3=teclado.nextDouble();
        
        System.out.println("O nome do aluno é:"+nome);
      
        media=(nota1+nota2+nota3)/3;
        
        
        if(media>=7){
            System.out.println("O aluno:"+nome+"Teve media de:"+media+" e está aprovado");
            
            
        if(media<=5)
            System.out.println("O aluno:"+nome+"Teve media de:"+media+" e está reprovado");
                    
                    
                  teclado.close();
                  System.exit(0);
        }
            
        }
        
        
        
        
    }
   

