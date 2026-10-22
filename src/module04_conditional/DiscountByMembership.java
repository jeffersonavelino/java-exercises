package module04_conditional;

import java.util.Scanner;

public class DiscountByMembership {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String membership;
		double amount;
		double discount;
		double price;

		System.out.println("=== DISCOUNT CALCULATOR ===");
		System.out.println();

		System.out.println("Enter membership (regular/silver/gold): ");
		membership = scanner.nextLine();

		System.out.println("Enter purchase amount: ");
		amount = scanner.nextDouble();
		System.out.println();

		switch (membership) {

		case "regular":

			discount = amount * 0;
			price = amount - discount;

			System.out.println("Membership: regular");
			System.out.println("discount: 0%");
			System.out.printf("Discount amount: $%.2f%n", discount);
			System.out.printf("Final price: $%.2f%n", price);
			break;

		case "silver":

			discount = amount * .05;
			price = amount - discount;

			System.out.println("Membership: regular");
			System.out.println("discount: 5%");
			System.out.printf("Discount amount: $%.2f%n", discount);
			System.out.printf("Final price: $%.2f%n", price);
			break;

		case "gold":

			discount = amount * .10;
			price = amount - discount;

			System.out.println("Membership: regular");
			System.out.println("discount: 10%");
			System.out.printf("Discount amount: $%.2f%n", discount);
			System.out.printf("Final price: $%.2f%n", price);
			break;

		default:

			System.out.println("Invalid membership");

		}

		scanner.close();
	}
}
