package cap12;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame {
	private final JButton leftJButton; // bot�o para configurar alinhamento � esquerda
	private final JButton centerJButton; // bot�o para configurar alinhamento central
	private final JButton rightJButton; // bot�o para configurar alinhamento � direita
	private final FlowLayout layout; // objeto de layout
	private final Container container; // cont�iner para configurar layout
	
	// configura GUI e registra listeners de bot�o
	public FlowLayoutFrame()
	{
		super("FlowLayout Demo");
		
		layout = new FlowLayout();
		container = getContentPane(); // obt�m cont�iner para layout
		setLayout(layout);
		
		// configura leftJButton e registra listener
		leftJButton = new JButton("Left");
		add(leftJButton); // adiciona o bot�o left ao frame
		leftJButton.addActionListener(
				new ActionListener() // classe interna an�nima
				{
					// processa o evento leftJButton
					@Override
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.LEFT);
						
						// realinha os componentes anexados
						layout.layoutContainer(container);
					}
				}
			);
		
		// configura centerJButton e registra o listener
		centerJButton = new JButton("Center");
		add(centerJButton); // adiciona bot�o Center ao frmae
		centerJButton.addActionListener(
				new ActionListener()
				{
					// processa evento centerJButton
					@Override
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.CENTER);
					
						// realinha os componentes anexados
						layout.layoutContainer(container);
					}
				}
			);
		
		// configura o rightJButon e registra o listener
		rightJButton = new JButton("Right");
		add(rightJButton); // adiciona bot�o Right ao Frame
		rightJButton.addActionListener(
				new ActionListener() // classe interna an�nima
				{
					// processa evento rightJButton
					@Override
					public void actionPerformed(ActionEvent event)
					{
						layout.setAlignment(FlowLayout.RIGHT);
						
						// realinha os componentes anexados
						layout.layoutContainer(container);
					}
				}
			);
	} // fim do construtor FlowLayoutFrame
} // fim da classe FlowLayoutFrame