package cap15;
import java.io.Serializable;

public class Account implements Serializable {
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	// inicializa uma Account com valores padr�o
	public Account()
	{
		this(0, "", "", 0.0); // chama outro construtor
	}
	
	// inicializa uma Account com os valores fornecidos
	public Account(int account, String firstName,
			String lastName, double balance)
	{
		this.account = account;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	
	// configura o n�mero de conta
	public void setAccount(int acct)
	{
		this.account = account;
	}
	
	// obt�m o n�mero de conta
	public int getAccount()
	{
		return account;
	}
	
	// configura o nome
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	// obt�m o nome
	public String getFirstName()
	{
		return firstName;
	}
	
	// configura o sobrenome
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	// obt�m o sobrenome
	public String getLastName()
	{
		return lastName;
	}
	
	// configura o saldo
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	// obt�m o saldo
	public double getBalance()
	{
		return balance;
	}
}
