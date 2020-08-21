package Lista3;

import java.util.Scanner;

public class Quinto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Insira a frase desejada: ");
		String frase = input.nextLine();
		
		String[] splitada = frase.split(" ");
		
		for (int count = 0; count < splitada.length; count++)
			{
				System.out.printf("%n%dª Palavra: %s, possui %d caracteres.%n", count+1, splitada[count], splitada[count].length());
			}

	}

}
