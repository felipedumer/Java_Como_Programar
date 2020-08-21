package cap12;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame {
	private String details; // String exibida ns statusBar
	private final javax.swing.JLabel statusBar; // JLabel na parte inferior da janela
	
	// construtor configura String de barra de t�tulo e reggistra o listener de mouse
	public MouseDetailsFrame()
	{
		super("Mouse clicks and buttons");
		
		statusBar = new JLabel("Click the mouse");
		add(statusBar, BorderLayout.SOUTH);
		addMouseListener(new MouseClickHandler()); // adiciona tratamento de evento
	}
	
	// classe interna para tratar eventos de mouse
	private class MouseClickHandler extends MouseAdapter
	{
		// trata evento de clique de mouse e determina qual bot�o foi pressionado
		@Override
		public void mouseClicked(MouseEvent event)
		{
			int xPos = event.getX(); // obt�m a posi��o x do mouse
			int yPos = event.getY(); // obt�m a posi��o y do mouse
			details = String.format("Clicked %d time(s)", 
					event.getClickCount());
			
			if (event.isMetaDown()) // bot�o direito do mouse
				details += " with right mouse button";
			else if (event.isAltDown()) // bot�o do meio do mouse
				details += " with center mouse button";
			else // bot�o esquerdo do mouse
				details += " with left mouse button";
			
			statusBar.setText(details); // exibe mensagem em statusBar
		}
	}
	
}
