package cap9;

public class BasePlusCommissionEmployee2 extends ComissionEmployee {
	private double baseSalary; // salário-base por semana
	
	// construtor de seis argumentos
	public BasePlusCommissionEmployee2(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary)
	{
		// chamada explícita para o construtor CommissionEmployee da superclasse
		super(firstName, lastName, socialSecurityNumber, 
				grossSales, commissionRate);
	
	// se baseSalary é inválidado, lança uma exceção
	if (baseSalary < 0.0)
		throw new IllegalArgumentException(
				"Base salary must be >= 0.0");
	this.baseSalary = baseSalary;
	
	}
	
	// retorna o salário-base
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	// calcula os lucros
	@Override
	public double earnings()
	{
		// não permitido : cmoissionRate e grossSales privado em superclasse
		return getBaseSalary() + super.earnings();
	}
	
	// retorna a representação de String de BasePlusCommissionEmployee
	@Override
	public String toString()
	{
		return String.format("%s %s%n%s: %.2f", "base-salaried",
				super.toString(), "base salary", getBaseSalary());
				
	}
	
}
