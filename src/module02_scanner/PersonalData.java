package module02_scanner;
import java.util.Scanner;

public class PersonalData {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		double height;
		
		System.out.println("Enter your name:");
		name = scanner.nextLine();
		
		System.out.println("Enter your age:");
		age = scanner.nextInt();
		
		System.out.println("Enter your height:");
		height = scanner.nextDouble();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age + " years");
		System.out.printf("Height %.2f m%n", height);
		
		scanner.close();
	}

}
