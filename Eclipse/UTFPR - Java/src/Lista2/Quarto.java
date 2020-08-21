package Lista2;

import java.util.Scanner;

public class Quarto {

	public static void main(String[] args) {
		int[] veta = new int[8]; 
		int[] vetb = new int[veta.length];

		int somatorio = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i < veta.length; i++)
		{
			System.out.printf("Informe o %do elemento: ", i);
			veta[i] = entrada.nextInt();
			
			somatorio += veta[i];
			vetb[i] = somatorio;
		}
		
		for(int i = 1; i < veta.length; i++)
		{
		System.out.printf("VetA[%d] = %d", i, veta[i]);
		System.out.printf(" VetB[%d] = %d%n", i, (somatorio - vetb[i-1]));
		}
	}

}
