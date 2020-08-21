package cap8;

public class Emplyee2 
{
	private static int count = 0; // n�mero de Employees criados
	private String firstName;
	private String lastName;
	
	// inicializa Employee, adiciona 1 a static count e 
	// gera a sa�da de String indicando que o construtor foi chamado
	
	public Emplyee2(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		++count; // incrementa a contagem est�tica de empregados
		System.out.printf("Employee construtor: %s %s; count = %d%n", 
				firstName, lastName, count);
	}
	
	// obt�m o primeiro nome
	public String getFirstName()
	{
		return firstName;
	}
	
	// obt�m o �ltimo nome
	
	public String getLastName()
	{
		return lastName;
	}
	
	// m�todo est�tica para obter valor de contagem est�tica
	public static int getCount()
	{
		return count;
	}
	
}
