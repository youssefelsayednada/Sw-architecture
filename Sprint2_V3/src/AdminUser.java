//Boundry

import java.util.*;

public class AdminUser {

	ArrayList<EntityDriver> drivers = new ArrayList<EntityDriver>();
	ArrayList<EntityDriver> varifydriver = new ArrayList<EntityDriver>();
	ModelDriver modeldriver = new ModelDriver();
	EntityDriver entitydriver = new EntityDriver();

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

	public void varify(EntityDriver entitydriver) {
		Scanner scanner = new Scanner(System.in);
		String userName = "";
		System.out.print("Enter driver name: ");
		userName = scanner.nextLine();
		drivers = modeldriver.getDrivers();
		
			if (entitydriver.getUserName().equals(userName)) {
				varifydriver.add(entitydriver);
				System.out.println("Driver " + userName + " is varified");
			} else
				System.out.println("Driver is not found");
		}
		
	public void mainAdmin() {
		
		String adminChoice;
		System.out.println("Default Admin username: ADMIN");
		System.out.println("Default Admin Password: ADMIN");
		LoginAdmin();
		Scanner scanner = new Scanner(System.in);
		System.out.println("press 1 to varify drivers");
		
		adminChoice = scanner.next();
		
		if (adminChoice.equals("1")) {
			
			varify(entitydriver);
			System.out.println("");
		}
	}
	
}
