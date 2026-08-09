package module02_scanner;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String name;
		int hoursWorked;
		double hourlyRate;
		double salary;

		System.out.println("=== EMPLOYEE SALARY ===");
		System.out.println();

		System.out.printf("Enter employee name: ");
		name = scanner.nextLine();

		System.out.printf("Enter hours worked: ");
		hoursWorked = scanner.nextInt();

		System.out.printf("Enter hourly rate: ");
		hourlyRate = scanner.nextDouble();
		System.out.println();

		salary = hoursWorked * hourlyRate;

		System.out.println("Employee: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.printf("Hourly rate: %.2f %n", hourlyRate);
		System.out.printf("Salary: $%.2f %n", salary);

		scanner.close();
	}

}
