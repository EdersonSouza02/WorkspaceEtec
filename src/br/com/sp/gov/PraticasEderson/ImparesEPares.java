package br.com.sp.gov.PraticasEderson;

public class ImparesEPares {

    public static void main(String[] args) {

        for (int cont = 1; cont <= 60; cont++) {
            if (cont % 2 == 0) {
                int multi = cont*cont;
               System.out.println("O n�mero � par"  + cont);
                System.out.println("A multiplica��o deste n�mero por ele msm �:"  +  multi);
                System.out.println("");
                
           
            }else{
                int soma=cont+cont;
                System.out.println("O n�mero � impar" + cont);
                System.out.println("A soma deste n�mero por ele msm �" + soma);
                System.out.println("");
                
            }
           
                    
               
            
           
                    
            }

        }

    }



