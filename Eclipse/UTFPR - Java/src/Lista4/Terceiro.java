package Lista4;

import java.util.Scanner;

public class Terceiro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o lado do quadrado: ");

		int lado = input.nextInt();

		System.out.printf("%nLado: %d", area(lado));
		System.out.printf("%nPerimetro: %d", perimetro(lado));
		System.out.printf("%nDiagonal: %d", diagonal(lado));
	}
	
	
	public static int area(int lado)
	{
		lado *= lado;
		
		return lado;
	}
	
	public static int perimetro(int lado)
	{
		lado *= 4;
		
		return lado;
	}
	
	public static int diagonal(int lado)
	{
		lado = (int) (lado * (Math.sqrt(2)));
		
		return lado;
	}

}
