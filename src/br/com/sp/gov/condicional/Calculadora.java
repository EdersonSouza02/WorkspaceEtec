
package br.com.sp.gov.condicional;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double v1 = 0, v2 = 0,total = 0 ;
		int escolha = 0;

		System.out.println("-----------------");
		System.out.println("    Calculadora -");
		System.out.println("1-  Adi��o      ");
		System.out.println("2-  Subtra��o    ");
		System.out.println("3-  Multiplica��o");
		System.out.println("4-  Divis�o      ");
		System.out.println("-----------------");

		escolha = teclado.nextInt();

		if (escolha >= 1 && escolha <= 4) {

			switch (escolha) {

			case 1:
				System.out.println("1 - Adi��o ");

				System.out.println("Informe o valores a ser somados : ");
				v1 = teclado.nextInt();
				System.out.println("+");
				v2 = teclado.nextInt();
				
				total = v1 + v2;  
                                System.out.println(" Valor final : " + total);
                                
				break;

			case 2:
				System.out.println("2 -Susbtra��o ");

				System.out.println("Informe o valores a ser Subtraido : ");
				v1 = teclado.nextInt();
				System.out.println("-");

				v2 = teclado.nextInt();
				total = v1 - v2;  
                                System.out.println(" Valor final : " + total);

				break;
			case 3:
				System.out.println("3 - multiplica��o ");
				System.out.println("Informe o valores a ser multiplicado : ");
				v1 = teclado.nextInt();

				System.out.println("*");

				v2 = teclado.nextInt();
				total = v1 * v2;  
                                System.out.println(" Valor final : " + total);

				break;
			case 4:
				System.out.println("4 - Divis�o ;");

				System.out.println("Informe o valores a ser dividido : ");

				v1 = teclado.nextInt();
				System.out.println("/");

				v2 = teclado.nextInt();
				total = v1 / v2;  
                                
                                System.out.println(" Valor final : " + total);

				break;

			}

			

		} else {
			System.out.println(" Op��o invalida !!");
		}

		teclado.close();
                System.out.println(0);

	}

}

    
    

