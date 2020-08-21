// Figura 16.11: Algorithms1.java
// Métodos Collections reverse, fill, copy, max e min.

package cap16;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms1 
{

	public static void main(String[] args) 
	{
		// crie e exibe uma List<Character>
		Character[] letters = {'P', 'C', 'M'};
		List<Character> list = Arrays.asList(letters); // obtém List
		System.out.println("list contains: ");
		output(list);
		
		// inverte e exibe uma List<Character>
		Collections.reverse(list); // inverte a orgem dos elementos
		System.out.printf("%nAfter calling reverse, list contains:%n");
		output(list);
		
		// cria CopyList de um array de 3 caracteres
		Character[] lettersCopy = new Character[3];
		List<Character> copyList = Arrays.asList(lettersCopy);
		
		// copia o conteúdo da lista para CopyList
		Collections.copy(copyList, list);
		System.out.printf("%nAfter copying, copyList contains:%n");
		output(list);
		
		Collections.fill(list, 'R');
		System.out.printf("%nAfter calling fill, list contains:%n");
		output(list);
	}
	
	// envia informações de List para saída
	private static void output(List<Character> listRef)
	{
		System.out.print("The list is: ");;
		
		for (Character element : listRef)
			System.out.printf("%s ", element);
		
		System.out.printf("%nMax: %s", Collections.max(listRef));
		System.out.printf(" Min: %s%n", Collections.min(listRef));
	}

} // Fim da classe Algogrithms1
