package br.com.sp.gov.decisao;
import java.util.Scanner;

public class Ex_23_NumerosIguais {
 public static void main(String[]args){
    
	 Scanner teclado=new Scanner (System.in);
     
     
     System.out.println("Informe o primeiro n�mero");
     
     int n1=teclado.nextInt();
     
     System.out.println("Informe o segundo n�mero");
     int n2=teclado.nextInt();
     
     
     if(n1!=n2){
     System.out.println("Os N�meros s�o diferentes");
     
     
     
 }else{
         
         System.out.println("Os numeros s�o iguais");
     
         teclado.close();
         System.exit(0);
         
 
 }
     
     
     
     
 }
    
    
}
