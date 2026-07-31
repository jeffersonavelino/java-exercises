package module01_variables;

public class RectangleCalculator {
	
	public static void main (String [] args) {
	
	double width = 5.5;
	double height = 3.0;
	double area;
	double perimeter;
	
	area = width * height;
	perimeter = (width * 2) + (height * 2);
	
	System.out.println("== RECTANGLE CALCULATOR == \n");
	System.out.printf("Width: %.2fm%n", width);
	System.out.printf("Width: %.2fm%n", height);
	System.out.println();
	System.out.printf("Area: %.2f m²%n", area);
	System.out.printf("Perimeter: %.2f m%n", perimeter);

	}

}
