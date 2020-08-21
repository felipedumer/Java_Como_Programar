package cap10;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	// construtor
	public SalariedEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double weeklySalary)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}
	
	// configura o sal�rio
	public void setWeeklySalary(double weeklySalary)
	{
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}
	
	// retorna o sal�rio
	public double getWeeklySalary()
	{
		return weeklySalary;
	}

	// calcula vencimentos; implementa o m�todo Payable da interface
	// que era abstrata na superclasse Employee
	@Override
	public double getPaymentAmount()
	{
		return getWeeklySalary();
	}
	
	// retorna a repreesnta��o String do objeto SalariedEmployee
	@Override
	public String toString()
	{
		return String.format("salaried employee: %s%n%s: $%.2f",
				super.toString(), "weekly salary", getWeeklySalary());
	}

}
