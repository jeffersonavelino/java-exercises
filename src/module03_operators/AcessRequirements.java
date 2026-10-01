package module03_operators;

import java.util.Scanner;

public class AcessRequirements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int age;
		boolean id;
		boolean membership;
		boolean ageRequirement;
		boolean membershipRequirement;
		boolean ageId;
		boolean idMembership;

		System.out.println("=== ACESS REQUIREMENTS ===");
		System.out.println();

		System.out.print("Enter age: ");
		age = scanner.nextInt();

		System.out.print("Enter has ID: ");
		id = scanner.nextBoolean();

		System.out.print("Enter has membership: ");
		membership = scanner.nextBoolean();
		System.out.println();

		ageRequirement = age >= 18;
		membershipRequirement = membership;

		ageId = ageRequirement && id;
		idMembership = id || membershipRequirement;

		System.out.println("Age requirement: " + ageRequirement);
		System.out.println("ID requirement: " + id);
		System.out.println("Membership requirement: " + membershipRequirement);
		System.out.println();
		System.out.println("Age AND ID: " + ageId);
		System.out.println("ID OR Membership: " + idMembership);

		scanner.close();

	}

}
