package module01_variables;

public class StudentAverage {
	
	public static void main(String[] args) {
		
		double grade1 = 8.5;
		double grade2 = 7.0;
		double grade3 = 9.5;
		double average;
		
		average = (grade1 + grade2 + grade3)/3;
		
		System.out.println("== STUDENT AVERAGE == ");
		System.out.println("The frist grade is: " + grade1);
		System.out.println("The second grade is: " + grade2);
		System.out.println("The third grade is:  " + grade3);
		System.out.printf("The average of the grades is: %.2f", average);
		
	
	}

}
