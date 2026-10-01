package module03_operators;

import java.util.Scanner;

public class LogicalExpression {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int age;
		boolean license;
		boolean car;
		boolean ageRequiriment;
		boolean ageLicense;
		boolean licenseCar;
		boolean licenseOrCar;
		boolean notCar;

		System.out.println("=== LOGICAL EXPRESSION ===");
		System.out.println();

		System.out.print("Enter age: ");
		age = scanner.nextInt();

		System.out.print("Enter has license: ");
		license = scanner.nextBoolean();

		System.out.print("Enter has car: ");
		car = scanner.nextBoolean();

		System.out.println();

		ageRequiriment = age >= 18;
		ageLicense = ageRequiriment && license;
		licenseCar = license && car;
		licenseOrCar = license || car;
		notCar = !car;

		System.out.println("Age =>18: " + ageRequiriment);
		System.out.println("Has license: " + license);
		System.out.println("Has car: " + car);
		System.out.println();

		System.out.println("Age AND license: " + ageLicense);
		System.out.println("License AND Car: " + licenseCar);
		System.out.println("License OR car: " + licenseOrCar);
		System.out.println("NOT has Car: " + notCar);

		scanner.close();
	}

}
