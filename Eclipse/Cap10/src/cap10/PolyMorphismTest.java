package cap10;

public class PolyMorphismTest {
	public static void main(String[] args)
	{
		// atribui uma ref�rencia de superclasse � vari�vel de superclasse
		CommissionEmployee comissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
		
		// atribui uma refer�ncia de subclasse � vari�vel de subclasse
		BasePlusCommissionEmployee basePlusCommissionEmployee = 
				new BasePlusCommissionEmployee(
						"Bob", "Lewis", "333-33-3333", 5000, .04, 300);
		
		// invoca toString no objeto de superclasse utilizando a vari�vel de superclasse
		System.out.printf("%s %s:%n%n%s%n%n", 
				"Call CommissionEmployee's toString with superclass reference",
				"to superclass object", comissionEmployee.toString());
		
		// invoca toString no objeto de subclasse utilizando a vari�vel de subclasse
		System.out.printf("%s %s:%n%n%s%n%n", 
				"Call BasePlusCommissionEmployee's toString with subclass",
				"reference to subclass object",
				basePlusCommissionEmployee.toString());
	
		// invoca toString no objeto de subclasse utilizando a vari�vel de superclasse
		CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
		System.out.printf("%s %s:%n%n%s%n", 
				"Call BasePlusCommissionEmployee's toString with superclass",
				"reference to subclass object", commissionEmployee2.toString());
	}

}
