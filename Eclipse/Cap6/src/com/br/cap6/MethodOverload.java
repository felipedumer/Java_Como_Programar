package com.br.cap6;

public class MethodOverload {

	public static void main(String[] args) {
		System.out.printf("Square for integer 7 is %d%n", square(7));
		System.out.printf("Square for double 7.5 is %f%n", square(7.5));

	}
	
	// método square com argumento de int
	public static int square(int intValue)
	{
		System.out.printf("%nCalled square with int argument: %d%n", 
				intValue);
		return intValue * intValue;
	}

	// método square com argumento double
	public static double square (double doubleValue)
	{
		System.out.printf("%nCalled square with double argument: %f%n", 
				doubleValue);
		return doubleValue * doubleValue;
	}
}
