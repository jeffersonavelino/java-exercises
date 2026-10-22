package module04_conditional;

import java.util.Scanner;

public class GradeMessage {

	public static void main(String args[]) {

		System.out.println("=== GRADE MESSAGE ===");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		String grade;

		System.out.println("Enter grade (A, B, C, D, F): ");
		grade = scanner.nextLine();

		switch (grade) {

		case "A":
			System.out.println("Excellent");
			break;

		case "B":
			System.out.println("very Good");
			break;

		case "C":
			System.out.println("Good");
			break;

		case "D":
			System.out.println("Needs Improvement");
			break;

		case "F":
			System.out.println("Failed");
			break;

		default:
			System.out.println("Invalid grade");

		}

		scanner.close();

	}

}
