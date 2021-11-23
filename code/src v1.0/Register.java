import java.util.*;

public class Register {

	private Client c = new Client();
	private Driver d = new Driver();
	private AdminUser AU = new AdminUser();

	private String name;
	private char password;
	private char Email;
	private int phoneNumber;
	private int driverLicenseDate;
	private int nationalID;

	public void signUpClient() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name: ");
		name = scanner.nextLine();
		System.out.print("Enter password: ");
		password = scanner.next().charAt(0);
		System.out.print("Enter Email (Optional): ");
		Email = scanner.next().charAt(0);
		System.out.print("Enter phone number: ");
		phoneNumber = scanner.nextInt();

		c.setName(name);
		c.setPassword(password);
		c.setEmail(Email);
		c.setPhoneNumber(phoneNumber);

		System.out.println("Successfully Signed in.");
		System.out.println("");
	}

	public void signUpDriver() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name: ");
		name = scanner.nextLine();
		System.out.print("Enter password: ");
		password = scanner.next().charAt(0);
		System.out.print("Enter Email: ");
		Email = scanner.next().charAt(0);
		System.out.print("Enter phone number: ");
		phoneNumber = scanner.nextInt();
		System.out.print("Enter national ID: ");
		nationalID = scanner.nextInt();
		System.out.print("Enter driver license date: ");
		driverLicenseDate = scanner.nextInt();

		d.setName(name);
		d.setPassword(password);
		d.setEmail(Email);
		d.setPhoneNumber(phoneNumber);
		d.setNationalID(nationalID);
		d.setDriverLicenseDate(driverLicenseDate);
		int licenseDate = d.getDriverLicenseDate();
		AU.varifyDriver(licenseDate);

	}


}
