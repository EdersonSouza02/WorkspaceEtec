package br.com.sp.gov.PraticasEderson;
import java.util.Scanner;

public class Estoque {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
	double quantidade_minima, quantidade_maxima,estoque_medio;
	
	System.out.print("Calculadora de Estoque Médio");
	
	System.out.print("Digite a quantidade mímima:");
	quantidade_minima = teclado.nextDouble();
	
	System.out.print("Digite a quantidade máxima:");
	quantidade_maxima = teclado.nextDouble();
	estoque_medio = (quantidade_minima + quantidade_maxima ) / 2;
	System.out.print("Estoque Médio é:"+estoque_medio);
	teclado.close();
    }

}