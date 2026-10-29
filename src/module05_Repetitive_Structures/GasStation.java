package module05_Repetitive_Structures;

import java.util.Scanner;

public class GasStation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int code;
		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		String mensage = "Thanks";

		System.out.printf("Enter code: ");
		code = scanner.nextInt();
		System.out.println();

		while (code != 4) {

			if (code == 1) {

				alcohol = alcohol + 1;
				System.out.println(mensage);
				System.out.printf("Alcohol: %d%n", alcohol);
				System.out.printf("Gasoline: %d%n", gasoline);
				System.out.printf("Diesel: %d%n", diesel);
				System.out.println();

			} else if (code == 2) {

				gasoline = gasoline + 1;
				System.out.println(mensage);
				System.out.printf("Alcohol: %d%n", alcohol);
				System.out.printf("Gasoline: %d%n", gasoline);
				System.out.printf("Diesel: %d%n", diesel);
				System.out.println();

			} else if (code == 3) {

				diesel = diesel + 1;
				System.out.println(mensage);
				System.out.printf("Alcohol: %d%n", alcohol);
				System.out.printf("Gasoline: %d%n", gasoline);
				System.out.printf("Diesel: %d%n", diesel);
				System.out.println();

			} else if (code > 4) {

				System.out.println(mensage);
				System.out.printf("Alcohol: %d%n", alcohol);
				System.out.printf("Gasoline: %d%n", gasoline);
				System.out.printf("Diesel: %d%n", diesel);
				System.out.println();

			}

			System.out.println("Enter code: ");
			code = scanner.nextInt();

		}

		scanner.close();
	}

}
