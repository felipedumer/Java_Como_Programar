package cap14;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence and press Enter");
		String sentence = scanner.nextLine();
		
		// processa a frase do usuário
		String[] tokens = sentence.split(" ");
		System.out.printf("Number of elements: %s%nThe tokenss are:%n",
				tokens.length);
		
		for (String token : tokens)
			System.out.println(token);
	}

}
