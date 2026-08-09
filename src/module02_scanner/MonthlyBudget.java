package module02_scanner;

import java.util.Scanner;

public class MonthlyBudget {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Double salary;
		Double rent;
		Double foodExpenses;
		Double transportation;
		Double internet;
		Double utilities;
		Double totalExpenses;
		Double remainingBalance;

		System.out.println("=== MONTHLY BUDGET ===");
		System.out.println();

		System.out.print("Enter salary: ");
		salary = scanner.nextDouble();

		System.out.print("Enter rent: ");
		rent = scanner.nextDouble();

		System.out.print("Enter food expenses: ");
		foodExpenses = scanner.nextDouble();

		System.out.print("Enter transportation: ");
		transportation = scanner.nextDouble();

		System.out.print("Enter internet: ");
		internet = scanner.nextDouble();

		System.out.print("Enter utilities: ");
		utilities = scanner.nextDouble();
		System.out.println();

		totalExpenses = rent + foodExpenses + transportation + internet + utilities;
		remainingBalance = salary - totalExpenses;

		System.out.printf("Income: $%.2f%n", salary);
		System.out.printf("Rent: $%.2f%n", rent);
		System.out.printf("Food: $%.2f%n", foodExpenses);
		System.out.printf("Transportation: $%.2f%n", transportation);
		System.out.printf("Internet: $%.2f%n", internet);
		System.out.printf("utilities: $%.2f%n", utilities);
		System.out.println();
		System.out.printf("Total Expenses: $%.2f%n", totalExpenses);
		System.out.printf("Remaining Balance: $%.2f%n", remainingBalance);

		scanner.close();
	}

}
