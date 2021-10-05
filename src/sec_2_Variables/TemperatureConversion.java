package sec_2_Variables;

public class TemperatureConversion {
	public static void main(String[] args) {
		double fahrenheit = 91;
		
		double celsius = Math.round((fahrenheit - 32) * 5.0 / 9.0);
		
		System.out.println("\n" + fahrenheit + " Fahrenheit = " + celsius + " Celsius");
	}
}
