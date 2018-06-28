package br.com.sp.gov.vetor;


import javax.swing.JOptionPane;

public class Ex05Dados {

	public static void main(String[] args) {
	
		String vetNomes[] = new String[30];
		String vetEndereco[] = new String[30];
		String vetTelefone[] = new String[30];
		
	
		
		
		for(int cont=0;cont<vetNomes.length;cont++) {
		
		vetNomes[cont] = JOptionPane.showInputDialog("Informe o" + (cont+1) +  "nome;");
		
		vetTelefone[cont] = JOptionPane.showInputDialog("Informe o" + (cont+1) + "telefone;");
		
		vetEndereco[cont] = JOptionPane.showInputDialog("Informe o" + (cont+1) +  "Endereco;");
		}

		String nomePesquisado = JOptionPane.showInputDialog("Informe o nome para pesquisa");
		
		for (int cont = 0; cont < vetNomes.length; cont++) {
			
			if(vetNomes[cont].equals(nomePesquisado)) {
				JOptionPane.showMessageDialog(null, "Nome:" + vetNomes[cont] + "Endereco" + vetEndereco[cont] + vetTelefone[cont]);
				
				
				
				
			}
			
		}
		
		
	}

}
