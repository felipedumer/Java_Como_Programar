package cap10;

public class HourlyEmployee extends Employee_old {

	private double wage; // sal�rio por hora
	private double hours; // horas trabalhadas durante a semana
	
	// construtor
	public HourlyEmployee(String firstName, String lastName,
			String socialSecurityNumber, double wage, double hours)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if (wage < 0.0) // valida remunera��o
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		
		if ((hours < 0.0) || (hours > 168.0)) // valida horas
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		
		this.wage = wage;
		this.hours = hours;
	}
	
	// configura a remunera��o
	public void setWage(double wage)
	{
		if (wage < 0.0) // valida remunera��o
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		this.wage = wage;
	}
	
	// retorna a remunera��o
	public double getWage()
	{
		return wage;
	}
	
	// configura as horas trabalhadas
	public void setHours(double hours)
	{
		if ((hours <0.0) || (hours > 168.0)) // valida horas
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		
		this.hours = hours;
	}
	
	// retorna as horas trabalhadas
	public double getHours()
	{
		return hours;
	}
	
	// calcula os rendimnetos; sobrescreve o m�todo earnings em Employee
	@Override
	public double earnings()
	{
		if (getHours() <= 40) // nenhuma hora extra
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}
	
	//retorna a representa��o String do objeto HourlyEmployee
	@Override
	public String toString()
	{
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
				super.toString(), "hourly wage", getWage(),
				"hours worked", getHours());
	}
}
