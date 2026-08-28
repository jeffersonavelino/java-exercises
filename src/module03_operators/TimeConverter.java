package module03_operators;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int totalSeconds;
		int hours;
		int minutes;
		int seconds;
		int remainderSeconds;

		System.out.println("=== TIME CONVERTER ===");
		System.out.println();

		System.out.print("Enter total seconds: ");
		totalSeconds = scanner.nextInt();

		hours = totalSeconds / 3600;
		remainderSeconds = totalSeconds % 3600;

		minutes = remainderSeconds / 60;
		seconds = remainderSeconds % 60;
		
		System.out.println();


		System.out.printf("Hours: %d%n", hours);
		System.out.printf("Minutes: %d%n", minutes);
		System.out.printf("Seconds: %d%n", seconds);

		scanner.close();
	}

}
