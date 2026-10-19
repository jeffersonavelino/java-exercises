package module04_conditional;

import java.util.Scanner;

public class ShippingCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double purchaseAmount;
		double total;

		System.out.println("=== SHIPPING CALCULATOR ===");
		System.out.println();

		System.out.println("Purchase value over $200 from shipping is free");
		System.out.println("Purchase value between $100 and $200 shipping is $10");
		System.out.println("Purchase value less than $100 shipping is $20");
		System.out.println();

		System.out.println("Enter purchase amount: ");
		purchaseAmount = scanner.nextDouble();
		System.out.println();

		if (purchaseAmount >= 200) {

			total = purchaseAmount + 0;

			System.out.printf("Purchase Amount: $%.2f%n", purchaseAmount);
			System.out.println("Shipping: $0");
			System.out.printf("Total: $%.2f%n", total);

		} else if (purchaseAmount >= 100 && purchaseAmount < 200) {

			total = purchaseAmount + 10;

			System.out.printf("Purchase Amount: $%.2f%n", purchaseAmount);
			System.out.println("Shipping: $10.00");
			System.out.printf("Total: $%.2f%n", total);

		} else {

			total = purchaseAmount + 20;

			System.out.printf("Purchase Amount: $%.2f%n", purchaseAmount);
			System.out.println("Shipping: $20.00");
			System.out.printf("Total: $%.2f%n", total);

		}

		scanner.close();
	}

}
