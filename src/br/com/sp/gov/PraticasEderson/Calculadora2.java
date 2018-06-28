
package br.com.sp.gov.PraticasEderson;
import java.util.Scanner ;  
  
public class Calculadora2 {  
  
    public static void main( String[ ] args ) {  
  
        double n1, n2, soma, divisao, multiplicacao, subtracao ;  
        int operacao = -1 ;  
        int continuar ;  
        boolean reiniciar = true ;   
          
        while ( reiniciar == true ) {  
  
            Scanner teclado = new Scanner( System.in ) ;  
  
            System.out.println( "========== Calculadora ========= " ) ;  
  
            System.out.println( "Digite um número: " ) ;  
            n1 = teclado.nextDouble( ) ;  
            System.out.println( "Digite outro nÃºmero: " ) ;  
            n2 = teclado.nextDouble( ) ;  
  
            while ( operacao < 1 || operacao > 4 ) {  
                System.out.println( "Que operaÃ§Ã£o deseja realizar ? " ) ;  
                System.out.println( "1 - Soma" ) ;  
                System.out.println( "2 - Subtracao" ) ;  
                System.out.println( "3 - DivisÃ£o" ) ;  
                System.out.println( "4 - MultiplicaÃ§Ã£o" ) ;  
  
                System.out.print( "Digite um número da operação:" ) ;  
  
                operacao = teclado.nextInt( ) ;  
  
                if ( operacao == 1 ) {  
                    soma = n1 + n2 ;  
                    System.out.println( "A soma é: " + soma ) ;  
                }  
                if ( operacao == 2 ) {  
                    subtracao = n1 - n2 ;  
                    System.out.println( "A subtração é: " + subtracao ) ;  
                }  
                if ( operacao == 3 ) {  
                    divisao = n1 / n2 ;  
                    System.out.println( "A divião é: " + divisao ) ;  
                }  
                if ( operacao == 4 ) {  
                    multiplicacao = n1 * n2 ;  
                    System.out.println( "A soma é: " + multiplicacao ) ;  
                }  
                System.out.println( "Fazer outro calculo ? " ) ;  
                System.out.println( "1 - para continuar" ) ;  
                System.out.println( "2 - para sair" ) ;  
                continuar = teclado.nextInt( ) ;  
                  
                if( continuar == 1 ){  
                    operacao = -1 ;  
                    System.out.println( "Novo Cálculo!" ) ;  
                    break ;  
                }else{  
                    reiniciar = false ;  
                    System.out.println( "Até a próxima" ) ;  
                }  
                teclado.close();
            }             
        }  
    }  
  
}  
