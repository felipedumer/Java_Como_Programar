package cap12;
import javax.swing.JOptionPane;

public class Addition {

	public static void main(String[] args) {
		// obt�m a entrada de usu�rio a partir dos di�logos de entrada JOptionPane
		String firstNumber = 
				JOptionPane.showInputDialog("Enter first integer");
		String secondNumber = 
				JOptionPane.showInputDialog("Enter second integer:");
		
		// converte String em valores int para utiliza��o em um c�lculo
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);
		
		int sum = number1 + number2;
		
		// exibe o resultado em um di�logo de mensagem JOptionPane
		JOptionPane.showMessageDialog(null, "The sum is " + sum,
				"Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
	}

}
