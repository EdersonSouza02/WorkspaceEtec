package br.com.sp.gov.condicional;

import java.util.Scanner;

public class Times {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String time1, time2 = "";
		int gol1, gol2 = 0;

		System.out.println("Informe o nome do 1° time");
		time1 = teclado.next();

		System.out.println("Informe o nº de gols do 1° time");
		gol1 = teclado.nextInt();

		System.out.println("Informe o nome do 2º time ");
		time2 = teclado.next();

		System.out.println("Informe o nº de gols do 2º time");
		gol2 = teclado.nextInt();

		if (gol1 > gol2) {
			System.out.println("Vencedor : " + time1);
			System.out.println("Gol(s) :" + gol1);

		} else if (gol2 > gol1) {
			System.out.println("Vencedor : " + time2);
			System.out.println("Gol(s) :" + gol2);

		} else {
			System.out.println("empate :" + gol1 + " X " + gol2);
		}

		teclado.close();
		System.exit(0);

	}

}
