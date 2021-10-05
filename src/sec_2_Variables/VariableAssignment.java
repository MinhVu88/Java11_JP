package sec_2_Variables;

public class VariableAssignment {
	public static void main(String[] args) {
		int value1 = 7;
		int value2 = 23;
		
		System.out.println("\nvalue1: " + value1 + " | value2: " + value2);
		
		value1 = value2;
		value2 = value1 + 7;
		
		System.out.println("\nvalue1: " + value1 + " | value2: " + value2);
	}
}
