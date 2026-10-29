package module05_Repetitive_Structures;

import java.util.Scanner;

public class CartesianSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int x;
		int y;

		System.out.printf("Enter coordinate(x): ");
		x = scanner.nextInt();
		System.out.printf("Enter coordinate(y): ");
		y = scanner.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("first quadrant");
				System.out.println();

			} else if (x > 0 && y < 0) {
				System.out.println("second quadrant");
				System.out.println();

			} else if (x < 0 && y < 0) {
				System.out.println("third quadrant");
				System.out.println();

			} else {
				System.out.println("fourth quadrant");
				System.out.println();

			}

			System.out.printf("Enter coordinate(x): ");
			x = scanner.nextInt();
			System.out.printf("Enter coordinate(y): ");
			y = scanner.nextInt();

		}

		scanner.close();
	}

}
