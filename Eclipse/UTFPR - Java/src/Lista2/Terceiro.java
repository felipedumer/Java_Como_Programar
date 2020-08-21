package Lista2;

import java.util.Scanner;

public class Terceiro {

	public static void main(String[] args) {
		double[] notaa = new double[11];
		double[] notab = new double[notaa.length];
		double[] result = new double[notaa.length];
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i < notaa.length; i++)
		{
			System.out.printf("Insira 1ª nota do aluno n: %d: ", i);
			notaa[i] = entrada.nextDouble();
			System.out.printf("Insira 2ª nota do aluno n: %d: ", i);
			notab[i] = entrada.nextDouble();
			
			result[i] = (notaa[i] + notab[i]) / 2;
		}
		
		for (int i =1; i <result.length; i++)
		{
			System.out.printf("Aluno n: %d%nNota: %.2f. ", i, result[i]);
			
			if (result[i] >= 6.0)
			{
				System.out.printf("Aprovado%n");
			}
			else
			{
				System.out.printf("Reprovado%n");
			}
		}
	}

}
