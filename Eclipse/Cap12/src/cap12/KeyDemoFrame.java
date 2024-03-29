package cap12;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener {
	private String line1 = ""; // primeira linha da �rea de texto
	private String line2 = ""; // segunda linha da �rea de texto
	private String line3 = ""; // terceira linha da �rea de texto
	private JTextArea textArea; // �rea de texto para exibir
	
	// construtor KeyDemoDrame
	public KeyDemoFrame()
	{
		super("Demonstrating Keystroke Events");
		
		textArea = new JTextArea(10, 15); // configura JTextArea
		textArea.setText("Press any key on the keyboard...");
		textArea.setEnabled(false);
		textArea.setDisabledTextColor(Color.BLACK);
		add(textArea); // adiciona �rea de texto ao JFrame
		
		addKeyListener(this); // permite que o frame processe os eventos de teclado
	}
	
	// trata pressionamento de qualquer tecla
	@Override
	public void keyPressed(KeyEvent event)
	{
		line1 = String.format("Key pressed: %s",
				KeyEvent.getKeyText(event.getKeyCode())); // mostra a tecla pressionada
		setLines2and3(event); // configura a sa�da das linhas dois e tr�s
	}
	
	// trata libera��o de qualquer tecla
	@Override
	public void keyReleased(KeyEvent event)
	{
		line1 = String.format("Key released: %s", 
				KeyEvent.getKeyText(event.getKeyCode())); // mostra a tecla liberada
		setLines2and3(event); // configura a sa�da das linhas dois e tr�s
	}
	
	// trata pressionamento de uma tecla de a��o
	@Override
	public void keyTyped(KeyEvent event)
	{
		line1 = String.format("Key typed: %s", event.getKeyChar());
		setLines2and3(event); // configura a sa�da das linhas dois e tr�s
	}
	
	// configura segunda e terceira linhas de sa�da
	private void setLines2and3(KeyEvent event)
	{
		line2 = String.format("This key is %sand action key", 
				(event.isActionKey() ? "" : "not "));
		
		String temp = KeyEvent.getKeyModifiersText(event.getModifiers());
		
		line3 = String.format("Modifier keys pressed: %s",
				(temp.equals("") ? "none" : temp)); // modificadores de sa�da
		
		textArea.setText(String.format("%s\n%s\n%s\n",
				line1, line2, line3)); // gera sa�da de tr�s linhas de texto
	}
}
