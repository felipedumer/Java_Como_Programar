package cap12;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame {
	private final JList<String> colorJList; // lista para exibir cores
	private static final String[] colorNames = {"Black", "Blue", "Cyan",
			"Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
			"Orange", "Pink", "Red", "White", "Yellow"};
	private static final Color[] colors = {Color.BLACK, Color.BLUE,
			Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
			Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
			Color.RED, Color.WHITE, Color.YELLOW};
	
	// construtor ListFrame adiciona JScrollPane que cont�m JList ao JFrame
	public ListFrame()
	{
		super("List Test");
		setLayout(new FlowLayout());
		
		colorJList = new JList<String>(colorNames); // lista de colorNames
		colorJList.setVisibleRowCount(5); // exibe cinco linhas de uma vez
		
		// n�o permite m�ltiplas sele��es
		colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// adiciona um JScrollPane que cont�m JList ao FRAME
		add(new JScrollPane(colorJList));
		
		colorJList.addListSelectionListener(
				new ListSelectionListener() // classe interna an�nima
				{
					// trata eventos de sele��o de lista
					@Override
					public void valueChanged(ListSelectionEvent event)
					{
						getContentPane().setBackground(
								colors[colorJList.getSelectedIndex()]);
					}
				}
		);
	}
}
