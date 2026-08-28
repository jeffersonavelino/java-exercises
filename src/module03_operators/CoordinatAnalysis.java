package module03_operators;

import java.util.Scanner;

public class CoordinatAnalysis {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int x;
		int y;
		int absolutex;
		int absolutey;
		int addition;
		int subtraction;
		int multiplication;

		System.out.println("=== COORDINATE ANALYSIS ===");

		System.out.print("Enter X: ");
		x = scanner.nextInt();

		System.out.print("Enter Y: ");
		y = scanner.nextInt();

		absolutex = Math.abs(x);
		absolutey = Math.abs(y);

		addition = x + y;
		subtraction = x - y;
		multiplication = x * y;

		System.out.printf("Point: (%d, %d)%n", x, y);
		System.out.println();
		System.out.printf("absolute value: %d%n", absolutex);
		System.out.printf("absolute value: %d%n", absolutey);
		System.out.println();
		System.out.printf("x + y: %d%n", addition);
		System.out.printf("x - y: %d%n", subtraction);
		System.out.printf("x * y: %d%n", multiplication);

		scanner.close();
	}

}
