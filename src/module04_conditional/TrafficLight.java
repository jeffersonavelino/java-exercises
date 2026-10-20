package module04_conditional;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		String action;

		System.out.println("=== TRAFFIC LIGHT ===");
		System.out.println();
		System.out.println("Enter colocor(red/yellow/green): ");
		action = scanner.nextLine();

		switch (action) {

		case "red":
			System.out.println("Stop");
			break;

		case "yellow":
			System.out.println("Wait");
			break;

		case "green":
			System.out.println("go");
			break;

		default:
			System.out.println("Invalid color");

		}

		scanner.close();

	}

}
