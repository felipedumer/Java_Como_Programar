package Lista9;

import java.util.ArrayList;
import java.util.Objects;

public class Faturamento {

	private int mesVenda;
	private int anoVenda;
	private ArrayList<Venda> vendas;
	
	public Faturamento(int mesVenda, int anoVenda) {
		super();
		this.mesVenda = mesVenda;
		this.anoVenda = anoVenda;
		this.vendas = new ArrayList<Venda>();
	}

	public int getMesVenda() {
		return mesVenda;
	}

	public void setMesVenda(int mesVenda) {
		this.mesVenda = mesVenda;
	}

	public int getAnoVenda() {
		return anoVenda;
	}

	public void setAnoVenda(int anoVenda) {
		this.anoVenda = anoVenda;
	}

	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}
	
	public void adicionaVenda(Venda nvenda) 
	{
		this.vendas.add(nvenda);
	}
	
	public void mostrarVenda(Vendedor vendedor)
	{
		double tVendas = 0, tComissao = 0;
		for (Venda item: vendas)
		{
			if (Objects.equals(item.getVendedor(), vendedor))
			{
				System.out.printf("%s, %d, R$: %.2f, %s, (Valor Comissão: R$: %.2f) %n", item.getNomeProduto(), item.getDiaVenda(), item.getValorVenda(), item.getVendedor(), item.valorComissao());
				//System.out.printf("%s", item.toString());
				tVendas += item.getValorVenda();
				tComissao += item.valorComissao();
			}
		}
		
		System.out.printf("%nTotal das vendas: R$: %.2f%n", tVendas);
		System.out.printf("Total Comissão: R$: %.2f%n", tComissao);
			
	}
	
}
