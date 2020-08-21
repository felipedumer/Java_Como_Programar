// Figura 16.12: BinarySearchTest.java
// M�todo binarySearch de Collections.

package cap16;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class BinarySearchTest 
{

	public static void main(String[] args) 
	{
		// cria um ArrayList <String> a partir do conte�do do array colors
		String[] colors = {"red", "white", "blue", "black", "yellow",
				"purple", "tan", "pink"};
		List<String> list = 
				new ArrayList<>(Arrays.asList(colors));
		
		Collections.sort(list); // classifica a ArrayList
		System.out.printf("Sorted ArrayList: %s%n", list);
		
		// pesquisa v�rios valores na lista
		printSearchResults(list, "black"); // primeiro item
		printSearchResults(list, "red"); // item do meio
		printSearchResults(list, "pink"); // �ltimo item
		printSearchResults(list, "aqua"); // abaixo do mais baixo
		printSearchResults(list, "gray"); // n�o existe
		printSearchResults(list, "teal"); // n�o existe
	}

	// realiza pesquisa e exibe o resultado
	private static void printSearchResults(
			List<String> list, String key)
	{
		int result = 0;
		
		System.out.printf("%nSearching for %s%n", key);
		result = Collections.binarySearch(list, key);
		
		if (result >= 0)
			System.out.printf("Found at index %d%n", result);
		else
			System.out.printf("Not Found (%d)%n", result);
	
	}
} // fim da classe
