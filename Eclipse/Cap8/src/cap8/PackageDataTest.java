package cap8;

public class PackageDataTest {

	public static void main(String[] args) {
		PackageData packageData = new PackageData();
		
		//gera saída de representação String de packageData
		System.out.printf("After instantiation:%n%s%n", packageData);
		
		// muda os dados de acesso de pacote no objeto packageData
		packageData.number = 77;
		packageData.string = "Goodbye";
		
		// gera saída de representação String de packageData
		System.out.printf("%nAfter changing values: %n%s%n", packageData);

	}

}

// classe com variáveis de instância de acesso de pacote
class PackageData
{
	int number; // variável de instância de acesso de pacote
	String string; // variável de instância de acesso de pacote

	// constructor
	public PackageData()
	{
		number = 0;
		string = "Hello";
	}
	
	// retorna a representação String do objeto PackageData
	public String toString()
	{
		return String.format("number: %d; string: %s", number, string);
	}
}
