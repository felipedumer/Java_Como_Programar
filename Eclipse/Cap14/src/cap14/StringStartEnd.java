package cap14;

public class StringStartEnd {

	public static void main(String[] args) {
		String[] strings = {"started", "starting", "ended", "ending"};

		// testa o m�todo startsWith
		for(String string : strings)
		{
			if (string.startsWith("st"))
				System.out.printf("\"%s\" starts with \"st\"%n", string);
		}
		
		System.out.println();
		
		// testa o m�todo startsWith iniciando da posi��o 2 de string
		for(String string : strings)
		{
			if(string.startsWith("art", 2))
				System.out.printf(
						"\"%s\" starts with \"art\" at position 2%n", string);
		}
		
		System.out.println();
		
		// testa o m�todo endsWith
		for (String string : strings)
		{
			if (string.endsWith("ed"))
				System.out.printf("\"%s\" ends with \"ed\"%n", string);
		}
		
		System.out.println();
		
		// testa o m�todo endsWith
		for (String string : strings)
		{
			if (string.endsWith("ed"))
				System.out.printf("\"%s\" ends with \"ed\"%n", string);
		}
	}

}
