package cap12;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
	private final JButton plainJButton; // bot�o apenas com texto
	private final JButton fancyJButton; // bot�o com �cones
	
	// ButtonFrame adiciona JButtons ao JFrame
	public ButtonFrame()
	{
		super("Testing Buttons");
		setLayout(new FlowLayout());
		
		plainJButton = new JButton("Plain Button"); // bot�o com texto
		add(plainJButton); // adiciona plainJButton ao JFrame
		
		Icon bug1 = new ImageIcon(getClass().getResource(""));
		Icon bug2 = new ImageIcon(getClass().getResource(""));
		fancyJButton = new JButton("Fancy Button", bug1); // configura imagem
		fancyJButton.setRolloverIcon(bug2); // configura imagem de rollover
		add(fancyJButton); // adiciona fancyJButton ao JFrame
		
		// cria um novo BUttonHandler de tratamento para tratamento de evento de bot�o
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener(handler);
		plainJButton.addActionListener(handler);
	}
	
	// classe interna para tratamento de evento de bot�o
	private class ButtonHandler implements ActionListener
	{
		// trata evento de bot�o
		@Override
		public void actionPerformed(ActionEvent event)
		{
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
					"You pressed: %s", event.getActionCommand()));
		}
	}
}
