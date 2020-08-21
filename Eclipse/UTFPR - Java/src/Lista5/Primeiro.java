package Lista5;

import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um número inteiro: ");
		
		int num = input.nextInt();
		
		System.out.printf("%nO número possui %d dígitos", qtDigitos(num));
		
	}
	
	public static int qtDigitos(int num)
	{
		int digitos = 0;
		
		while (num != 0)
		{
			digitos++;
			
			num /= 10;
		}
		
		return digitos;
	}

}
