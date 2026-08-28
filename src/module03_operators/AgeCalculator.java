package module03_operators;

import java.util.Scanner;

public class AgeCalculator {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int birthYear;
		int currentYear;
		int age;
		int ageMonths;
		int ageDays;

		System.out.println("=== AGE CALCULATOR ===");
		System.out.println();

		System.out.print("Enter birth year: ");
		birthYear = scanner.nextInt();

		System.out.print("Enter current year: ");
		currentYear = scanner.nextInt();

		System.out.println();

		age = currentYear - birthYear;
		ageMonths = age * 12;
		ageDays = age * 365;

		System.out.printf("Age: %d%n", age);
		System.out.printf("Age in months: %d%n", ageMonths);
		System.out.printf("Age in days: %d%n", ageDays);

		scanner.close();
	}

}
