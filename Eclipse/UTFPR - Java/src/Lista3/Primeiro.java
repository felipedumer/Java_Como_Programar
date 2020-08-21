package Lista3;
import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {
	
		int qtM = 0, qtN = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a frase desejada: ");
		String frase = input.nextLine();
		
		
		char[] fraseChar = new char[frase.length()];
		frase.getChars(0, frase.length(), fraseChar, 0);
		
		for (char txt : fraseChar)
		{
			if (txt >= 'A' && txt <= 'Z')
			{
				qtM++;
			}
			else if (txt >= '0' && txt <= '9')
			{
				qtN++;
			}
		}
		
		System.out.print(fraseChar);
		System.out.printf("%n%nA Quantidade de caracteres maiúsculos é %d. %nA quantidade de números é: %d.%n", qtM, qtN);
	}

}
