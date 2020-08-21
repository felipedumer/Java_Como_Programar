package cap9;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		// instancia o objeto ComissionEmployee
		ComissionEmployee employee = new ComissionEmployee(
				"Sue", "Jones", "222-22-222", 1000, .06);
		
		// obtém os dados de empregado comissionado
		System.out.println(
				"Employee information obtained by get methods:");
		System.out.printf("%n%s %s%n",  "First name is",
				employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is",
				employee.getLastName());
		System.out.printf("%s %s%n",  "Social security number is",
				employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Gross sales is",
				employee.getGrossSales());
		System.out.printf("%s %.2f%n", "Comission rate is",
				employee.getComissionRate());
		
		employee.setGrossSales(5000);
		employee.setComissionRate(.1);
		
		System.out.printf("%n%s:%n%n%s%n", 
				"Updated employee information obtained by toString", employee);

	}

}
