package module04_conditional;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int firstNumber;
		int secondNumber;

		System.out.println("Enter first number: ");
		firstNumber = scanner.nextInt();

		System.out.println("Enter second number: ");
		secondNumber = scanner.nextInt();

		System.out.println("First number: " + firstNumber);
		System.out.println("Second number: " + secondNumber);
		System.out.println();

		if (firstNumber > secondNumber) {

			System.out.println("Largest: " + firstNumber);

		} else if (secondNumber > firstNumber) {

			System.out.println("Largest: " + secondNumber);

		} else {

			System.out.println("Equal: " + firstNumber);

		}

		scanner.close();

	}

}
