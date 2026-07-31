package module01_variables;

public class PersonalInformation {
	
	public static void main (String[] args) {
		
		String name = "Jefferson Avelino";
		int age = 33;
		double height = 1.70;
		double weight = 100.0;
		
		System.out.println("===PERSONAL INFORMATION===");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
        System.out.printf("Height: %.2f m%n", height);
        System.out.printf("Weight: %.2f kg%n", weight);

	}
	
}
