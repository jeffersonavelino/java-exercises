package module03_operators;

import java.util.Scanner;

public class MoneyBreakdown {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int amount;
		int remainderBills;
		int remainderBills2;
		int remainderBills3;
		int remainderBills4;
		int remainderBills5;
		int remainderBills6;
		int bills100;
		int bills50;
		int bills20;
		int bills10;
		int bills5;
		int bills2;
		int bills1;

		System.out.print("Enter amount: ");
		amount = scanner.nextInt();

		bills100 = amount / 100;
		remainderBills = amount % 100;

		bills50 = remainderBills / 50;
		remainderBills2 = remainderBills % 50;

		bills20 = remainderBills2 / 20;
		remainderBills3 = remainderBills2 % 20;

		bills10 = remainderBills3 / 10;
		remainderBills4 = remainderBills3 % 10;

		bills5 = remainderBills4 / 5;
		remainderBills5 = remainderBills4 % 5;

		bills2 = remainderBills5 / 2;
		remainderBills6 = remainderBills5 % 2;

		bills1 = remainderBills6 / 1;

		System.out.printf("$100 bills: %d%n", bills100);
		System.out.printf("$50 bills: %d%n", bills50);
		System.out.printf("$20 bills: %d%n", bills20);
		System.out.printf("$10 bills: %d%n", bills10);
		System.out.printf("$5 bills: %d%n", bills5);
		System.out.printf("$2 bills: %d%n", bills2);
		System.out.printf("$1 bills: %d%n", bills1);

		scanner.close();

	}

}
