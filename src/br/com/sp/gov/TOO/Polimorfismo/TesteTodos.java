package br.com.sp.gov.TOO.Polimorfismo;

public class TesteTodos {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.circular();
		animal.comer();
		animal.dormir();
		animal.fazerRuido();
		
		System.out.println("===============================");

		Canino canino = new Canino();
		canino.circular();
		canino.comer();
		canino.dormir();
		canino.fazerRuido();		
		System.out.println("===============================");
		
		Felino felino = new Felino();
		felino.circular();
		felino.comer();
		felino.dormir();
		felino.fazerRuido();
		System.out.println("===============================");

		Lobo lobo = new Lobo();
		lobo.circular();
		lobo.comer();
		lobo.fazerRuido();
		lobo.dormir();
		System.out.println("===============================");
		
		Cachorro cachorro = new Cachorro();
		cachorro.fazerRuido();
		cachorro.comer();
		cachorro.circular();
		cachorro.dormir();

		System.out.println("===============================");
		
		Gato gato = new Gato();
		gato.comer();
		gato.fazerRuido();
		gato.circular();
		gato.dormir();

		System.out.println("===============================");
		
		Tigre tigre = new Tigre();
		tigre.comer();
		tigre.fazerRuido();
		tigre.circular();
		tigre.dormir();

		System.out.println("===============================");
		
		Leao leao = new Leao();
		leao.fazerRuido();
		leao.comer();
		leao.circular();
		leao.dormir();
		
		System.out.println("=================================");
		
		
		Biologo biologo = new Biologo();
		biologo.observaCircular(animal);
		biologo.observaCircular(canino);
		biologo.observaCircular(felino);
		biologo.observaCircular(lobo);
		biologo.observaCircular(cachorro);
		biologo.observaCircular(gato);
		biologo.observaCircular(tigre);
		biologo.observaCircular(leao);

	}

}
