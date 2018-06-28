package br.com.sp.gov.repeticao;

import java.util.Scanner;

public class CienciaDaComputacao {

    public static void main(String[] args) {

        double nf = 0;

        Scanner teclado = new Scanner(System.in);

        int resp = 0;

        do {
            System.out.println("Informe o nome do aluno ");

            String nome = teclado.next();

            do {
                System.out.println("Informe as notas do Aluno " + nome + "Nas seguintes atividades");

                System.out.println("Nota no Laboratorio:");
                double lab = teclado.nextDouble();

                System.out.println("Nota na Avaliação");

                double ava = teclado.nextDouble();

                System.out.println("Nota no Exame");
                double exa = teclado.nextDouble();

                lab = (2 / 10) * lab;
                ava = (3 / 10) * ava;
                exa = (5 / 10) * exa;
                nf = ava + lab + exa;

            } while (nf > 10);
            System.out.println("Aluno :" + nome);
            System.out.println("Nota final : " + nf);
            System.out.println(" ");
            System.out.println("Deseja continuar ? 1-Sim 2-NÃ£o");
            resp = teclado.nextInt();

        } while (resp == 1);

        teclado.close();
    }
}
