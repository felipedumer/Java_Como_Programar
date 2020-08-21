package cap7;

public class StudentPoll {
	public static void main (String[] args)
	{
		//array de resposta dos alunos (mais tipicamente, inserido em tempo de execu��o
		int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
		int[] frequency = new int[6]; // array de contadores de frequ�ncia
	
		// para cada resposta, seleciona elemento de respostas e utiliza esse valor 
		// como �ndice de frequ�ncia para determinar elemento a incrementar
		for (int answer = 0; answer < responses.length; answer++)
		{
			try
			{
				++frequency[responses[answer]];
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e); // invoca o m�todo toString
				System.out.printf("    responses[%d] = %d%n%n", 
						answer, responses[answer]);
			}
		}
		
		System.out.printf("%s%10s%n", "Rating", "Frequency");
		
		// gera sa�da do valor de cada elemento do array
		for (int rating = 1; rating < frequency.length; rating++)
			System.out.printf("%6d%10d%n", rating, frequency[rating]);
	}

}
