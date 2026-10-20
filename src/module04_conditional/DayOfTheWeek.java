package module04_conditional;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int number;

		System.out.println("=== DAY OF THE WEEK ===");
		System.out.println();

		System.out.println("Enter a number (1-7): ");
		number = scanner.nextInt();
		System.out.println();

		switch (number) {

		case 1:
			System.out.println("Day: Monday");
			break;

		case 2:
			System.out.println("Day: Tuesday");
			break;

		case 3:
			System.out.println("Day: Wednesday");
			break;

		case 4:
			System.out.println("Day: Thurdsday");
			break;

		case 5:
			System.out.println("Day: Friday");
			break;

		case 6:
			System.out.println("Day: Saturday");
			break;

		case 7:
			System.out.println("Day: Sunday");
			break;

		default:
			System.out.println("Invalid day");
			break;

		}

		scanner.close();

	}

}
