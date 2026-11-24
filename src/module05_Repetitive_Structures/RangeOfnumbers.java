package module05_Repetitive_Structures;

import java.util.Scanner;

public class RangeOfnumbers {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Numbers range 10-20");
		System.out.println();

		System.out.println("Enter the number of values: ");
		int n = scanner.nextInt();
		System.out.println();

		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();

			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}

		}

		System.out.println("in " + in);
		System.out.println("out " + out);

		scanner.close();

	}

}
