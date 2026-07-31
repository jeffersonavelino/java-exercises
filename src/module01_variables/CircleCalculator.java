package module01_variables;

public class CircleCalculator {
	
	public static void main(String[] args) {
		
		double radius = 4.00;
		double pi = 3.1415;
		double area;
		double circumference;
		
		area = pi * (radius * radius);
		circumference = 2 * pi * radius;
		
		System.out.println("== CIRCLE CALCULATOR ==");
		System.out.println("Radius: " + radius);
		System.out.printf("Area: %.2f m²%n", area);
		System.out.printf("Circumference: %.2f m%n", circumference);
		
	}

}
