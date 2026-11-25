package module05_Repetitive_Structures;

import java.util.Scanner;

public class FactorialCalculation {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int i;
		int factorial = 1;

		System.out.println("Factorial Calculation");
		System.out.println();

		System.out.println("enter the number for the factorial calculation: ");
		int n = scanner.nextInt();

		for (i = 1; i <= n; i++) {

			factorial *= i;

		}

		System.out.printf("Factorial is: %d%n", factorial);

		scanner.close();

	}

}
