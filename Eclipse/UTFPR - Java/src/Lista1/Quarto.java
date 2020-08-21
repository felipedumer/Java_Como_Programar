package Lista1;
import java.util.Scanner;

public class Quarto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe N valores a serem lidos: ");
		int n = input.nextInt();
		int valor, negativos = 0, soma = 0;
		for (int i = 1; i <= n; i++)
		{
			System.out.printf("Informe o %dº valor de %d valores: %n", i, n);
			valor = input.nextInt();
			if (valor < 0)
			{
				++negativos;
			}
			soma += valor;
		}
		System.out.printf("%nResultados:%n");
		System.out.printf("Soma = %d%n", soma);
		System.out.printf("%d números negativos informados%n", negativos);
	}

}
