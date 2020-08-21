package Lista1;
import java.util.Scanner;

public class Quinto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = input.nextInt();
		int[] divisores = new int[numero+1];
		
		for (int i = 1; i <= numero; i++)
		{
			if (numero % i == 0)
			{
				divisores[i] = i;
			}
		}
		
		System.out.printf("Divisores: ");
		for (int counter = 0; counter < divisores.length; counter++)
		{
			if (divisores[counter] != 0)
			{
			System.out.printf("%d ", divisores[counter]);
			}
			
		}
	}
}
