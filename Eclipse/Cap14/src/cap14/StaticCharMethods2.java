package cap14;

import java.util.Scanner;

public class StaticCharMethods2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// obt�m radical
		System.out.println("Please enter a radix:");
		int radix = scanner.nextInt();
		
		// obt�m a escolha de usu�rio
		System.out.printf("Please choose one:%n1 -- %s%n2 -- %s%n",
				"Convert digit to character", "Convert character to digit");
		int choice = scanner.nextInt();
		
		// processa solicita��o
		switch(choice)
		{
		case 1: // converte d�gito em caractere
			System.out.println("Enter a digit:");
			int digit = scanner.nextInt();
			System.out.printf("Convert digit to character: %s%n",
					Character.forDigit(digit,  radix));
			break;
		
		case 2: // converte caractere em d�gito
			System.out.println("Enter a character:");
			char character = scanner.next().charAt(0);
			System.out.printf("Convert character to digit %s%n",
					Character.digit(character, radix));
		}
	}

}
