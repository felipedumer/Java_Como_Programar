package Lista3;

import java.util.Scanner;

public class Terceiro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a frase desejada: ");
		String frase = input.nextLine();
	
		boolean ehex = frase.matches("^[0-9A-F]+");
		
		System.out.printf("%nA string é Hexadecimal: %B", ehex);
	}

}
