package cap15;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
	private static Formatter output; // envia uma sa�da de texto para um arquivo
	
	public static void main(String[] args) {
		openFile();
		addRecords();
		closeFile();
	}
	
	// abre o arquivo clients.txt
	public static void openFile()
	{
		try
		{
			output = new Formatter("clients.txt"); // abre o arquivo
		}
		catch (SecurityException secutityException)
		{
			System.err.println("Write permission denied. Terminating.");
			System.exit(1); // termina o programa
		}
		catch (FileNotFoundException fileNotFoundException)
		{
			System.err.println("Error opening file. Terminating.");
			System.exit(1); // termina o programa
		}
	}
	
	// adiciona registros ao arquivo
	public static void addRecords()
	{
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n? ",
				"Enter account number, first name, last name and balance.",
				"Enter end-of-file indicator to end input.");
		
		while (input.hasNext()) // faz um loop at� o indicador de fim de arquivo
		{
			try
			{
				// gera sa�da do novo registro para o arquivo; sup�e entrada v�lida
				output.format("%d %s %s %.2f%n", input.nextInt(),
						input.next(), input.next(), input.nextDouble());
			}
			catch (FormatterClosedException formatterClosedException)
			{
				System.err.println("Error writing to file. Terminating.");
				break;
			}
			catch (NoSuchElementException elementException)
			{
				System.err.println("Invalid input. Please try again.");
				input.nextLine();
			}
			
			System.out.print("? ");
		} // fim do while
	} // fim do m�todo addRecords
	
	
	// fecha o arquivo
	public static void closeFile()
	{
		if (output != null)
			output.close();
	}

}
