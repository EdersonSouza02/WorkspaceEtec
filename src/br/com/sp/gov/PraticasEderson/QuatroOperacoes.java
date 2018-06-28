package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class QuatroOperacoes {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        System.out.println("Informe o 1 valor");
        int a = t.nextInt();

        System.out.println("Informe o 2 valor");
        int b = t.nextInt();

        int soma = a + b;
        int sub = a - b;
        double div = a / b;
        int multi = a * b;

        System.out.println("A soma dos valores é:" + soma);
        System.out.println("A subtração dos valores é:" + sub);
        System.out.println("A divisão dos valores é:" + div);
        System.out.println("A multiplicação dos valores é" + multi);

        t.close();
    }
    
}
