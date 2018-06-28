package br.com.sp.gov.vetor;

public class Exemplo {

    public static void main(String[] args) {

        int[] vet = new int[10];

        vet[5] = 30;
        vet[6] = 100;

        vet[0] = vet[5] + vet[6];

        for (int indice = 0; indice < vet.length; indice++) {
        System.out.println(vet.toString());

            
        
        }

        System.out.println(vet[0]);

    }

}
