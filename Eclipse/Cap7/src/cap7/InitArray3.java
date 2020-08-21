package cap7;

public class InitArray3 {

	public static void main(String[] args) {
		// verifica n�mero de argumentos de linha de comando
		if (args.length != 3)
			System.out.printf(
					"Error: Please re-enter the entinre command, including%n" +
					"an array size, initial value and increment.%n");
		else
		{
			// obt�m o tamanho do array a partir do primeiro argumento de linha
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];
			
			// obt�m o valor inicial e o incrementa a partir dos argumentos de comando
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			
			// calcula valor de cada elemento do aray
			for (int counter = 0; counter < array.length; counter++)
				array[counter] = initialValue + increment * counter;
				
				System.out.printf("%s%8s%n", "Index", "Value");
				
				// exibe o valor e o �ndice de array
				for (int counter = 0; counter < array.length; counter++)
					System.out.printf("%5d%8d%n", counter, array[counter]);
		}

	}

}
