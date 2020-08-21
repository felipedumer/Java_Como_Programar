package Lista2;

import java.security.SecureRandom;

public class Segundo {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		int[] veta = new int[8]; 
		int[] vetb = new int[8];
	
		for (int i = 1; i < veta.length; i++)
		{
			veta[i] = randomNumbers.nextInt(100);
			if (veta[i] % 2 == 0)
			{
				vetb[i] = 1;
			}
			else 
			{
				vetb[i] = 0;
			}
		}
		
		System.out.printf("%n Vetor A = {");
		for (int i : veta)
		{
			System.out.printf("%d, ", i);
		}
		System.out.printf("}%n Vetor B = {");
		for (int i : vetb)
		{
			System.out.printf("%d, ", i);
		}
		
		System.out.printf("}%n");
	}

}
