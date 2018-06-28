package br.com.sp.gov.PraticasEderson;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double PrimeiraNota, SegundaNota, TerceiraNota, QuartaNota, RecuperacaoNota, Media;
        boolean Aprovacao = false;



        System.out.print("Digite a primeira nota:  ");
        PrimeiraNota =teclado.nextDouble();

        System.out.print("Digite a segunda nota:  ");
        SegundaNota = teclado.nextDouble();

        System.out.print("Digite a terceira nota:  ");
        TerceiraNota = teclado.nextDouble();

        System.out.print("Digite a quarta nota:  ");
        QuartaNota = teclado.nextDouble();


        Media = (PrimeiraNota + SegundaNota + TerceiraNota + QuartaNota)/4;

        if(Media >= 7) Aprovacao = true;
        else{
          System.out.print("O aluno se fudeu e está de recuperação, digite a nota de recuperação: ");
          RecuperacaoNota = teclado.nextDouble();
          Media = (Media + RecuperacaoNota)/2;
          if(Media >= 7) Aprovacao = true;
        }

        if(Aprovacao == true){
          System.out.println("O Aluno foi aprovado com a média "+Media);
        }else{
          System.out.println("O Aluno se fudeu e  foi reprovado com a média "+Media);
          teclado.close();
        }
}
}
