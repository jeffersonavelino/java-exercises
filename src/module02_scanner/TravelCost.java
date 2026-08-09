package module02_scanner;

import java.util.Scanner;

public class TravelCost {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double distance;
		double consumption;
		double fuelPrice;
		double tollCost;
		double fuelNeeded;
		double fuelCost;
		double totalCost;

		System.out.println("=== TRAVEL COST ===");
		System.out.println();

		System.out.print("Enter distance (km): ");
		distance = scanner.nextDouble();

		System.out.print("Enter vehiclie consumption (km/L): ");
		consumption = scanner.nextDouble();

		System.out.print("Enter fuel price: ");
		fuelPrice = scanner.nextDouble();

		System.out.print("Enter toll cost: ");
		tollCost = scanner.nextDouble();

		System.out.println();

		fuelNeeded = distance / consumption;
		fuelCost = fuelNeeded * fuelPrice;

		totalCost = fuelCost + tollCost;

		System.out.printf("Distance (km): ", distance);
		System.out.printf("Fuel Needed:  %.2f L%n", fuelNeeded);
		System.out.printf("Fuel Cost: $%.2f%n", fuelCost);
		System.out.printf("Toll Cost: $%.2f%n", tollCost);
		System.out.println();

		System.out.printf("Total trip cost: $%.2f%n", totalCost);

		scanner.close();
	}

}
