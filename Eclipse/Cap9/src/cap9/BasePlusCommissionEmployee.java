package cap9;

public class BasePlusCommissionEmployee {
		private final String firstName;
		private final String lastName;
		private final String socialSecurityNumber;
		private double grossSales; // vendas brutas semanais
		private double comissionRate; // porcentagem da comiss�o
		private double baseSalary; // sal�rio-base por semana
		
		// construtor de seis argumentos
		public BasePlusCommissionEmployee(String firstName, String lastName, 
				String socialSecurityNumber, double grossSales, 
				double comissionRate, double baseSalary)
		{
			// a chamada impl�cita para o construtor padr�o de Object ocorre aqui
			// se grossSales � inv�lido, lan�a uma exce��o
			if (grossSales < 0.0)
				throw new IllegalArgumentException(
						"Gross sales must be >= 0.0");
			
			// se comissionRate � inv�lido, lan�a uma exce��o
			if (comissionRate <= 0.0 || comissionRate >= 1.0)
				throw new IllegalArgumentException(
						"Comission rate must be > 0.0 and < 1.0");
			
			// se baseSalary � inv�lido, lan�a uma exce��o
			if (baseSalary < 0.0)
				throw new IllegalArgumentException(
						"Base salary must be >= 0.0");
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.socialSecurityNumber = socialSecurityNumber;
			this.grossSales = grossSales;
			this.comissionRate = comissionRate;
			this.baseSalary = baseSalary;
		}
		
		// retorna o nome
		public String getFirstName()
		{
			return firstName;
		}
		
		// retorna o sobrenome
		public String getLastName()
		{
			return lastName;
		}
		
		// retorna o n�mero de seguro social
		public String getSocialSecurityNumber()
		{
			return socialSecurityNumber;
		}
		
		// configura a quantidade de vendas brutas
		public void setGrossSales(double grossSales)
		{
			if (grossSales < 0.0)
				throw new IllegalArgumentException(
						"Gross sales must be >= 0.0");
			this.grossSales = grossSales;
		}
		
		// retorna a quantidade de vendas brutas
		public double getGrossSales()
		{
			return grossSales;
		}
		
		// configura a taxa de comiss�o
		public void setComissionRate(double comissionRate)
		{
			if(comissionRate <= 0.0 || comissionRate >= 1.0)
				throw new IllegalArgumentException(
						"Comission rate must be > 0.0 and < 1.0");
			this.comissionRate = comissionRate;
		}
		
		// retorna a taxa de comiss�o
		public double getComissionRate()
		{
			return comissionRate;
		}
		
		// configura o sal�rio-base
		public void setBaseSalary(double baseSalary)
		{
			if (baseSalary <0.0)
				throw new IllegalArgumentException(
						"Base salary must be >= 0.0");
			
			this.baseSalary = baseSalary;
		}
		
		// retorna o sal�rio-base
		public double getBaseSalary()
		{
			return baseSalary;
		}
		
		// calcula os lucros
		public double earnings()
		{
			return baseSalary + (comissionRate * grossSales);
		}
		
		// retorna a representa��o String do objeto Comission Employee
		@Override // indica que esse m�todo substitui um m�todo da superclasse
		public String toString()
		{
			return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n %s%s",
			"base-salaried comission employee", firstName, lastName,
			"social security number", socialSecurityNumber,
			"gross sales", grossSales, "comission rate", comissionRate,
			"base salary", baseSalary);
		}
}
