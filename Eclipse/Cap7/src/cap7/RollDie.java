package cap7;
import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		int[] frequency = new int[7]; // array de contadores de frequ�ncia
		
		// lan�a o dado 6.000.000 vezes; usa o valor do dado como �ndice de frequ�ncia
		for (int roll = 1; roll <= 6000000; roll++)
			++frequency[1 + randomNumbers.nextInt(6)];
		
		System.out.printf("%s%10s%n", "Face", "Frequency");
		
		// gera sa�da do valor de cada elemento de array
		for (int face = 1; face < frequency.length; face++)
			System.out.printf("%4d%10d%n", face, frequency[face]);
	}

}
