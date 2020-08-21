package cap8;

public class Emplyee2 
{
	private static int count = 0; // número de Employees criados
	private String firstName;
	private String lastName;
	
	// inicializa Employee, adiciona 1 a static count e 
	// gera a saída de String indicando que o construtor foi chamado
	
	public Emplyee2(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		++count; // incrementa a contagem estática de empregados
		System.out.printf("Employee construtor: %s %s; count = %d%n", 
				firstName, lastName, count);
	}
	
	// obtém o primeiro nome
	public String getFirstName()
	{
		return firstName;
	}
	
	// obtém o último nome
	
	public String getLastName()
	{
		return lastName;
	}
	
	// método estática para obter valor de contagem estática
	public static int getCount()
	{
		return count;
	}
	
}
