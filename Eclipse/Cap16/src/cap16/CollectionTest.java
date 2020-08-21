package cap16;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// adiciona elementos no array colors a listar
		String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
		List<String> list = new ArrayList<String>();
		
		for (String color : colors)
			list.add(color); // adiciona color ao final da lista
		
		// adiciona elementos no array removeColors em removeList
		String[] removeColors = {"RED", "WHITE", "BLUE"};
		List<String> removeList = new ArrayList<String>();
		
		for (String color : removeColors)
			removeList.add(color);
		
		// gera sa�da do conte�do da lista
		System.out.println("ArrayList: ");
		
		for (int count = 0; count < list.size(); count++)
			System.out.printf("%s ", list.get(count));
		
		// remove da lista as cores contidas em removeList
		removeColors(list, removeList);
		
		// gera sa�da do conte�do da lista
		System.out.printf("%n%nArrayList after calling removeColors:%n");
		
		for (String color : list)
			System.out.printf("%s", color);
	}
	
	// remove cores epecificadas em collection2 a partir de collection1
	private static void removeColors(Collection<String> collection1,
			Collection<String> collection2)
	{
		// obt�m o iterador
		Iterator<String> iterator = collection1.iterator();
		
		// loop enquanto a cole��o tiver itens
		while (iterator.hasNext())
		{
			if (collection2.contains(iterator.next()))
				iterator.remove(); // remove o elemento atual
		}
	}

}
