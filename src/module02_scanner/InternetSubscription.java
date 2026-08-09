package module02_scanner;
import java.util.Scanner;

public class InternetSubscription {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String name;
		double planPrice;
		double extraUsed;
		double priceExtra;
		double extraCharge;
		double total;

		System.out.println("== INTERNET SUBSCRIPTION ==");
		System.out.println();

		System.out.print("Customer name: ");
		name = scanner.nextLine();

		System.out.print("Monthly Plan Price: ");
		planPrice = scanner.nextDouble();

		System.out.print("Extra data used (GB): ");
		extraUsed = scanner.nextDouble();

		System.out.print("Price per extra GB: ");
		priceExtra = scanner.nextDouble();

		extraCharge = extraUsed * priceExtra;
		total = planPrice + extraCharge;

		System.out.println();
		System.out.println("Customer name: " + name);
		System.out.println();
		System.out.printf("Monthly plan: $%.2f%n", planPrice);
		System.out.println();
		System.out.printf("Extra charge: $%.2f%n", extraCharge);
		System.out.println();
		System.out.printf("Total bill: $%.2f %n", total);

		scanner.close();
	}

}
