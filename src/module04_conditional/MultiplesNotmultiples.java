package module04_conditional;

import java.util.Scanner;

public class MultiplesNotmultiples {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number1;
		int number2;

		System.out.println("Enter number one: ");
		number1 = scanner.nextInt();

		System.out.println("Enter number two: ");
		number2 = scanner.nextInt();

		if (number1 % number2 == 0 || number2 % number1 == 0) {

			System.out.println("Multiples");

		} else {

			System.out.println("Not Multiples");

		}

		scanner.close();
	}

}
