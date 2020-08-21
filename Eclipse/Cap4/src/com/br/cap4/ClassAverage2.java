package com.br.cap4;
import java.util.Scanner; // programa utiliza a classe Scanner
public class ClassAverage2 {

	public static void main(String[] args) {
		
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// fase de inicializa��o
		
	int total = 0; // inicializa a soma das notas
	int gradeCounter = 0; // inicializa o n� de notas inseridas at� agora
	
	// fase de processamento
	// solicitada entrada e l� a nota do usu�rio
	System.out.print("Enter grade or -1 to quit: ");
	int grade = input.nextInt();
	
			// faz um loop at� ler o valor de sentinela inserido pelo usu�rio
			while (grade != -1)
			{
				total = total + grade; // adiciona grade a total
				gradeCounter = gradeCounter +1; // incrementa conuter
			
				// solicita entrada e l� a pr�xima nota inserida pelo usu�rio
				System.out.print("Enter grade or -1 to quit: ");
				grade = input.nextInt();
			}
	
	// fase de t�rmino
	// se o usu�rio inseriu pelo menos uma nota...
	if (gradeCounter != 0)
	{
		// usa n�mnero com ponto decimal para calcular a m�dia das notas
		double average = (double) total / gradeCounter;
		
		// exibe o total e a m�dia (com dois d�gitos de precis�o)
		System.out.printf("%nTotal of the %d grades entered is %d%n", 
				gradeCounter, total);
		System.out.printf("Class average is %.2f%n", average);
	}
	else // nenhuma nota foi inserida, assim gera ua sa�da da mensagem apropriada
		System.out.println("No grades were entered");
	}

}
