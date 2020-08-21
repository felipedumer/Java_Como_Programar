package Lista3;

import java.util.Scanner;

public class Quarto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Insira a frase desejada: ");
		String frase = input.nextLine();
		
		String[] splitada = frase.split(" ");
		
		for (int count = splitada.length - 1; count > splitada.length - 2; count--)
			System.out.printf("%nSeja bem vindo Sr. %s", splitada[count]);
		
	}

}
