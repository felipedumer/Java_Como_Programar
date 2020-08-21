package Lista7;

public class AlunoMain {

	public static void main(String[] args) 
	{
		Aluno aluno1 = new Aluno("Felipe", 10, 6, 6);
		Aluno aluno2 = new Aluno("Luizinho", 50, 3, 2);
		Aluno aluno3 = new Aluno("Juca bala", 6, 7.5, 6.3);
		Aluno aluno4 = new Aluno("Maria da bala", 4, 8.0, 9.5);
		
		System.out.printf("%s%n", aluno1.toString());
		System.out.printf("%s%n", aluno2.toString());
		System.out.printf("%s%n", aluno3.toString());
		System.out.printf("%s%n", aluno4.toString());
	}

}
