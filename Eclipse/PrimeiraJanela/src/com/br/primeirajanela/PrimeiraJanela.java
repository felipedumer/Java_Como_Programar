package com.br.primeirajanela;

import javax.swing.JOptionPane;

public class PrimeiraJanela {

	public static void main(String[] args) {
		// pede para o usuário inserir seu nome
		String name = JOptionPane.showInputDialog("Qual o seu nome?");
		
		// cria a mensagem
		String message =
			String.format("Bem-vindo(a) %s!", name);
		
		// exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog(null, message);
		
	} // fim de main

} // fim da classe PrimeiraJanela
