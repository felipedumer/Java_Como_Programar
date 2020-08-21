package Lista9;

public class Vendedor extends Pessoa {
	
	private double comissao;
	
	public Vendedor(String nome, char sexo, Data dtNasc, double comissao) {
		super(nome, sexo, dtNasc);
		this.comissao = comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public String toString() 
	{
		return String.format("%s , Comissão: %.2f%%", super.getNome(), getComissao());
	}
	
}
