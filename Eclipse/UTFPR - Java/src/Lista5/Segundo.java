package Lista5;

import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um n�mero: ");

		int num = input.nextInt();

		ePerfeito(num);
	}
	
	public static void ePerfeito(int num)
	{
		int soma = 0;
		
		for (int i = 1; i < num; i++)
		{
			if (num % i == 0)
			{
				soma += i;
			}
		}
		
		if (num == soma)
		{
			System.out.printf("%nO n�mero %d � perfeito", num);
		}
		else
		{
			System.out.printf("%nO n�mero %d n�o � perfeito", num);
		}
	}

}
