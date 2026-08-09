package module02_scanner;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String name;
		int previousReading;
		int currentReading;
		int energyConsumption;
		Double priceKwh;
		Double serviceFee;
		Double energyCost;
		Double totalBill;
		
		System.out.println("=== STORE RECEIPT ===");
		System.out.println();

		System.out.print("Enter customer name: ");
		name = scanner.nextLine();

		System.out.print("Enter previous meter reading: ");
		previousReading = scanner.nextInt();

		System.out.print("Enter current meter reading: ");
		currentReading = scanner.nextInt();

		System.out.print("Enter price per kWh: ");
		priceKwh = scanner.nextDouble();

		System.out.print("Enter service fee: ");
		serviceFee = scanner.nextDouble();

		System.out.println();

		energyConsumption = currentReading - previousReading;
		energyCost = priceKwh * energyConsumption;
		totalBill = energyCost + serviceFee;

		System.out.println("Customer: " + name);
		System.out.println();
		System.out.println("Previous Reading: " + previousReading);
		System.out.println("Current Reading: " + currentReading);
		System.out.println();

		System.out.println("Energy Consumption: " + energyConsumption + " KWh");
		System.out.printf("Energy Cost: $%.2f%n", energyCost);
		System.out.printf("Service Fee: $%.2f%n", serviceFee);
		System.out.println();

		System.out.printf("Total Bill: $%.2f%n", totalBill);

		scanner.close();
	}
}
