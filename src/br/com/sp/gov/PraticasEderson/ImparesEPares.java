package br.com.sp.gov.PraticasEderson;

public class ImparesEPares {

    public static void main(String[] args) {

        for (int cont = 1; cont <= 60; cont++) {
            if (cont % 2 == 0) {
                int multi = cont*cont;
               System.out.println("O número é par"  + cont);
                System.out.println("A multiplicação deste número por ele msm é:"  +  multi);
                System.out.println("");
                
           
            }else{
                int soma=cont+cont;
                System.out.println("O número é impar" + cont);
                System.out.println("A soma deste número por ele msm é" + soma);
                System.out.println("");
                
            }
           
                    
               
            
           
                    
            }

        }

    }



