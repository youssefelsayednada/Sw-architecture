import java.util.*;

public class AdminUser {
	private String username = "";
	private String passaword = "";

	private ArrayList<Driver> drivers = new ArrayList<Driver>();
	private ArrayList<Driver> list = new ArrayList<Driver>();

	private Driver d = new Driver();

	public void LoginAdmin() {
		Scanner scanner = new Scanner(System.in);
		String un = "";
		String pass = "";

		System.out.print("Enetr admin username: ");
		un = scanner.nextLine();
		System.out.print("Enter admin password: ");
		pass = scanner.nextLine();
		if (un.equals("ADMIN") && pass.equals("ADMIN"))
			System.out.println("Welcome Admin.");
		else
			System.out.println("Wrong admin username or password");

	}

	public void varify(Driver d) {
		Scanner scanner = new Scanner(System.in);
		String userName = "";
		System.out.print("Enter driver name: ");
		userName = scanner.nextLine();
		list = d.getDrivers();

		if (d.getUserName().equals(userName)) {
			drivers.add(d);
			System.out.println("Driver " + userName + " is varified");
		} else
			System.out.println("Driver is not found");

	}

}
