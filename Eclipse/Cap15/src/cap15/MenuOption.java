package cap15;

public enum MenuOption {
	// declara o conte�do do tipo enum
	ZERO_BALANCE(1),
	CREDIT_BALANCE(2),
	DEBIT_BALANCE(3),
	END(4);
	
	private final int value; // op��o atual de menu
	
	// construtor
	private MenuOption(int value)
	{
		this.value = value;
	}
}
