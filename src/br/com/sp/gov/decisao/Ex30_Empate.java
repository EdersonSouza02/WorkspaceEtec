package br.com.sp.gov.decisao;
import java.util.Scanner;

public class Ex30_Empate {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Informe o nome do primeiro time:");
        String time1=teclado.next();
        
        System.out.println("Informe o numero de gols:");
        int gol1=teclado.nextInt();
        
        System.out.println("Informe o nome do segundo time:");
        String time2=teclado.next();
        System.out.println("Informe o numero de gols:");
        int gol2=teclado.nextInt();
        
        if(gol1>gol2){
            System.out.println("O time"+time1+"Venceu o jogo com"+gol1+"gols");
         
        }
       
        if(gol2>gol1){
            System.out.println("O time"+time2+"Venceu o jogo com"+gol2+"gols");
            
        }
        
        if (gol1==gol2){
            System.out.println("Os times empataram");
            
        teclado.close();
        System.exit(0);
            
            
        }
    }
}

        
    

