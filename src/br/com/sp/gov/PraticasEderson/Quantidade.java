package br.com.sp.gov.PraticasEderson;
import java.util.Arrays;
import java.util.Scanner;

public class Quantidade {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
     
    int[] Numeros = new int[3]; 

  	System.out.print("Ordenador de n�meros\n\n");

    for (int x = 0; x < 3; x++) {
      System.out.print("Digite o "+(x+1)+" n�mero:  ");
      Numeros[x] = teclado.nextInt();
    }

    Arrays.sort(Numeros); 

    System.out.println("Os n�meros em ordem crescente s�o:");
    for (int Numero : Numeros) {
      System.out.println(Numero);
      teclado.close();
    }
}
}
