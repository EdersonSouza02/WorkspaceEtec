package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor");
        int a = teclado.nextInt();
        System.out.println("Informe o segundo valor");
        int b = teclado.nextInt();

        int soma = a + b;

        System.out.println("A soma dos valores é:" + soma);
teclado.close();
    }
}
