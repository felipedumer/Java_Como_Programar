package cap15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFileChooserDemo extends JFrame {
	private final JTextArea outputArea; // exibe o conte�do do arquivo
	
	// configura a GUI
	public JFileChooserDemo() throws IOException
	{
		super("JFileChooser Demo");
		outputArea = new JTextArea();
		add(new JScrollPane(outputArea)); //outputArea � rol�vel
		analyzePath(); // obt�m  o path do usu�rio e exibe informa��es
	}
	
	// exibe inofrma��es sobre o arquivo ou diret�rio que o usu�rio espeficicou
	public void analyzePath() throws IOException
	{
		// obt�m o Path para o arquivo ou diret�rio selecionado pelo usu�rio
		Path path = getFileOrDirectoryPath();
		
		if (path != null && Files.exists(path)) // se existir, exibe as informa��es
		{
			// coleta as informa��es sobre o arquivo (ou diret�rio)
			StringBuilder builder = new StringBuilder();
			builder.append(String.format("%s:%n", path.getFileName()));
			builder.append(String.format("%s a directory%n",
					Files.isDirectory(path) ? "Is" : "Is not"));
			builder.append(String.format("%s an absolute path%n",
					path.isAbsolute() ? "Is" : "IS not"));
			builder.append(String.format("Last modified: %s%n",
					Files.getLastModifiedTime(path)));
			builder.append(String.format("Size: %s%n", Files.size(path)));
			builder.append(String.format("Path : %s%n", path));
			builder.append(String.format("Absolute path: %s%n",
					path.toAbsolutePath()));
			
			if (Files.isDirectory(path)) // listagem de diret�rio de sa�da
			{
				builder.append(String.format("%nDirectory contents:%n"));
				
				// objeto para itera��o pelo conte�do de um diret�rio
				DirectoryStream<Path> directoryStream =
						Files.newDirectoryStream(path);
				
				for (Path p : directoryStream)
					builder.append(String.format("%s%n", p));
			}
			
			outputArea.setText(builder.toString()); // exibe o conte�do de String
		}
		else // Path n�o existe
		{
			JOptionPane.showMessageDialog(this, path.getFileName() + 
					" does not exist.", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	} // fim do m�todo analyzePath
	
	// permite que o usu�rio especifique  o nome de arqquivo ou diret�rio
	private Path getFileOrDirectoryPath()
	{
		// configura o di�logo permitindo a sele��o deum arquivo ou diret�roi
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(
				JFileChooser.FILES_AND_DIRECTORIES);
		int result = fileChooser.showOpenDialog(this);
		
		// se o usu�rio clicou no bot�o cancel no di�logo, retorno
		if (result == JFileChooser.CANCEL_OPTION)
			System.exit(1);
		
		// retorna o Path representando o arquivo selecionado
		return fileChooser.getSelectedFile().toPath();
	}
}
