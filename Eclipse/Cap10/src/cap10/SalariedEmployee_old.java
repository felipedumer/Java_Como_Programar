package cap10;

public class SalariedEmployee_old extends Employee_old {
	private double weeklySalary;
	
	// construtor
	public SalariedEmployee_old(String firstName, String lastName, 
			String socialSecurityNumber, double weeklySalary)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}
	
	// configura o salário
	public void setWeeklySalary(double weeklySalary)
	{
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		
		this.weeklySalary = weeklySalary;
	}
	
	// retorna o salário
	public double getWeeklySalary()
	{
		return weeklySalary;
	}
	
	// calcula o srendimentos ; sobrescreve o método earnings em Employee
	@Override
	public double earnings()
	{
		return getWeeklySalary();
	}
	
	// retorna a repreesntação String do objeto SalariedEmployee
	@Override
	public String toString()
	{
		return String.format("salaried employee: %s%n%s: $%.2f",
				super.toString(), "weekly salary", getWeeklySalary());
	}

}
