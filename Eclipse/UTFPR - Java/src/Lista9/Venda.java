package Lista9;

public class Venda {

	private String nomeProduto;
	private int diaVenda;
	private double valorVenda;
	private Vendedor vendedor;
	
	public Venda(String nomeProduto, int diaVenda, double valorVenda, Vendedor vendedor) {
		super();
		this.nomeProduto = nomeProduto;
		this.diaVenda = diaVenda;
		this.valorVenda = valorVenda;
		this.vendedor = vendedor;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getDiaVenda() {
		return diaVenda;
	}

	public void setDiaVenda(int diaVenda) {
		this.diaVenda = diaVenda;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
    public double valorComissao()
    {
        return (valorVenda * (vendedor.getComissao() / 100));
    }
    
    @Override
    public String toString()
    {
    	return String.format("%s, %d, %f, %s Comissão: %.2f%% (Valor Comissão: R$: %.2f)"
    			, nomeProduto, diaVenda, valorVenda, vendedor, valorComissao());
    }
    
}
