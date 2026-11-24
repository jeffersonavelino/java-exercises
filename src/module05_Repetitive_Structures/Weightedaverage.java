package module05_Repetitive_Structures;

import java.util.Scanner;

public class Weightedaverage {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		double average;
		int i;

		System.out.println("Weighted Average");
		System.out.println();

		System.out.println("How many sets of averages will you calculate?");
		int n = scanner.nextInt();
		System.out.println();

		for (i = 0; i < n; i++) {

			System.out.println("Insert the set of three averages");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			double z = scanner.nextDouble();

			average = ((x * 2) + (y * 3) + (z * 5)) / 10;

			System.out.printf("Average: %.1f%n", average);
			System.out.println();

		}

		scanner.close();
	}

}
