package module04_conditional;

import java.util.Scanner;

public class AccessControl {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int age;
		boolean id;

		System.out.println("Enter age: ");
		age = scanner.nextInt();

		System.out.println("Enter has id (true or false): ");
		id = scanner.nextBoolean();

		if (age >= 18 && id == true) {
			System.out.println("Access granted");
		} else {
			System.out.println("Acess denied");
		}

		scanner.close();

	}

}
