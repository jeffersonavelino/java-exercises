package module04_conditional;

import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number;

		System.out.println("Enter an integer number: ");
		number = scanner.nextInt();

		if (number >= 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");

		}

		scanner.close();

	}

}
