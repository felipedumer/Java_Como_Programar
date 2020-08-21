package Lista6;

import java.util.Formatter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

public class Primeiro {
	
	private static Formatter saida;
	
	public static void main(String[] args) 
	{

		abrirArquivo();
		
		Scanner input = new Scanner(System.in);
		
		while (true) 
		{
			System.out.print("Insira o lado do quadrado ou pressione 0 para encerrar: ");
			int lado = input.nextInt();
			
			if (lado == 0)
			{
				break;
			}
			
			try 
			{
				saida.format("Lado: %d, Area: %d, Perimetro: %d, Diagonal: %d. %n", lado, area(lado), perimetro(lado), diagonal(lado));
			}
			catch (FormatterClosedException e)
			{
				System.err.println("Erro ao gravar o arquivo");
				break;
			}
			catch (NoSuchElementException e)
			{
				System.err.println("Entrada inválida.");
				break;
			}
		}
		
		fecharArquivo();

	}
	
	public static void abrirArquivo()
	{
		try
		{
			saida = new Formatter("primeiro.txt"); // abre o arquivo
		}
		catch (SecurityException securityException)
		{
			System.err.println("Permissao negada.");
			System.exit(1);
		}
		catch (FileNotFoundException fileNotFoundException)
		{
			System.err.println("Erro ao abrir arquivo.");
			System.exit(1);
		}
	}
	
	public static void fecharArquivo()
	{
		if (saida != null)
		{
			saida.close();
		}
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
