package module01_variables;

public class StoreReceipt {
	
	public static void main(String[] args){	
		
		String customer = "Jefferson";
		String product1 = "Mouse";
		String product2 = "Mechanical Keyboard";
		double unitPrice1 = 80.00;
		double unitPrice2 = 350.00;
		int quantity1 = 2;
		int quantity2 = 1;
		double subtotal1;
		double subtotal2;
		double subtotal;
		double tax;
		double total;
		
		subtotal1 = unitPrice1 * quantity1;
		subtotal2 = unitPrice2 * quantity2;
		subtotal = subtotal1 + subtotal2;
		tax = subtotal * 0.10;
		total = subtotal + tax;
		
		System.out.println("== STORE RECEIPT ==");
		System.out.println();
		System.out.println("Customer: " + customer);
		System.out.println();
		
		System.out.println("Product 1: " + product1);
		System.out.printf("Unit Price: $%.2f %n", unitPrice1);
		System.out.println("Quantity: " + quantity1);
		System.out.printf("Subtotal: $%.2f %n", subtotal1);
		System.out.println();
		
		System.out.println("Product 2: " + product2);
		System.out.printf("Unit Price: $%.2f %n", unitPrice2);
		System.out.println("Quantity: " + quantity2);
		System.out.printf("Subtotal: $%.2f %n", subtotal2);
		System.out.println();

		
		System.out.println("-----------------------------------");
		System.out.println();

		System.out.printf("Subtotal: $%.2f %n", subtotal);
		System.out.printf("Tax (10%%): $%.2f%n", tax);
		System.out.printf("Total: $%.2f %n", total);


		

		

		

		


		
	}

}
