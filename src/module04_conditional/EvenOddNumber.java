package module04_conditional;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int number;
		int remainder;

		System.out.println("Enter an integer number: ");
		number = scanner.nextInt();

		remainder = number % 2;

		if (remainder == 0) {
			System.out.println("Even");
		} else
			System.out.println("Odd");

		scanner.close();
	}

}
