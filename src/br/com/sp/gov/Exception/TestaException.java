package br.com.sp.gov.Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestaException {

	public static void main(String[] args) {
		
		try {
			metodo1();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	private static void metodo1() throws IOException {
		metodo2();
		
	}
	private static void metodo2() throws IOException {
		metodo3();

}
	private static void metodo3() throws IOException{
		FileWriter file=new FileWriter(new File(""));
		metodo4();

}
	private static void metodo4() {
		
		try {
			metodo5();
		} catch (RuntimeException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
	private static void metodo5() throws Exception {
		int a =10;
		int b = 1;
		String nome="a";
		int x;
		
		try {
			x=Integer.parseInt(nome);
		} catch (EdersonException e) {
			throw new NumberFormatException(e.getMessage());
		}
		
		
		System.out.println(x);
		int divisao=a/b;
		System.out.println(divisao);
		
		//try {
		//}catch(RuntimeException e1) {
		//System.out.println("Erro ao executar o método"+e1.getMessage());
		
		
		
		
		
		
		
			
		}
		
		
}



