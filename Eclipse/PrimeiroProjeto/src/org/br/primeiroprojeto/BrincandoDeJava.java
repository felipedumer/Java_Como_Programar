package org.br.primeiroprojeto;
import java.util.Scanner;
import java.lang.Math;

public class BrincandoDeJava {

	public static void main(String[] args) {
		System.out.printf("Olá Estranho, digite o seu nome, e a sua idade: ");
		
		
		Scanner entradaa = new Scanner(System.in);
		int a = entradaa.nextInt();
		
		Scanner entradab = new Scanner(System.in);
		int b = entradab.nextInt();
		
		Scanner entradac = new Scanner(System.in);
		int c = entradac.nextInt();
		
		double x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;

		System.out.println(x1);
		
	}


}
