package module04_conditional;

import java.util.Scanner;

public class AtmMenu {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int option;
		double value = 500.00;
		double deposit;
		double newDeposit;
		double newValue;
		double withdraw;

		System.out.println("=== ATM MENU ===");
		System.out.println();
		System.out.println("1 - Check balance");
		System.out.println("2 - Deposit");
		System.out.println("3 - Withdraw");
		System.out.println();

		System.out.println("Choose an option: ");
		option = scanner.nextInt();

		switch (option) {

		case 1:
			System.out.printf("Balance: $%.2f%n", value);
			break;

		case 2:
			System.out.println("Enter deposit: ");
			newDeposit = scanner.nextDouble();

			if (newDeposit > 0) {
				deposit = newDeposit + value;
				System.out.printf("New value: $%.2f%n", deposit);
			} else {
				System.out.println("Invalid deposit");
			}
			break;

		case 3:
			System.out.println("Enter the withdrawal amount: ");
			withdraw = scanner.nextDouble();

			if (withdraw > 0 && withdraw <= value) {
				newValue = value - withdraw;
				System.out.printf("New value: $%.2f%n", newValue);
			} else {
				System.out.println("Withdraw invalid");
			}

			break;

		default:
			System.out.println("Invalid option");

		}

		scanner.close();

	}

}
