package module04_conditional;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int code;
		double water = 2.00;
		double juice = 4.00;
		double soda = 3.50;
		double value;
		double change;

		System.out.println(" === Machine vending ===");
		System.out.println();
		System.out.printf("1 - Water $%.2f%n", water);
		System.out.printf("2 - Juice $%.2f%n", juice);
		System.out.printf("3 - Soda  $%.2f%n", soda);
		System.out.println();

		System.out.printf("Enter the amount in the machine: ");
		value = scanner.nextDouble();

		System.out.printf("Enter the product code: ");
		code = scanner.nextInt();
		System.out.println();

		switch (code) {

		case 1:

			if (value >= water) {

				change = value - water;
				System.out.println("Chose a product: 1");
				System.out.printf("Enter payment: $%.2f%n", value);
				System.out.println("Product: Water");
				System.out.printf("Price: $%.2f%n", water);
				System.out.printf("Change:$%.2f%n", change);

			} else {
				System.out.println("Insufficient payment");
			}
			break;

		case 2:

			if (value >= juice) {

				change = value - juice;
				System.out.println("Chose a product: 2");
				System.out.printf("Enter payment: $%.2f%n", value);
				System.out.println("Product: Juice");
				System.out.printf("Price: $%.2f%n", juice);
				System.out.printf("Change:$%.2f%n", change);

			} else {
				System.out.println("Insufficient payment");
			}
			break;

		case 3:

			if (value >= soda) {

				change = value - soda;
				System.out.println("Chose a product: 3");
				System.out.printf("Enter payment: $%.2f%n", value);
				System.out.println("Product: Soda");
				System.out.printf("Price: $%.2f%n", soda);
				System.out.printf("Change:$%.2f%n", change);

			} else {
				System.out.println("Insufficient payment");
			}
			break;

		default:
			System.out.println("Invalid code");

		}

		scanner.close();
	}

}
