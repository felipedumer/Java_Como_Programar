package com.br.cap6;

public class Scope {
	// o campo acess�vel para todos os m�todos dessa classe
	private static int x = 1;
	
	// o m�todo main cria e inicializa a vari�vel local x
	// e chama os m�todos useLocalVariable e useField
	public static void main(String[] args) {
		int x = 5; // vari�vel local x do m�todo sombreia o campo x
		
		System.out.printf("local x in main is %d%n", x);
		
		useLocalVariable(); // useLocalVariable tem uma vari�vel local x
		useField(); // useField utiliza o campo x da classe Scope
		useLocalVariable(); // useLocalVariable reinicializa a vari�vel local x
		useField(); // campo x da classe Scope ret�m seu valor
		
		System.out.printf("%nlocal x in main is %d%n", x);
	}

	// cria e inicializa a vari�vel local x durante cada chamada
	public static void useLocalVariable()
	{
		int x = 25; // inicializada toda vez que useLocalVariable � chamado
		System.out.printf(
				"%nlocal x on entering method useLocalVarible is %d%n", x);
	++x; // modifica a vari�vel local x desse m�todo
	System.out.printf(
			"local x before exiting method useLocalVariable is %d%n", x);
	}
	
	// modifica o campo x da classe Scope durante cada chamada
	public static void useField()
	{
		System.out.printf(
				"%nfield x on entering method useField is %d%n", x);
		x *= 10; // modifica o campo x da classe Scope
		System.out.printf(""
				+ "field x before exiting method useField is %d%n", x);
	}
}
