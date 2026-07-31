package module01_variables;

public class BMICalculator {
	
	public static void main (String[] args) {
		
		String name = "Jefferson";
		double weight = 100.00;
		double height = 1.70;
		double bmi;
		
		bmi = weight / (height * height);
		
		System.out.println("== BMI CALCULATOR ==");
		System.out.println();
		System.out.println("Name: " + name);
		System.out.printf("Weight: %.2f kg%n", weight);
		System.out.printf("Heidht: %.2f m%n", height);
		System.out.printf("BMI: %.2f%n", bmi);
		
		
	}
	
	
}
