package module03_operators;

import java.util.Scanner;

public class OperatorChallenge {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number;
		int divided2;
		int divided5;
		int divided10;

		int remainder2;
		int remainder5;
		int remainder10;

		System.out.println("=== OPERATOR CHALLENGE ===");
		System.out.println();

		System.out.println("Enter number: ");
		number = scanner.nextInt();

		divided2 = number / 2;
		remainder2 = number % 2;

		divided5 = number / 5;
		remainder5 = number % 5;

		divided10 = number / 10;
		remainder10 = number % 10;

		System.out.println("Number: " + number);
		System.out.println();

		System.out.println("Divided by 2: " + divided2);
		System.out.println("Remainder by 2: " + remainder2);
		System.out.println();

		System.out.println("Divided by 5: " + divided5);
		System.out.println("Remainder by 5: " + remainder5);
		System.out.println();

		System.out.println("Divided by 10: " + divided10);
		System.out.println("Remainder by 10: " + remainder10);
		System.out.println();

		scanner.close();

	}

}
