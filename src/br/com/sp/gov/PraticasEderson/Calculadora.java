package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("       Calculadora         ");
        System.out.println("===========================");
        System.out.println("1 - Soma                  ");
        System.out.println("2 - Subtração              ");
        System.out.println("3 - DivisÃ£o                ");
        System.out.println("4 - Multiplicação          ");
        System.out.println("5 - Ao quadrado            ");
        System.out.println("===========================");
        System.out.println("Escolha a opÃ§Ã£o            ");
        int opcao = teclado.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("====Soma========");
                System.out.println("");
                System.out.println("Digite 1 número");
                int a = teclado.nextInt();
                System.out.println("Digite o 2 número");
                int b = teclado.nextInt();

                int soma = a + b;

                System.out.println("A soma dos valores é:" + soma);
                break;

            case 2:
                System.out.println("======Subtração=========");
                System.out.println("");
                System.out.println("Informe o 1 valor");
                int x = teclado.nextInt();
                System.out.println("informe o 2 valor");
                int y = teclado.nextInt();

                int sub = x - y;
                System.out.println("A subtração dos valores é:" + sub);
                break;

            case 3:
                System.out.println("=======Divisão=============");
                System.out.println("");
                System.out.println("Informe o 1 valor");
                int n1 = teclado.nextInt();
                System.out.println("Informe o 2 valor");
                int n2 = teclado.nextInt();

                double div = n1 / n2;
                System.out.println("A divisão dos valores é:" + div);
                break;

            case 4:

                System.out.println("==========Multiplicação=======");
                System.out.println("");
                System.out.println("Informe o 1 valor");
                int v1 = teclado.nextInt();
                System.out.println("Informe o 2 valor");
                int v2 = teclado.nextInt();

                int multi = v1 * v2;
                System.out.println("A multiplicação dos valores é:" + multi);
                break;

            case 5:
                System.out.println("==========Ao quadrado============");
                System.out.println("");
                System.out.println("Informe o valor");
                int valor1 = teclado.nextInt();

                double quadrado = valor1 * 2;

                System.out.println("O valor digitado ao quadrado é:" + quadrado);
                break;

                
        }
        teclado.close();
    }
}
