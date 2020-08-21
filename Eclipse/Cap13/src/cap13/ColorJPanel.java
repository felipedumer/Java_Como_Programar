package cap13;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class ColorJPanel extends JPanel {
	// desenha retângulos e Strings em cores diferentes
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		// nova cor de desenha configuradautiliza inteiros
		g.setColor(new Color(255, 0, 0));
		g.fillRect(15, 25, 100, 20);
		g.drawString("Current RGB: " + g.getColor(), 130, 40);
		
		// nova cor de desenha configurada utiliza floats
		g.setColor(new Color(0.50f, 0.75f, 0.0f));
		g.fillRect(15, 50, 100, 20);
		g.drawString("Current RGB: " + g.getColor(), 130, 65);
		
		// nova cor de desenha configurada usa objetos color estáticos
		g.setColor(Color.BLUE);
		g.fillRect(15, 75, 100, 20);
		g.drawString("Current RGB: " + g.getColor(), 130, 90);
		
		// exibe valores individuais de RGB
		Color color = Color.MAGENTA;
		g.setColor(color);
		g.fillRect(15, 100, 100, 20);
		g.drawString("RGB values: " + color.getRed() + ", " +
				color.getGreen() + ", " + color.getBlue(), 130, 115);
	}
	
}
