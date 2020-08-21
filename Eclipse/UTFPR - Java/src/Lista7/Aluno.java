package Lista7;

// Superclasse aluno

public class Aluno 
{
	private String nome;
	private double faltas;
	private double nota1, nota2;
	
	// construtor
	public Aluno(String nome, double faltas, double nota1, double nota2)
	{
		this.nome = nome;
		this.faltas = faltas;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	// retorna o nome
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public double getFaltas()
	{
		return faltas;
	}
	
	public void setFaltas(int faltas)
	{
		this.faltas = faltas;
	}
	
	public double getNota1()
	{
		return nota1;
	}
	
	public void setNota1(double nota1)
	{
		this.nota1 = nota1;
	}
	
	public double getNota2()
	{
		return nota2;
	}
	
	public void setNota2(double nota2)
	{
		this.nota2 = nota2;
	}
	
	public double calcularMedia()
	{
		return (nota1 + nota2) / 2;
	}
	
	public double calcularFrequencia()
	{
		return (100 - ((faltas / 70) * 100));
	}
	
	public String status()
	{
		if ((calcularMedia() >= 6.0) && (calcularFrequencia() >= 75))
		{
			return ("Aprovado");
		}
		else if ((calcularMedia() >= 6.0) && (calcularFrequencia() < 75))
		{
			return ("Reprovado por frequencia");
		}
		else if ((calcularMedia() < 6.0) && (calcularFrequencia() >= 75))
		{
			return ("Reprovado por nota");
		}
		else 
		{
			return ("Reprovado por nota e frequencia");
		}
	}
	
	// substituição de toString do objeto aluno
	@Override
	public String toString()
	{
		return String.format("%n Nome: %s%n Faltas: %.0f (%.2f%% de Freq)%n Notas: %.2f, %.2f.%n Média: %.2f %n Status: %s", getNome(), getFaltas(), calcularFrequencia(), getNota1(), getNota2(), calcularMedia(), status());
	}
}
