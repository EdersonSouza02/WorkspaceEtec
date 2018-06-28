
package br.com.sp.gov.condicional;

import java.util.Scanner;

public class AumentoSalarial {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double salario = 0;
		double salarioFim = 0;

		
		System.out.println("Informe seu Salario atual : ");
		salario = teclado.nextDouble();

		if (salario <= 600) {

			salarioFim = (salario * 0.30) + salario;

		} else if (salario >= 600.01 && salario <= 1100) {
			salarioFim = (salario * 0.25) + salario;

		} else if (salario >= 1100.01 && salario <= 2400) {
			salarioFim = (salario * 0.20) + salario;

		} else if (salario >= 2400.01) {
			salarioFim = (salario * 0.25) + salario;

		}

		System.out.println("O seu novo salario ser de : " + salarioFim + " R$ ");
		teclado.close();
		System.exit(0);
	}

}
