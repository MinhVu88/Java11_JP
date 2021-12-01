package sec_3_Strings;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // concatenate multiple strings
    String firstName = "Maynard";
    String middleName = "James";
    String lastName = "Keenan";

    System.out.println(
      "My full name: " + 
      firstName + 
      " " + 
      middleName + 
      " " + 
      lastName
    );

    // control characters: \n, \t
    System.out.println(
      "\nSelect an option:" + 
      "\n\t1. Add an entry" +
      "\n\t2. View the database" +
      "\n\t3. Exit"
    );

    // format specifiers
    System.out.printf("\nMath.PI -> %.2f", Math.PI);
    System.out.printf("\nTool's guitarist -> %s", "Adam Thomas Jones");
    System.out.printf("\n%s %d years old", "Adam's", 2021 - 1965);

    // the Scanner class & a format specifier example
    Scanner scanner = new Scanner(System.in);

    System.out.print("\n\nFahrenheit: ");

    double fahrenheit = scanner.nextDouble();
		
		double celsius = (fahrenheit - 32) * 5.0 / 9.0;
		
		System.out.printf("%.1f Fahrenheit = %.2f Celsius", fahrenheit, celsius);

    scanner.close();
  }
}
