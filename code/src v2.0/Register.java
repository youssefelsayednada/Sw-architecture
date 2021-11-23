import java.util.*;

public class Register {

	private AdminUser AU = new AdminUser();

	private String name;
	private String password;
	private String Email;
	private int phoneNumber;
	private int driverLicenseDate;
	private int nationalID;

	public void signUpClient() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name: ");
		name = scanner.nextLine();
		System.out.print("Enter password: ");
		password = scanner.nextLine();
		System.out.print("Enter Email (Optional): ");
		Email = scanner.nextLine();
		System.out.print("Enter phone number: ");
		phoneNumber = scanner.nextInt();

		Client c = new Client(name, password, Email, phoneNumber);
		System.out.println("Successfully Signed in.");
		System.out.println("");
	}

	public void signUpDriver() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name: ");
		name = scanner.nextLine();
		System.out.print("Enter password: ");
		password = scanner.nextLine();
		System.out.print("Enter Email: ");
		Email = scanner.nextLine();
		System.out.print("Enter phone number: ");
		phoneNumber = scanner.nextInt();
		System.out.print("Enter national ID: ");
		nationalID = scanner.nextInt();
		System.out.print("Enter driver license date: ");
		driverLicenseDate = scanner.nextInt();

		Driver d = new Driver(name, password, Email, phoneNumber);
		d.setNationalID(nationalID);
		d.setDriverLicenseDate(driverLicenseDate);
		AU.varifyDriver(d);

	}
}
