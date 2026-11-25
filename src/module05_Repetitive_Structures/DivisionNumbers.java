package module05_Repetitive_Structures;

import java.util.Scanner;

public class DivisionNumbers {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int i;
		double division;

		System.out.println("Division of numbers");
		System.out.println();

		System.out.println("Enter how many pairs of numbers will be calculated for division?");
		int n = scanner.nextInt();
		System.out.println();

		for (i = 0; i < n; i++) {

			System.out.println("Enter the two numbers");
			double x = scanner.nextInt();
			double y = scanner.nextInt();
			System.out.println();

			if (y == 0) {

				System.out.println("impossible division");
				System.out.println();

			} else {

				division = x / y;
				System.out.printf("%.1f%n", division);
				System.out.println();

			}

		}

		scanner.close();

	}

}
