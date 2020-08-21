package Lista4;

public class Segundo {

	public static void main(String[] args) {
		for (int i = 1000; i < 9999; i++) 
		{
			verificaNum(i);
		}

	}
	
	
	public static void verificaNum(int val)
	{
		int num1 = (val / 100);
		int num2 = (val % 100);
		if (((num1 + num2) * (num1+num2)) == val) {
			System.out.printf("%nO número %d apresenta a sequência.", val);
		}
	}

}
