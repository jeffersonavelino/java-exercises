package module01_variables;

public class ProductInvoice {
	
	public static void main (String[] args) {
		
		String product = "Mechanical Keyboard";
		double unitPrice = 350.00;
		int quantity = 2;
		double total;
		
		total = unitPrice * quantity;
		
		System.out.println("== PRODUCT INVOICE ==");
		System.out.println();
		System.out.println("Product: " + product);
		System.out.printf("Unit Price: $%.2f%n", unitPrice);
		System.out.println("Quantity: " + quantity);
		System.out.println();
		System.out.printf("Total: $%.2f%n", total);
		
		
		
	}

}
