package Lista6;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Segundo {

	private static Scanner entrada;
	
	public static void main(String[] args) 
	{
		abrirArquivo();
		
		System.out.printf("%-40s%-10s", "Nome do funcion�rio", "Sal�rio");
		System.out.printf("%n-----------------------------------------------%n");
		
		String partes[];
		
		double maior = 0, soma = 0;
		int i = 0;
		
		try 
		{
			while (entrada.hasNext()) // enquanto houver mais para ler
			{
				String dados = entrada.next();
				partes = dados.split(";");
				double salario = Double.parseDouble(partes[1]);
				
				System.out.printf("%-40sR$: %-10.2f%n", partes[0], salario);
				
				soma += salario;
				i++;
				
				if (maior < salario)
				{
					maior = salario;
				}
			}
		}
		catch (NoSuchElementException e)
		{
		System.err.println("Formato inv�lido");
		}
		catch (IllegalStateException e)
		{
		System.err.println("Erro ao abrir arquivo");
		}
		
		System.out.printf("-----------------------------------------------%n");		
		System.out.printf("%-40sR$: %-10.2f%n", "Total", soma);
		System.out.printf("%-40sR$: %-10.2f%n", "Sal�rio M�dio", soma / i);
		System.out.printf("%-40sR$: %-10.2f%n", "Maior sal�rio", maior);
		System.out.printf("-----------------------------------------------%n");
		
	} // fim do main
	
	// abre o arquivo salarios.txt
	
	public static void abrirArquivo()
	{
		try
		{
			entrada = new Scanner(Paths.get("salarios.txt"));
		}
		catch (IOException e)
		{
			System.err.println("Erro ao abrir arquivo.");
			System.exit(1);
		}
	}
	
}
