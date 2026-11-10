package module05_Repetitive_Structures;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x;
		int y;

		System.out.printf("Enter value 1: ");
		x = scanner.nextInt();
		System.out.printf("Enter value 2: ");
		y = scanner.nextInt();
		System.out.println();

		while (x != y) {

			if (x > y) {

				System.out.println("Decreasing");
				System.out.println();

			} else {

				System.out.println("Increasing");
				System.out.println();
			}

			System.out.printf("Enter value 1: ");
			x = scanner.nextInt();
			System.out.printf("Enter value 2: ");
			y = scanner.nextInt();
			System.out.println();

		}

		System.out.println("Equal");

		scanner.close();

	}

}
