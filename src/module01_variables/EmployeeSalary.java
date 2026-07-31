package module01_variables;

public class EmployeeSalary {
	
	public static void main (String[] args) {
		
		String employee = "Jefferson";
		int hoursWorked = 160;
		double hourlyRate = 25.50;
		double salary;
		
		salary = hoursWorked * hourlyRate;
		
		System.out.println("== EMPLOYEE SALARY ==");
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.printf("Hourly Rate: $%.2f%n", hourlyRate);
		System.out.println();
		System.out.printf("Salary: $%.2f%n", salary);

		

		
		
		
	}

}
