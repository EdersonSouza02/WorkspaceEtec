package br.com.sp.gov.condicional;

import java.util.Scanner;

public class ClubeDeFutebol {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome = " ";
        int idade = 0;

        System.out.println("Informe o nome do atleta : ");
        nome = teclado.next();

        System.out.println("Informe a idade : ");
        idade = teclado.nextInt();

        if (idade >= 5 && idade <= 10) {

            System.out.println("Nome : " + nome);
            System.out.println("Idade : " + idade);
            System.out.println("Categoria : Infantil ");

        } else if (idade >= 11 && idade <= 15) {

            System.out.println("Nome : " + nome);
            System.out.println("Idade : " + idade);
            System.out.println("Categoria : Juvenil ");

        } else if (idade >= 16 && idade <= 20) {

            System.out.println("Nome : " + nome);
            System.out.println("Idade : " + idade);
            System.out.println("Categoria : Junior ");

        } else if (idade >= 21 && idade <= 25) {

            System.out.println("Nome : " + nome);
            System.out.println("Idade : " + idade);
            System.out.println("Categoria : Profissional ");

        } else {

            System.out.println("Categoria inválida !!");
        }

        teclado.close();
        System.exit(0);
    }

}
