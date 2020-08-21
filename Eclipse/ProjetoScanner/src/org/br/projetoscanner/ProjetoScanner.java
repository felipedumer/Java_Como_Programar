package org.br.projetoscanner;

import java.util.Scanner;

public class ProjetoScanner {

	public static void main(String[] args) {

		System.out.println("------ Menu -------");
		System.out.println("------ Opções -------");		
		System.out.println("1 - Abrir");
		System.out.println("2 - Salvar");
		System.out.println("3 - Fechar");
		System.out.println("------ Opções -------");
		System.out.println("Digita o número da opção desejada: ");

		// Instanciando a classe Scanner
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroOpcao = entrada.nextInt();
		
		System.out.println("--------------------");
		System.out.printf("O Número digitado foi: %d", numeroOpcao);
		
	}

}
