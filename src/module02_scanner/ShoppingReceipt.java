package module02_scanner;

import java.util.Scanner;

public class ShoppingReceipt {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String nameProduct1;
		String nameProduct2;
		int quantityProduct1;
		int quantityProduct2;
		double priceUnit1;
		double priceUnit2;
		double totalPrice1;
		double totalPrice2;
		double total;

		System.out.println("=== SHOPPING RECEIPT ===");
		System.out.println();

		System.out.print("Enter first product name: ");
		nameProduct1 = scanner.nextLine();
		System.out.print("Enter quantity: ");
		quantityProduct1 = scanner.nextInt();
		System.out.print("Enter unit price: ");
		priceUnit1 = scanner.nextDouble();

		// Removes the leftover Enter from nextInt() and nextDouble() before using
		// nextLine() to read a String
		scanner.nextLine();

		System.out.println();

		System.out.print("Enter second product name: ");
		nameProduct2 = scanner.nextLine();
		System.out.print("Enter quantity: ");
		quantityProduct2 = scanner.nextInt();
		System.out.print("Enter unit price: ");
		priceUnit2 = scanner.nextDouble();

		System.out.println();

		totalPrice1 = priceUnit1 * quantityProduct1;
		totalPrice2 = priceUnit2 * quantityProduct2;
		total = totalPrice1 + totalPrice2;

		System.out.println("Product 1");
		System.out.println("Name: " + nameProduct1);
		System.out.printf("Quantity: %d%n", quantityProduct1);
		System.out.printf("Unit Price: $%.2f%n", priceUnit1);
		System.out.printf("Total: $%.2f%n", totalPrice1);

		System.out.println();

		System.out.println("Product 2");
		System.out.println("Name: " + nameProduct2);
		System.out.printf("Quantity: %d%n", quantityProduct2);
		System.out.printf("Unit Price: $%.2f%n", priceUnit2);
		System.out.printf("Total: $%.2f%n", totalPrice2);
		System.out.println();

		System.out.printf("Purchase total: $%.2f%n", total);

		scanner.close();
	}

}
