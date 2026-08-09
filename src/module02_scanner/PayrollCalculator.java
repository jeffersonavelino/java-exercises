package module02_scanner;

import java.util.Scanner;

public class PayrollCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String name;
		double hoursWorked;
		double hourlyRate;
		double bonus;
		double tax;
		double baseSalary;
		double grossSalary;

		double netSalary;

		System.out.println("=== PAYROLL CALCULATOR ===");

		System.out.print("Enter employee name: ");
		name = scanner.nextLine();

		System.out.print("Enter hours worked: ");
		hoursWorked = scanner.nextDouble();

		System.out.print("Enter hourly rate: ");
		hourlyRate = scanner.nextDouble();

		System.out.print("Enter bonus (%): ");
		bonus = scanner.nextDouble();

		System.out.print("Enter tax (%): ");
		tax = scanner.nextDouble();
		System.out.println();

		grossSalary = hoursWorked * hourlyRate;
		bonus = (bonus / 100) * grossSalary;
		baseSalary = grossSalary + bonus;
		tax = (tax / 100) * baseSalary;

		netSalary = baseSalary - tax;

		System.out.println("Employee: " + name);
		System.out.println();
		System.out.printf("Gross Salary: $%.2f%n", grossSalary);
		System.out.printf("Bonus: $%.2f%n", bonus);
		System.out.printf("Tax: $%.2f%n", tax);
		System.out.println();

		System.out.printf("Net Salary: $%.2f%n", netSalary);

		scanner.close();
	}

}
