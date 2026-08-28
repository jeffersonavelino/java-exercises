package module03_operators;

import java.util.Scanner;

public class NumberAnalysis {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number;
		double doublee;
		double triple;
		double half;

		double remainderDivided2;
		double remainderDivided5;
		double remainderDivided10;

		System.out.println("=== NUMBER ANALYSIS ===");

		System.out.print("Number: ");
		number = scanner.nextInt();

		doublee = number * 2;
		triple = number * 3;
		half = number / 2;

		remainderDivided2 = number % 2;
		remainderDivided5 = number % 5;
		remainderDivided10 = number % 10;

		System.out.printf("Double: %.2f%n", doublee);
		System.out.println("Triple: " + triple);
		System.out.printf("Half: %.2f%n", half);

		System.out.printf("Remainder when divided by 2: %.2f%n", remainderDivided2);
		System.out.printf("Remainder when divided by 5: %.2f%n", remainderDivided5);
		System.out.printf("Remainder when divided by 10: %.2f%n", remainderDivided10);

		scanner.close();

	}

}
