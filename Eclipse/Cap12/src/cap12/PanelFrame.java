package cap12;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFrame extends JFrame {
	private final JPanel buttonJPanel; // painel para armazenar bot�es
	private final JButton[] buttons;
	
	// construtor sem argumento
	public PanelFrame()
	{
		super("Panel Demo");
		buttons = new JButton[5];
		buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new GridLayout(1, buttons.length));
		
		// cria e adiciona bot�es
		for (int count = 0; count < buttons.length; count++)
		{
			buttons[count] = new JButton("Button" + (count + 1));
			buttonJPanel.add(buttons[count]); // adiciona bot�o ao painel
		}
		
		add(buttonJPanel, BorderLayout.SOUTH); // adiciona painel ao JFrame
	}

}
