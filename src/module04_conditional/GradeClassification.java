package module04_conditional;

import java.util.Scanner;

public class GradeClassification {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double grade;

		System.out.println("Enter grade: ");
		grade = scanner.nextDouble();

		if (grade >= 7) {

			System.out.println("Approved");

		} else if (grade >= 5) {

			System.out.println("Recovery");

		} else {

			System.out.println("Failed");
		}

		scanner.close();

	}

}
