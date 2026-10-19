package module04_conditional;

import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double productPrice;
		double discountAmount;
		double finalPrice;

		System.out.println("=== DISCONU CALCULATOR ===");
		System.out.println();

		System.out.println(" -$100 0% | $100-$200 5% | +$200 %10");
		System.out.println();

		System.out.println("Enter product price: ");
		productPrice = scanner.nextDouble();
		System.out.println();

		if (productPrice >= 200) {

			discountAmount = productPrice * .10;
			finalPrice = productPrice - discountAmount;

			System.out.printf("Product Price: $%.2f%n", productPrice);
			System.out.println("Discount: 10%");
			System.out.printf("Discount Amount: $%.2f%n", discountAmount);
			System.out.printf("Final price: $%.2f%n", finalPrice);

		} else if (productPrice >= 100 && productPrice < 200) {

			discountAmount = productPrice * .05;
			finalPrice = productPrice - discountAmount;

			System.out.printf("Product Price: $%.2f%n", productPrice);
			System.out.println("Discount: 5%");
			System.out.printf("Discount Amount: $%.2f%n", discountAmount);
			System.out.printf("Final price: $%.2f%n", finalPrice);

		} else {

			discountAmount = productPrice * 0;
			finalPrice = productPrice - discountAmount;

			System.out.printf("Product Price: $%.2f%n", productPrice);
			System.out.println("Discount: 0%");
			System.out.printf("Discount Amount: $%.2f%n", discountAmount);
			System.out.printf("Final price: $%.2f%n", finalPrice);

		}

		scanner.close();
	}

}
