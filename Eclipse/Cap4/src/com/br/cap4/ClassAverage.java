package com.br.cap4;
import java.util.Scanner; // programa utiliza a classe Scanner

public class ClassAverage {

	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// fase de inicializa��o
		int total = 0; // inicializa a soma das notas inseridas pelo usu�rio
		int gradeCounter = 1; // inicializa n� da nota a ser inserido em seguida
	
		// fase de processamento utiliza repeti��o controlada por contador
		
		while (gradeCounter <= 10) // faz o loop 10 vezes
		{
			System.out.print("Enter grade: "); // prompt
			int grade = input.nextInt(); // insere a pr�xima nota
			total = total + grade; // adiciona grade a total
			gradeCounter = gradeCounter +1; // incrementa o contador por 1
		}
	
		// fase de t�rmino
		int average = total / 10; // divis�o de inteiros produz um resultado inteiro
		
		// exibe o total e a m�dia das notas
		System.out.printf("%nTotal of all 10 grades is %s%n", total);
		System.out.printf("Class average is %d%n", average);
	}

}
