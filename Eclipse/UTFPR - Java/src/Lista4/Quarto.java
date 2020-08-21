package Lista4;

import java.util.Scanner;

public class Quarto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o tamanho do quadrado: ");

		double quadrado = input.nextDouble();
		int lado = (int) Math.sqrt(quadrado);
		
		System.out.printf("%nLado do quadrado: %d", lado);
		System.out.printf("%nArea: %d", Terceiro.area(lado));
		System.out.printf("%nPerimetro: %d", Terceiro.perimetro(lado));
		System.out.printf("%nDiagonal: %d", Terceiro.diagonal(lado));
	}

}
