package module05_Repetitive_Structures;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int option = 0;
		double balance = 100.00;
		double deposit;
		double withdraw;

		while (option != 4) {

			System.out.println("1. Inquire balance");
			System.out.println("2. Deposit");
			System.out.println("3. Sacar");
			System.out.println("4. Exit");
			System.out.println();
			System.out.println("Enter option: ");
			option = scanner.nextInt();

			if (option == 1) {
				System.out.printf("Your balance is: %.2f%n", balance);
				System.out.println();

			} else if (option == 2) {
				System.out.println("Enter the value for deposit: ");
				deposit = scanner.nextDouble();

				if (deposit > 0) {
					balance += deposit;
					System.out.printf("New balance: %.2f%n", balance);
					System.out.println();

				} else {
					System.out.println("Invalid deposit");
					System.out.println();
				}

			} else if (option == 3) {
				System.out.println("Enter the value to withdraw: ");
				withdraw = scanner.nextDouble();

				if (withdraw <= balance && withdraw > 0) {
					balance -= withdraw;
					System.out.printf("New balance: %.2f%n", balance);
					System.out.println();

				} else {
					System.out.println("Invalid withdraw");
					System.out.println();
				}

			} else if (option == 4) {
				System.out.println("Thank you");
				System.out.println();

			} else {
				System.out.println("Invald option");
			}

		}

		option = scanner.nextInt();

		scanner.close();
	}

}
