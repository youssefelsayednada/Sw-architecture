//Boundary class

import java.util.*;

public class AdminUser {

	static ArrayList<EntityDriver> pendingDrivers = new ArrayList<EntityDriver>();
	static ArrayList<EntityDriver> varifiedDriver = new ArrayList<EntityDriver>();

	public void LoginAdmin() {
		Scanner scanner = new Scanner(System.in);
		String un = "";
		String pass = "";

		System.out.print("Enter admin username: ");
		un = scanner.nextLine();
		System.out.print("Enter admin password: ");
		pass = scanner.nextLine();
		if (un.equals("ADMIN") && pass.equals("ADMIN"))
			System.out.println("Welcome Admin.");
		else
			System.out.println("Wrong admin username or password");

	}

	public void setPendingDrivers(ArrayList<EntityDriver> pendingDrivers) {
		AdminUser.pendingDrivers = pendingDrivers;
	}

	public ArrayList<EntityDriver> getPendingdrivers() {
		return pendingDrivers;
	}

	public static ArrayList<EntityDriver> getVarifieddrivers() {
		return varifiedDriver;
	}

	public void varify() {
		Scanner scanner = new Scanner(System.in);
		String userName = "";

		System.out.print("Enter driver name: ");
		userName = scanner.nextLine();

		for (int i = 0; i < pendingDrivers.size(); i++) {
			if (pendingDrivers.get(i).getUserName().equals(userName)) {
				System.out.println("Driver " + userName + " is varified");
				varifiedDriver.add(pendingDrivers.get(i));
			} else
				System.out.println("Driver is not found");

		}

	}

	public void mainAdmin() {

		String adminChoice;
		System.out.println("Default Admin username: ADMIN");
		System.out.println("Default Admin Password: ADMIN");
		LoginAdmin();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. List pending drivers.");
		System.out.println("2. List varified drivers.");
		System.out.println("3. Varify Drivers.");
		System.out.print("4. Enter choice: ");
		adminChoice = scanner.next();

		if (adminChoice.equals("1")) {
			System.out.println(this.getPendingdrivers());
		}

		else if (adminChoice.equals("2")) {
			System.out.println(AdminUser.getVarifieddrivers());
		}

		else if (adminChoice.equals("3")) {
			this.varify();
			System.out.println("");
		}
	}
}
