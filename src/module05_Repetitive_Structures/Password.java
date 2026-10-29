package module05_Repetitive_Structures;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int password = 0;

		while (password != 2002) {

			System.out.printf("Enter password: ");
			password = scanner.nextInt();

			if (password != 2002) {
				System.out.println("invalid password");
				System.out.println();
			}
		}

		System.out.println("Released access");

		scanner.close();

	}

}
