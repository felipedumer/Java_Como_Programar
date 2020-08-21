package cap10;

public class Invoice implements Payable
{
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;
	
	// construtor
	public Invoice(String partNumber, String partDescription, int quantity,
			double pricePerItem)
	{
		if (quantity < 0) // valida quantidade
			throw new IllegalArgumentException("Quantity must be >= 0");
		
		if (pricePerItem < 0.0) // valida pricePerItem
			throw new IllegalArgumentException(
					"Price per item must be >= 0");
		
		this.quantity = quantity;
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.pricePerItem = pricePerItem;
	} // fim do construtor
	
	// obt�m o n�mero da pe�a
	public String getPartNumber()
	{
		return partNumber; // deve validar
	}
	
	// obt�m a descri��o
	public String getPartDescription()
	{
		return partDescription;
	}
	
	// configura a quantidade
	public void setQuantity(int quantity)
	{
		if (quantity < 0) // valida quantidade
			throw new IllegalArgumentException("Quantity must be >= 0");
		
		this.quantity = quantity;
	}
	
	// obt�m quantidade
	public int getQuantity()
	{
		return quantity;
	}
	
	// configura pre�o por item
	public void setPricePerItem(double pricePerItem)
	{
		if (pricePerItem < 0.0) // valida pricePerItem
			throw new IllegalArgumentException(
					"Price per item must be >= 0");
		
		this.pricePerItem = pricePerItem;
	}
	
	// obt�m pre�o por item
	public double getPricePerItem()
	{
		return pricePerItem;
	}
	
	// retorno da representa��o de String do objeto Invoice
	@Override
	public String toString()
	{
		return String.format("%s: %n%s: %s (%s) %n%s: %d%n%s: $%,.2f",
				"invoice", "part number", getPartNumber(), getPartDescription(),
				"quantity", getQuantity(), "price per item", getPricePerItem());
	}
	
	// m�todo requerido para excecutar o contrato com a interface Payable
	@Override
	public double getPaymentAmount()
	{
		return getQuantity() * getPricePerItem(); // calcula o custo total
	}
}
