//Boundry

import java.util.*;

public class AdminUser {

	EntityDriver entitylDriver = new EntityDriver();
	ArrayList<EntityDriver> drivers = new ArrayList<EntityDriver>();
	ArrayList<EntityDriver> varifydriver = new ArrayList<EntityDriver>();

	public AdminUser() {
	}
	
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

	public void varify(ArrayList<EntityDriver> drivers) {

		Scanner scanner = new Scanner(System.in);
		String userName = "";
		System.out.print("Enter driver name: ");
		userName = scanner.nextLine();
		for (int i = 0; i < drivers.size(); i++) {
			if (this.drivers.get(i).getUserName().equals(userName)) {
				varifydriver.add(drivers.get(i));
				System.out.println("Driver " + userName + " is varified");
			} else
				System.out.println("Driver is not found");
		}

	}

	public void AdmainBoundary() {

		Scanner scanner = new Scanner(System.in);
		String adminChoice;

		System.out.println("Default Admin username: ADMIN");
		System.out.println("Default Admin Password: ADMIN");
		this.LoginAdmin();
		System.out.println("press 1 to varify drivers");

		adminChoice = scanner.next();

		if (adminChoice.equals("1")) {
			this.varify(drivers);
			System.out.println("");
		}

	}

}
