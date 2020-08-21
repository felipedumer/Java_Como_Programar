package cap9;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		// instancia o objeto ComissionEmployee
				BasePlusCommissionEmployee employee = 
						new BasePlusCommissionEmployee(
						"Bob", "Lewis", "222-22-333", 5000, .04, 300);
				
				// obtém os dados de empregado com salário-base
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
				System.out.printf("%s %.2f%n", "Base salary is",
						employee.getBaseSalary());
				
				employee.setBaseSalary(1000);
				
				System.out.printf("%n%s:%n%n%s%n", 
						"Updated employee information obtained by toString", 
						employee.toString());


	}

}
