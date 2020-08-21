package Lista9;

public class FaturamentoMain {

	public static void main(String[] args) {
		
        Vendedor juca = new Vendedor("Juca Bala", 'M', new Data(10, 5, 1980), 1.5);
        Vendedor maria = new Vendedor("Marília de Dirceu", 'F', new Data(3, 8, 1982), 2.0);
        
        Faturamento faturamento = new Faturamento(4, 2017);
        
        faturamento.adicionaVenda(new Venda("A", 3, 550.00, juca));
        faturamento.adicionaVenda(new Venda("X", 10, 650.00, juca));
        faturamento.adicionaVenda(new Venda("M", 15, 130.00, maria));
        faturamento.adicionaVenda(new Venda("Q", 24, 440.00, juca));
        faturamento.adicionaVenda(new Venda("B", 12, 100.00, maria));
        faturamento.adicionaVenda(new Venda("Y", 17, 330.00, maria));
        
        faturamento.mostrarVenda(juca);
        System.out.println();
        faturamento.mostrarVenda(maria);

	}

}
