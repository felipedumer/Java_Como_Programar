package cap9;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class LabelDemo {

	public static void main(String[] args) {
		
		// cria um r�tulo com texto simples
		JLabel northLabel = new JLabel("North");
		
		// cria um �cone de uma imagem para podermos colocar em um JLabel
		ImageIcon labelIcon = new ImageIcon("GUItip.gif");
		
		// cria um r�tulo com um Icon em vez de texto
		JLabel centerLabel = new JLabel(labelIcon);
		
		// cria outro r�tulo com um Icon
		JLabel southLabel = new JLabel(labelIcon);
		
		// configura o r�tulo para exibir textoo (bem como um �cone)
		southLabel.setText("South");
		
		// cria um quadro para armazenar os r�tulos
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// adiciona os r�tulos ao frame; o segundo argumento especifica
		// onde adicionar o r�tulo no frame
		application.add(northLabel, BorderLayout.NORTH);
		application.add(centerLabel, BorderLayout.CENTER);
		application.add(southLabel, BorderLayout.SOUTH);
		
		application.setSize(300, 300);
		application.setVisible(true);
		
	}

}
