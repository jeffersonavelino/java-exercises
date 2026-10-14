package module04_conditional;

import java.util.Scanner;

public class AgeVerification {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int age;

		System.out.println("Enter age: ");
		age = scanner.nextInt();

		if (age >= 18) {

			System.out.println("Adult");

		} else {

			System.out.println("Minor");

		}

		scanner.close();
	}

}
