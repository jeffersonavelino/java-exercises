package module02_scanner;

import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double width;
		double height;
		double area;
		double perimeter;

		System.out.println("== RECTANGLE CALCULATOR ==");
		System.out.println();
		System.out.printf("Enter width: ");
		width = scanner.nextDouble();
		System.out.printf("Enter height: ");
		height = scanner.nextDouble();
		System.out.println();

		area = width * height;
		perimeter = (width * 2) + (height * 2);

		System.out.printf("Width: %.2f %n", width);
		System.out.printf("Heifht: %.2f %n", height);
		System.out.println();
		System.out.printf("Area: %.2f %n", area);
		System.out.printf("Perimeter: %.2f %n", perimeter);

		scanner.close();
	}

}
