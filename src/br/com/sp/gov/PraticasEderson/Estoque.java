package br.com.sp.gov.PraticasEderson;
import java.util.Scanner;

public class Estoque {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
	double quantidade_minima, quantidade_maxima,estoque_medio;
	
	System.out.print("Calculadora de Estoque M�dio");
	
	System.out.print("Digite a quantidade m�mima:");
	quantidade_minima = teclado.nextDouble();
	
	System.out.print("Digite a quantidade m�xima:");
	quantidade_maxima = teclado.nextDouble();
	estoque_medio = (quantidade_minima + quantidade_maxima ) / 2;
	System.out.print("Estoque M�dio �:"+estoque_medio);
	teclado.close();
    }

}