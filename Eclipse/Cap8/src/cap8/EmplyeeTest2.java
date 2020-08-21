package cap8;

public class EmplyeeTest2 {

	public static void main(String[] args) 
	{
		// mostra que a contagem é  antes de criar Employees
		System.out.printf("Employees before instantiation: %d%n", 
				Emplyee2.getCount());
		
		// cria dois Employees, a contagem deve ser 2
		Emplyee2 e1 = new Emplyee2("Susan", "Baker");
		Emplyee2 e2 = new Emplyee2("Bob", "Blue");
		
		// mostra que a contagem é 2 depois de criar dois Employees
		System.out.printf("%nEmployees after instantiation:%n");
		System.out.printf("via e1.getCount(): %d%n", e1.getCount());
		System.out.printf("via e2.getCount(): %d%n", e2.getCount());
		System.out.printf("via Employee.getCount(): %d%n",
				Emplyee2.getCount());
		
		// obtém nomes de Employees
		System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", 
				e1.getFirstName(), e1.getLastName(),
				e2.getFirstName(), e2.getLastName());
	}

}
