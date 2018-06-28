package br.com.sp.gov.matriz;

import javax.swing.JOptionPane;

public class Ex04Mat {

    public static void metodo() {
        String mat[][] = new String[10][3];


        for (int linha = 0; linha < 10; linha++) {

            mat[linha][0] = JOptionPane.showInputDialog("Informe o " +  (linha + 1)  + (0 + 1)  + "nome: ");

            mat[linha][1] = JOptionPane.showInputDialog("Informe o "  + (linha + 1)  + (1 + 1)  + "telefone:");

            mat[linha][2] = JOptionPane.showInputDialog("Informe o " +  (linha + 1) + + (2 + 1)  + "Endereco:");
        }

        String PesquisaNome = JOptionPane.showInputDialog("Informe o nome para pesquisa");

        for (int linha = 0; linha < 10; linha++) {
            if (mat[linha][0].equals(PesquisaNome)) {
                JOptionPane.showMessageDialog(null, "Nome: " + mat[linha][0] + "Endereco: " + mat[linha][1] + "Telefone: " + mat[linha][2]);
            }
        }

    }
}
