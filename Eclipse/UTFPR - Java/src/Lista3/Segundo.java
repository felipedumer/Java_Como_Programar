package Lista3;

import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a frase desejada: ");
		String frase = input.nextLine();
		
		char[] fraseChar = new char[frase.length()];
		frase.getChars(0, frase.length(), fraseChar, 0);
		
		for (int count = fraseChar.length - 1; count >= 0; count--)
			System.out.printf("%c", fraseChar[count]);
		}

}
