package module02_scanner;

import java.util.Scanner;

public class StudentAverage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String student;
		double firstGrade;
		double secondGrade;
		double thirdGrade;
		double average;

		System.out.println("== STUDENT AVERAGE ==");

		System.out.println("Enter the student's name:");
		student = scanner.nextLine();

		System.out.println("Enter the first grade:");
		firstGrade = scanner.nextDouble();

		System.out.println("Enter the second grade:");
		secondGrade = scanner.nextDouble();

		System.out.println("Enter the tird grade:");
		thirdGrade = scanner.nextDouble();

		average = (firstGrade + secondGrade + thirdGrade) / 3;

		System.out.println("Student: " + student);
		System.out.printf("First Grade: %.2f%n", firstGrade);
		System.out.printf("Second Grade: %.2f %n", secondGrade);
		System.out.printf("Third Grade: %.2f %n", thirdGrade);
		System.out.printf("Average: %.2f %n", average);

		scanner.close();

	}

}
