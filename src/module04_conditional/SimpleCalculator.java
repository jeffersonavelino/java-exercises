package module04_conditional;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String operator;
		double firstNumber;
		double secondNumber;
		double result;

		System.out.println("=== SIMPLE CALCULATOR ===");
		System.out.println();

		System.out.println("Enter first number: ");
		firstNumber = scanner.nextDouble();

		System.out.println("Enter operator(+, -, *, /): ");
		operator = scanner.next();

		System.out.println("Enter second number: ");
		secondNumber = scanner.nextDouble();

		switch (operator) {

		case "+":
			result = firstNumber + secondNumber;
			System.out.printf("Result: %.2f%n", result);
			break;

		case "-":
			result = firstNumber - secondNumber;
			System.out.printf("Result: %.2f%n", result);
			break;

		case "*":
			result = firstNumber * secondNumber;
			System.out.printf("Result: %.2f%n", result);
			break;

		case "/":
			result = firstNumber / secondNumber;
			System.out.printf("Result: %.2f%n", result);
			break;

		default:
			System.out.println("Invalid operator");

		}

		scanner.close();
	}
}
