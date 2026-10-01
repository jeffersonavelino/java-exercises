package module03_operators;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double productPrice;
		double downPayment;
		int installments;

		double remainingAmount;
		double monthlyPayment;

		System.out.println("=== MONTHLY PAYMENT ===");
		System.out.println();

		System.out.println("Enter product price: ");
		productPrice = scanner.nextDouble();

		System.out.println("Enter down payment: ");
		downPayment = scanner.nextDouble();

		System.out.println("Enter number of installments: ");
		installments = scanner.nextInt();
		System.out.println();

		remainingAmount = productPrice - downPayment;
		monthlyPayment = remainingAmount / installments;

		System.out.printf("Product price: $%.2f%n", productPrice);
		System.out.printf("Down Payment: $%.2f%n", downPayment);
		System.out.println();
		System.out.printf("Remaining Amount: $%.2f%n", remainingAmount);
		System.out.println("Installments: " + installments);
		System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);

		scanner.close();
	}

}
