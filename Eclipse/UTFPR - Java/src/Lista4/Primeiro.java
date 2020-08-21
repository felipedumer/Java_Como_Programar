package Lista4;

import java.util.Scanner;

public class Primeiro {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insira a base e a potência: %n");

		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.printf("%nResultado: %d", elevar(x, y));
}


public static int elevar(int a, int b) {
	int resultado = a;
	
	for (int i = 1; i < b; i++)
	{
		resultado *= a;
	}
	
	return resultado;
}

}