package sec_2_Variables;

public class Arithmetic {
	public static void main(String[] args) {
		int value1, value2;
		double value3, value4;
		
		// Addition
		value1 = 10; value2 = 3;
		System.out.println("\n" + value1 + " + " + value2 + " = " + (value1 + value2));
		
		// Subtraction
		System.out.println("\n" + value1 + " - " + value2 + " = " + (value1 - value2));
		
		// Multiplication
		System.out.println("\n" + value1 + " * " + value2 + " = " + (value1 * value2));
		
		// Division
		value3 = 10.0; value4 = 3.0;
		System.out.println("\n" + value1 + " / " + value2 + " = " + (value1 / value2));
		System.out.println(value3 + " / " + value4 + " = " + (value3 / value4));
		System.out.println(value1 + " / " + value4 + " = " + (value1 / value4));
	}
}
