package Lista2;
import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {
		int[] veta = new int[9];
		int soma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i < veta.length; i++)
		{
			System.out.printf("Insira o n�mero inteiro da posi��o %d: ", i);
			veta[i] = entrada.nextInt();
		}
		
		
		System.out.printf("%n%nOs elementos inseridos nas posi��es �mpares s�o:%n");
		for (int i = 1; i < veta.length; i++)
		{
			if (i % 2 == 1)
			{
				System.out.printf("%d ", veta[i]);
				soma += veta[i];
			}
		}
		
		System.out.printf("%n%nA soma dos elementos �mpares � %d.", soma);
	}

}
