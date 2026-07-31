package module02_scanner;
import java.util.Scanner;

public class BasicCalculator {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double firstNumber;
		double secondNumber;
		double addition;
		double subtraction;
		double multiplication;
		double division;
		
		System.out.println("== BASIC CALCULATOR ==");
		System.out.println();
		
		System.out.println("Enter the frist number: ");
		firstNumber = scanner.nextDouble();
		System.out.println();

		
		System.out.println("Enter the second number: ");
		secondNumber = scanner.nextDouble();
		System.out.println();
				
		addition = firstNumber + secondNumber;
		subtraction = firstNumber - secondNumber;
		multiplication = firstNumber * secondNumber;
		division = firstNumber / secondNumber;
		
		System.out.println("First Number: " + firstNumber);
		System.out.println("Second Number: " + secondNumber);
		
		System.out.printf("Addition: %.2f%n", addition);
		System.out.printf("Subtraction: %.2f%n", subtraction);
		System.out.printf("Multiplication: %.2f%n", multiplication);
		System.out.printf("Division: %.2f%n", division);

		scanner.close();
		
	}
	
}
