import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel {
	private int choice; // escolha do usu�rio de qual forma desenhar

		// construtor configura a escolha do usu�rio
	public Shapes (int userChoice)
	{
		choice = userChoice;
	}
	
	// desenha uma cascata de formas que iniciam do canto superior esquerdo
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for (int i = 0; i < 10; i++)
		{
			// seleciona a forma com base na escolha do usu�rio
			switch (choice)
			{
				case 1: // desenha ret�ngulos
					g.drawRect(10 + i * 10, 10 + i * 10, 
							50 + i * 10, 50 + i * 10);
					break;
				case 2: // desenha ovais
					g.drawOval(10 + i * 10, 10 + i * 10,  
							50 + i * 10,  50 + i * 10);
			}
		}
	}
}
