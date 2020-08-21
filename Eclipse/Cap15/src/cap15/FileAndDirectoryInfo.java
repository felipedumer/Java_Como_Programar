package cap15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter file or diretory name:");
		
		// cria o objeto path com base na entrada de usu�rio
		Path path = Paths.get(input.nextLine());
		
		if (Files.exists(path)) // se o caminho existe, gera uma sa�da das informa��es
		{
			// exibe informa��es sobre o arquivo (ou diret�rio)
			System.out.printf("%n%s exists%n", path.getFileName());
			System.out.printf("%s a directory%n",
					Files.isDirectory(path) ? "Is" : "Is not");
			System.out.printf("%s and absolute path%n",
					path.isAbsolute() ? "Is" : "Is not");
			System.out.printf("Last modified: %s%n",
					Files.getLastModifiedTime(path));
			System.out.printf("Size: %s%n", Files.size(path));
			System.out.printf("Path: %s%n", path);
			System.out.printf("Absolute path: %s%n", path.toAbsolutePath());
			
			if (Files.isDirectory(path)) // listagem de diret�rio de sa�da
			{
				System.out.printf("%nDirectory contents:%n");
				
				// objeto para itera��o pelo conte�do de um diret�rio
				DirectoryStream<Path> directoryStream =
						Files.newDirectoryStream(path);
				
				for (Path p : directoryStream)
					System.out.println(p);
			}
		}
		else // se n�o for arquivo ou diret�rio, gera sa�da da mensagem de erro
		{
			System.out.printf("%s does not exist%n", path);
		}

	}

}
