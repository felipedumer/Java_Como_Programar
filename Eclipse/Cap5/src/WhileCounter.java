
public class WhileCounter {

	public static void main(String[] args) {
		int counter = 1; // declara e inicia a vari�vle contador
		
		while (counter <= 10) // condi��o de continua��o do loop
		{
			System.out.printf("%d ", counter);
			++counter; // vari�vel de controle de incremento
		}
		
		System.out.println();
	}

}
