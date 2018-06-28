package br.com.sp.gov.repeticao;
import java.util.Scanner;
public class MediaAlunos {
	
	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		
		
		int des = 0;
		do { 
		
		
		System.out.println("Informe a matricula :");
		
		int mat = p.nextInt(); 
		
		System.out.println("Informe as notas do aluno ");
		double a = p.nextDouble(); 
		double b = p.nextDouble(); 
		double c = p.nextDouble(); 
		
		double med = ( a + b + c ) / 3 ; 
		
		System.out.println("matricula : " + mat);
		System.out.println("MEdia : " + med );
		
		
		
		System.out.println("Deseja continuar ? (1) Sim (2)N�o ") ;
		des = p.nextInt();
		
		} while (des  == 1 ) ;  
		
		p.close();
		System.exit(0);
		
	}

}
