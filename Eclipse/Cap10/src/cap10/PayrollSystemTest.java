package cap10;

public class PayrollSystemTest {
	public static void main(String[] args)
	{
		// cria objetos de subclasse
		SalariedEmployee_old salariedEmployee =
				new SalariedEmployee_old("John", "Smith", "111-11-111", 800.00);
		HourlyEmployee hourlyEmployee =
				new HourlyEmployee("Karen", "Price", "222-222-222", 16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee(
				"Sue", "Jones", "333-333-333", 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = 
				new BasePlusCommissionEmployee(
						"Bob", "Lewis", "444-444-444", 5000, .04, 300);
		
		System.out.println("Employeees processed individually:");
		
		System.out.printf("%n%s%n%s: $%,.2f%n%n", 
				salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", 
				hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s%n%S: $%,.2f%n%n",
				basePlusCommissionEmployee,
				"earned", basePlusCommissionEmployee.earnings());
		
		// cria um array Employee de quatro elementos
		Employee_old[] employees = new Employee_old[4];
		
		// inicializa o array com Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		System.out.printf("Employees processed polymorphically:%n%n");
		
		// processa genericamente cada elemento no employees
		for (Employee_old currentEmployee : employees)
		{
			System.out.println(currentEmployee); // invoca toString
			
			// determina se o elemento é um BasePlusCommissoinEmployee
			if (currentEmployee instanceof BasePlusCommissionEmployee )
			{
				// downcast da referência de Employee para
				// referência a BasePlusCommissionEmployee
				BasePlusCommissionEmployee employee = 
						(BasePlusCommissionEmployee) currentEmployee;
				
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				
				System.out.printf(
					  "new base salary with 10 increase is $%,.2f%n", 
					  employee.getBaseSalary());
			} // fim do if
			
			System.out.printf(
					"earned $%,.2f%n%n", currentEmployee.earnings());
		} // for final

	
	// obtém o nome do tipo de cada objeto no array employees
	for (int j = 0; j < employees.length; j++)
		System.out.printf("Employee %d is a %s%n", j,
				employees[j].getClass().getName());
	
	}
}
