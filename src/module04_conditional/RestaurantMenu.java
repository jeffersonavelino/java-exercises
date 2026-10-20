package module04_conditional;

import java.util.Scanner;

public class RestaurantMenu {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int code;

		System.out.println("=== RESTAURANT MENU ===");
		System.out.println();

		System.out.printf("Enter dish code (1-3): ");
		code = scanner.nextInt();

		switch (code) {

		case 1:
			System.out.println("Dish: Pizza");
			System.out.println("Price: $20.00");
			break;

		case 2:
			System.out.println("Dish: Burger");
			System.out.println("Price: $18.00");
			break;

		case 3:
			System.out.println("Dish: Pasta");
			System.out.println("Price: $18.00");
			break;

		default:
			System.out.println("Invalid code");
		}

		scanner.close();
	}

}
