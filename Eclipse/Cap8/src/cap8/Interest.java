package cap8;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {

	public static void main(String[] args) {
		// quantidade principal antes dos juros
		BigDecimal principal = BigDecimal.valueOf(1000.0);
		BigDecimal rate = BigDecimal.valueOf(0.05); // taxa de juros
		
		// exibe cabeçalhos
		System.out.printf("%s%20s%n",  "Year", "Amount on deposit");
		
		// calclula quantidade de depósito para cada um dos dez anos
		for (int year = 1; year <= 10; year++)
		{
			// calcula nova quantidade durante ano especificado
			BigDecimal amount = 
					principal.multiply(rate.add(BigDecimal.ONE).pow(year));
			
			// exbide o ano e a quantidade
			System.out.printf("%4d%20s%n", year,
					NumberFormat.getCurrencyInstance().format(amount));
		}
		
	}

}
