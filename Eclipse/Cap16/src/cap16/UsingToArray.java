package cap16;

import java.util.LinkedList;
import java.util.Arrays;

public class UsingToArray {

	public static void main(String[] args) {
		String[] colors = {"black", "blue", "yellow"};
		LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));
		
		links.addLast("red"); // adiciona como o �ltimo item
		links.add("pink"); // adiciona ao final
		links.add(3, "green"); // adiciona no terceiro �ndice
		links.addFirst("cyan"); // adiciona como primeiro item
		
		// obt�m elementos LinkedList como um array
		colors = links.toArray(new String[links.size()]);
		
		System.out.println("colors: ");
		
		for (String color: colors)
			System.out.println(color);
	}

}