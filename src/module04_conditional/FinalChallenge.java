package module04_conditional;

import java.util.Scanner;

public class FinalChallenge {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String student;
		double grade1;
		double grade2;
		double average;

		System.out.println("=== STUDENT RESULT ===");
		System.out.println();

		System.out.printf("Enter student name: ");
		student = scanner.nextLine();

		System.out.printf("Enter grade 1: ");
		grade1 = scanner.nextDouble();

		System.out.printf("Enter grade 2: ");
		grade2 = scanner.nextDouble();

		System.out.println();

		average = (grade1 + grade2) / 2;

		if (average >= 7) {

			System.out.println("Student: " + student);
			System.out.printf("Grade 1: %.2f%n", grade1);
			System.out.printf("Grade 2: %.2f%n", grade2);
			System.out.printf("Average: %.2f%n", average);
			System.out.println();
			System.out.println("Result: Approved");

		} else if (average >= 5 && average < 7) {

			System.out.println("Student: " + student);
			System.out.printf("Grade 1: %.2f%n", grade1);
			System.out.printf("Grade 2: %.2f%n", grade2);
			System.out.println();
			System.out.printf("Average: %.2f%n", average);
			System.out.println("Result: Recovery");

		} else {

			System.out.println("Student: " + student);
			System.out.printf("Grade 1: %.2f%n", grade1);
			System.out.printf("Grade 2: %.2f%n", grade2);
			System.out.println();
			System.out.printf("Average: %.2f%n", average);
			System.out.println("Result: Failed");

		}

		scanner.close();

	}

}
