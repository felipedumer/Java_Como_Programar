package cap11;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {

	// demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
	public static int quotient(int numerator, int denominator)
	{
		return numerator / denominator; // possível divisão por zero
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Please enter a integer numerator: ");
				int numerator = scanner.nextInt();
		System.out.printf("Please enter a integer denominator: ");
				int denominator = scanner.nextInt();
		
		int result = quotient(numerator, denominator);
		System.out.printf(
				"%nResult: %d / %d = %d%n", numerator, denominator, result);
	}

}
