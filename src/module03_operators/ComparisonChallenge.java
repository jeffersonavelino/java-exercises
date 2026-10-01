package module03_operators;

import java.util.Scanner;

public class ComparisonChallenge {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int firstNumber;
		int secondNumber;
		boolean case1;
		boolean case2;
		boolean case3;
		boolean case4;
		boolean case5;
		boolean case6;

		System.out.println("=== COMPARISON CHALLENGE ===");
		System.out.println();

		System.out.print("Enter first number: ");
		firstNumber = scanner.nextInt();

		System.out.print("Enter second number: ");
		secondNumber = scanner.nextInt();

		System.out.println();

		case1 = firstNumber > secondNumber;
		case2 = firstNumber < secondNumber;
		case3 = firstNumber == secondNumber;
		case4 = firstNumber != secondNumber;
		case5 = firstNumber >= secondNumber;
		case6 = firstNumber <= secondNumber;

		System.out.println("firstNumber > secondNumber: " + case1);
		System.out.println("firstNumber < secondNumber: " + case2);
		System.out.println("firstNumber == secondNumber: " + case3);
		System.out.println("firstNumber != secondNumber: " + case4);
		System.out.println("firstNumber >= secondNumber: " + case5);
		System.out.println("firstNumber <= secondNumber: " + case6);

		scanner.close();
	}

}
