package cap8;

public class Time1Test {

	public static void main(String[] args) {
		// cria e inicializa um objeto Time1
		Time1 time = new Time1(); // invoca o construtor Time1
		
		// gera sa�da de representa��es de string da data/hora
		displayTime("After time object is created", time);
		System.out.println();
		
		// altera a data/hora e gera sa�da da data/hora atualizada
		time.setTime(13,  27,  6);
		displayTime("After calling setTime", time);
		System.out.println();

		// tenta definir data/hora com valores inv�lidos
		try
		{
			time.setTime(99, 99, 99); // todos os valores fora do intervalo
		}
		catch (IllegalArgumentException e)
		{
			System.out.printf("Exception: %s%n%n", e.getMessage());
		}
		
		// exibe data/hora ap�s uma tentativa de definir valores
		displayTime("After calling seTime with invalid values", time);
	}
	
	// exibe um objeto Time1 nos formatos de 24 horas e 12 horas
	private static void displayTime(String header, Time1 t)
	{
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", 
				header, t.toUniversalString(), t.toString());
	}

}
