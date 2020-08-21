package cap8;

public class PackageDataTest {

	public static void main(String[] args) {
		PackageData packageData = new PackageData();
		
		//gera sa�da de representa��o String de packageData
		System.out.printf("After instantiation:%n%s%n", packageData);
		
		// muda os dados de acesso de pacote no objeto packageData
		packageData.number = 77;
		packageData.string = "Goodbye";
		
		// gera sa�da de representa��o String de packageData
		System.out.printf("%nAfter changing values: %n%s%n", packageData);

	}

}

// classe com vari�veis de inst�ncia de acesso de pacote
class PackageData
{
	int number; // vari�vel de inst�ncia de acesso de pacote
	String string; // vari�vel de inst�ncia de acesso de pacote

	// constructor
	public PackageData()
	{
		number = 0;
		string = "Hello";
	}
	
	// retorna a representa��o String do objeto PackageData
	public String toString()
	{
		return String.format("number: %d; string: %s", number, string);
	}
}
