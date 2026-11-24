package module05_Repetitive_Structures;

import java.util.Scanner;

public class OddValues {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int x = scanner.nextInt();
		System.out.println(x);

		for (int i = 0; i < x; i++) {

			i++;
			System.out.println(i);
		}

		scanner.close();

	}
}
