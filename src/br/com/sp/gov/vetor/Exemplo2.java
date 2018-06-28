package br.com.sp.gov.vetor;

//import java.util.Random;

import javax.swing.JOptionPane;

public class Exemplo2 {

    public static void main(String[] args) {

        int[] vet = new int[10];
        String mensagem = "";
   

        //Random random = new Random();

        for (int i = 0; i < vet.length; i++) {
            String txt = JOptionPane.showInputDialog("Informe o" + (i + 1) + "valor:");
             vet[i]= Integer.parseInt(txt);
            
        }
       // String txt1 = String.valueOf(10);//
        
        
        for (int i = 0; i < vet.length; i++) {
            mensagem+=(i+1)+ "-" +vet[i]+"\n";
            
         

        }
        JOptionPane.showInputDialog(null,mensagem);
        
        
        System.exit(0);
        
    }
}
