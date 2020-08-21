package cap12;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	// lista das refer�ncias POint
	private final ArrayList<Point> points = new ArrayList<>();
	
	// configura GUI e registra rotinas de tratamento de evento de mouse
	public PaintPanel()
	{
		// trata evento de movimento de mouse do frame
		addMouseMotionListener(
				new MouseMotionAdapter() // classe interna an�nima
				{
					// armazena coordenadas da a��o de arrastar e repinta
					@Override
					public void mouseDragged(MouseEvent event)
					{
						points.add(event.getPoint());
						repaint(); // repinta JFrame
					}
				}
				);
	}
	
	// desenha ovais em um quadro delimitador de 4x4 nas localiza��es especificadas
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); // limpa a �rea de desenho
		
		// desenha todos os pontos
		for (Point point : points)
			g.fillOval(point.x, point.y, 4, 4);
	}
}
