package br.com.sp.gov.condicional;

import java.util.Scanner;

public class Opcao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a = 0, b = 0, total = 0;
        int opcao = 0;

        System.out.println("-----------------------------------------------------------------");
        System.out.println("-                               Op��o        - ");
        System.out.println("1 - Verificar se um dos n�meros lidos � ou n�o multiplo do outro numero;");
        System.out.println("2 - Verificar se os dois n�meros lidos s�o pares;   ");
        System.out.println("3 - Verificar se a m�dia dos dois n�meross � maior ou igual a 7;");
        System.out.println("4 - Sair");
        System.out.println("-----------------------------------------------------------------");

        opcao = teclado.nextInt();

        if (opcao >= 1 && opcao < 4) {

            switch (opcao) {

                case 1:

                    System.out.println("Informe os Valores : ");

                    a = teclado.nextInt();
                    b = teclado.nextInt();

                    if (a % b <= 0) {

                        total = a * b;
                        System.out.println("Os n�meros s�o multiplos ");

                        System.out.println(" Valor final : " + total);

                    } else {
                        System.out.println(a + " N�o � multiplo de " + b);
                    }

                    break;

                case 2:

                    System.out.println("Informe os Valores : ");

                    a = teclado.nextInt();
                    b = teclado.nextInt();

                    if (a % 2 <= 0) {

                        System.out.println("O valor � Par : " + a);

                    }
                    if (b % 2 <= 0) {
                        System.out.println("O valor � Par : " + b);

                    } else {
                        System.out.println("Nenhum dos n�meros s�o pares !");
                    }

                    break;

                case 3:

                    System.out.println("Informe os valores das notas: ");

                    a = teclado.nextInt();
                    b = teclado.nextInt();

                    total = (a + b) / 2;

                    if (total >= 7) {

                        System.out.println("Media Maior ou igual a 7 ");
                    } else {
                        System.out.println(" A Media menor que 7 ");

                    }
                    break;

                case 4:
                    System.exit(0);

                    break;

            }

        } else {
            System.out.println("Op��o inv�lida");

            
            	teclado.close();
            	System.exit(0);
        }

    }

}
