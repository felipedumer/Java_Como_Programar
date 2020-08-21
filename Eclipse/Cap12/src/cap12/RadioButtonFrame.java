package cap12;


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame {
	private final JTextField textField; // utilizado para exibir altera��es de fonte
	private final Font plainFont; // fonte para texto em negrito
	private final Font boldFont; // fonte para texto em negrito
	private final Font italicFont; // fonte para texto em it�lico
	private final Font boldItalicFont; // fonte para texto em negrito e it�lico
	private final JRadioButton plainJRadioButton; // seleciona texto simples
	private final JRadioButton boldJRadioButton; // seleciona texto em negrito
	private final JRadioButton italicJRadioButton; // seleciona texto em italico
	private final JRadioButton boldItalicJRadioButton; // negrito e it�lico
	private final ButtonGroup radioGroup; // cont�m bot�es de op��o
	
	// construtor RadioButtonFrame adiciona JRadioButtons ao JFrame
	public RadioButtonFrame()
	{
		super("UNS NEGOCIO PRA CLICAR");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Olha s�", 25);
		add(textField); // adiciona textField ao JFrame
		
		// cria bot�es de op��o
		plainJRadioButton = new JRadioButton("Nada", true);
		boldJRadioButton = new JRadioButton("Negritu", false);
		italicJRadioButton = new JRadioButton("It�licu", false);
		boldItalicJRadioButton = new JRadioButton("Negrito Italic�", false);
		add(plainJRadioButton); // adiciona bot�o no estilo simples ao JFrame
		add(boldJRadioButton); // adiciona bot�o de negrito ao JFrame
		add(italicJRadioButton); // adiciona bot�o de it�lico ao JFrame
		add(boldItalicJRadioButton); // adiciona bot�o de negrito e it�lico
		
		// cria relacionamento l�gico entre JRadioButtons
		radioGroup = new ButtonGroup(); // cria ButtonGroup
		radioGroup.add(plainJRadioButton); // adiciona texto simples ao grupo
		radioGroup.add(boldJRadioButton); // adiciona negrito ao grupo
		radioGroup.add(italicJRadioButton); // adiciona it�lico ao grupo
		radioGroup.add(boldItalicJRadioButton); // adiciona negrito e it�lico
		
		// cria fonte objetos
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		textField.setFont(plainFont);
		
		// registra eventos para JRadioButtons
		plainJRadioButton.addItemListener(
				new RadioButtonHandler(plainFont));
		boldJRadioButton.addItemListener(
				new RadioButtonHandler(boldFont));
		italicJRadioButton.addItemListener(
				new RadioButtonHandler(italicFont));
		boldItalicJRadioButton.addItemListener(
				new RadioButtonHandler(boldItalicFont));
	}
	
	// classe interna private para tratar eventos de bot�o de op��o
	private class RadioButtonHandler implements ItemListener
	{
		private Font font; // fonte associada com esse listener
	
		public RadioButtonHandler(Font f)
		{
			font = f;
		}
		
		// trata eventos de bot�o de op��o
		@Override
		public void itemStateChanged(ItemEvent event)
		{
			textField.setFont(font);
		}
	}
}
