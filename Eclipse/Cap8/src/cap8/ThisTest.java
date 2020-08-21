package cap8;

public class ThisTest {

	public static void main(String[] args) {
		SimpleTime time = new SimpleTime(15, 30, 19);
		System.out.println(time.buildString());

	}
}

// classe SimpleTime demonstra a refer�ncia "this"

class SimpleTime
{
	private int hour; // 0-23
	private int minute; // 0-59
	private int second; // 0-59
	
	// se o construtor utilizar nomes de par�metro id�nticos a 
	// nomes de vari�veis de inst�ncia e refer�ncia "this" ser�
	// exigida para distinguir entre os nomes
	public SimpleTime(int hour, int minute, int second)
	{
		this.hour = hour; // configura a hora do objeto this
		this.minute = minute; // configura o minuto do objeto this
		this.second = second; // configura o segundo do objeto this
	}
	
	// utilizam "this" expl�cito e impl�cito para chamar toUniversalString
	public String buildString()
	{
		return String.format("%24s: %s%n%25s: %s",
				"this.toUniversalString()", this.toUniversalString(),
				"toUniversalString()", toUniversalString());
	}
	
	// converte em String no formato de data/hora universal (HH:MM:SS)
	public String toUniversalString()
	{
		// "this" n�o � requerido aqui para acessar vari�veis de inst�ncia,
		// porque o m�todo n�o tem vari�veis locais com os mesmos
		// nomes das vari�veis de inst�ncia
		return String.format("%02d:%02d:%02d",
				this.hour, this.minute, this.second);
	}
}