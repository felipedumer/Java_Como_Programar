package cap12;
import java.awt.FlowLayout; // especifica como os componentes s�o organizados
import javax.swing.JFrame; // fornece recursos b�sicos de janela
import javax.swing.JLabel; // exbite textos e imagens
import javax.swing.SwingConstants; // constantes comuns utilizadas com Swing
import javax.swing.Icon; // interface utilizada para manipular imagens
import javax.swing.ImageIcon; // carrega imagens

public class LabelFrame  extends JFrame {
	private final JLabel label1; // JLabel apenas com texto
	private final JLabel label2; // JLabel constru�do com texto e �cone
	private final JLabel label3; // JLabel com texto e �cone adicionados
	
	// construtor LabelFrame adiciona JLabels a JFrame
	public LabelFrame()
	{
		super("Testing JLabel");
		setLayout(new FlowLayout()); // configura o layout de frame
		
		// construtor JLabel com um argumento de string
		label1 = new JLabel("Label with text");
		label1.setToolTipText("This is label1");
		add(label1); // adiciona o label1 ao JFrame
		
		// construtor JLabel com string, Icon e argumentos de alinhamento
		//Icon bug = new ImageIcon(getClass().getResource( "bug1.jpg"));
		label2 = new JLabel("Label with texto and icon", /*bug,*/ 
				SwingConstants.LEFT);
		label2.setToolTipText("This is label2");
		add(label2); // adiciona label2 ao JFrame
		
		label3 = new JLabel(); // Construtor JLabel sem argumentos
		label3.setText("Label with icon and text at bottom");
		//label3.setIcon(bug); // adiciona o �cone ao JLabel
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label3");
		add(label3); // adiciona label3 ao JFrame
	}

}
