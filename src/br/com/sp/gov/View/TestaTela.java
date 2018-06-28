package br.com.sp.gov.View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TestaTela {

	public static void main(String[] args) {
		JFrame janela = new JFrame();
		janela.setTitle("Minha Primeira Tela");

		JPanel painel = new JPanel();

		JLabel txt1 = new JLabel();
		txt1.setText("Informe seu nome aqui : ");

		JTextField caixaDeTexto = new JTextField(10);

		JButton botaoOk = new JButton();

		botaoOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = caixaDeTexto.getText();
				if (!nome.trim().equals("")) {
					try {

						int valor = Integer.parseInt(nome);
						JOptionPane.showMessageDialog(janela,
								"Favor informar um nome válido, sua aplicação será finalizada por sua culpa.");
						System.exit(0);
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(janela, "Seja bem vindo " + nome);
						caixaDeTexto.setText("");
					}
				} else {
					JOptionPane.showMessageDialog(janela, "Favor informe um nome");

				}
			}
		});
		
		JButton botaoSair = new JButton();
		
		botaoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(janela, "Deseja realmente sair? ");
				System.exit(0);
				
			}
		});
		
		botaoSair.setText("Sair");

		botaoOk.setText("Clique aqui...");
		botaoOk.setToolTipText("Clica logo aqui...");

		painel.add(txt1);
		painel.add(caixaDeTexto);
		painel.add(botaoOk);
		painel.add(botaoSair);
		janela.add(painel);

		janela.setSize(550, 100);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

	}

}
