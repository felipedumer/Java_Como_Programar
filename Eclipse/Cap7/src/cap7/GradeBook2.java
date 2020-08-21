package cap7;

public class GradeBook2 {
	private String courseName; // nome de curso que este livro de nota representa
	private int[][] grades; // array bidimensional de notas de aluno
	
	// construtor de dois argumentos inicializa courseName e array de notas
	public GradeBook2(String courseName, int[][] grades)
	{
		this.courseName = courseName;
		this.grades = grades;
	}
	
	// m�todo para configurar o nome do curso
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	
	// m�todo para recuperar o nome do curso
	public String getCourseName()
	{
		return courseName;
	}

	// realiza v�rias opera��es nos dados
	public void processGrades()
	{
		// gera sa�da de array de notas
		outputGrades();
		
		// chama m�todos getMinimum e getMaximum
		System.out.printf("%n%s %d%n%s %d%n%n",
				"Lowest grade in the grade book is", getMinimum(),
				"Highest grade in the grade book is", getMaximum());
		
		// gera a sa�da de gr�fico de distribui��o de notas de todas as notas em todos os testes 
		outputBarChart();
	}
	
	// localiza nota m�nima
	public int getMinimum()
	{
		// sup�e que o primeiro elemento de array de notas � o menor
		int lowGrade = grades[0][0];
		
		// faz um loop pelas linhas do array de notas
		for (int[] studentGrades : grades)
		{
			// faz um loop pelas colunas da linha atual
			for (int grade : studentGrades)
			{
				// se a nota for menor que lowGrade, atribui a nota a lowGrade
				if (grade < lowGrade)
					lowGrade = grade;
			}
		}
		return lowGrade;
	}
	
	// localiza nota m�xima
	public int getMaximum()
	{
		// sup�e que o primeiro elemento de array de notas � o maior
		int highGrade = grades[0][0];
		
		// faz um loop pelas linhas do array de notas
		for (int[] studentGrades : grades)
		{
			// faz um loop pelas colunas da linha atual
			for (int grade : studentGrades)
			{
				// se a nota for maior que highGrade, atribui esas nota a highGrade
				if (grade > highGrade)
					highGrade = grade;
			}
		}
		
		return highGrade;
		
	}
	
	// determina a m�dia do conjunto particular de notas
	public double getAverage(int[] setOfGrades)
	{
		int total = 0;
		
		// soma notas de um aluno
		for (int grade : setOfGrades)
			total += grade;

		// retorna m�dia de notas
		return (double) total / setOfGrades.length;
	}
	
	// gera a sa�da do gr�fico de barras para exibir distribui��o total de notas
	public void outputBarChart()
	{
		System.out.println("Overall grade distribution:");
		
		// armazena frequ�ncia de notas em cada intervalo de 10 notas
		int[] frequency = new int[11];
		
		// para cada nota em GradeBook, incrementa a frequ�ncia apropriada
		for (int[] studentGrades : grades)
		{
			for (int grade : studentGrades)
				++frequency[grade / 10];
		}
		
		// para cada frequ�ncia da nota, imprime barra no gr�fico
		for (int count = 0; count < frequency.length; count++)
		{
			// gera sa�da do r�tulo de barra ("00-09: ", "90-99: "....)
			if (count == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", 
						count * 10, count * 10 + 9);
			
			// imp�rime a barra de asteriscos
			for (int stars = 0; stars < frequency[count]; stars++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	// gera a sa�da do conte�do do array de notas
	public void outputGrades()
	{
		System.out.printf("The grades are:%n%n");
		System.out.print("		"); // alinha t�tulos de coluna
		
		// cria um t�tulo de coluna para cada um dos testes
		for (int test = 0; test < grades[0].length; test++)
			System.out.printf("Test %d ", test + 1);
		
		System.out.println("Average"); // t�tulo da coluna de m�dia do aluno
		
		// cria linhas/colunas de texto que representam notas de array
		for (int student = 0; student < grades.length; student++)
		{
			System.out.printf("Student %2d", student + 1);
			
			for (int test : grades[student]) // gera sa�da de notas do aluno
				System.out.printf("%8d", test);
			
			// chama m�todo getAverage para calcular a m�dia do aluno;
			// passa linha de notas como o argumento para getAverage
			double average = getAverage(grades[student]);
			System.out.printf("%9.2f%n", average);
		}
	}
}
