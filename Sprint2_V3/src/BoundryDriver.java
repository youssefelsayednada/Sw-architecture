import java.util.ArrayList;
import java.util.Scanner;

public class BoundryDriver {

	String Signun; // sign up user name
	String Signpw; // sign up password
	String Loginun; // login user name
	String Loginpw; // login password
	String e; // email
	int pn; // phone number
	String natID; // national id
	String dLicense; // driving license
	
	// drivers list
	static ArrayList<EntityDriver> drivers = new ArrayList<EntityDriver>();
	
	EntityDriver entitydriver = new EntityDriver();
	EntityUser entityUser = new EntityUser();
	ControllerDriver controllerDriver = new ControllerDriver();
	EntityUser entityuser = new EntityUser();
	AdminUser adminUser = new AdminUser();
	Notification n = new Notification();
	Ride r = new Ride();
	
	public boolean acceptOffer() throws InterruptedException {
		System.out.println("Driver accept driver your offer.");
		r.startRide();
		return true;
	}

	public boolean declineOffer() {
		System.out.println("Driver decline your offer.");
		return false;
	}
	
	public void offerNotification() {
		n.userOffer();
	}
	
	public void signup() {

		Scanner scanner = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println("Sign up :: Driver");

		System.out.print("Enter Username: ");
		Signun = scanner.nextLine();

		System.out.print("Enter password: ");
		Signpw = scanner.nextLine();

		System.out.print("Enter E-Mail(optional): ");
		e = scanner.nextLine();

		System.out.print("Enter phone number: ");
		pn = scanner.nextInt();

		System.out.print("Enter driving License id: ");
		dLicense = input.nextLine();

		System.out.print("Enter national id: ");
		natID = input.nextLine();

		// creates new entity with data in parameter
		entitydriver = new EntityDriver(Signun, Signpw, pn, e, dLicense, natID);

		// add entity to the list
		drivers.add(entitydriver);

		// add entity to admin pending list to verify
		adminUser.setPendingDrivers(drivers);

		// add entity to the entity list
		EntityDriver.setPendingDrivers(drivers);

		System.out.println("Successfully signed driver in.");
		System.out.println("Waiting for admin to varify request.");

	}

	
	public void login() {
		Scanner scanner = new Scanner(System.in);
		String userName = entitydriver.getUserName();
		String pass = entitydriver.getPassword();

		System.out.println("");
		System.out.println("Login :: Driver");

		System.out.print("Enter username: ");
		Loginun = scanner.nextLine();

		System.out.print("Enter password: ");
		Loginpw = scanner.nextLine();

		// check if data is valid
		controllerDriver.checkLogin(this.entitydriver, Loginun, Loginpw);
	}
	
	public void setFavArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter favorite areas: ");
		String input = "";
		input = scanner.nextLine();
		this.entitydriver.FavoriteAreas.add(input);
	}
	
	public void mainDriver() throws InterruptedException {
		
		String driverChoice;
		System.out.println("1. Signup driver.");				
		System.out.println("2  Login driver."); 
		System.out.println("3. Driver list favorite areas."); 
		System.out.println("4. Get driver list favorite areas.");
		System.out.println("5. Check new ride requests."); 
		System.out.println("6. Get source and destination locations."); 
		System.out.println("7. Get users' offers."); 
		System.out.println("8. Driver enter his offer."); 
		
		System.out.print("Enter choice: ");
		Scanner scanner = new Scanner(System.in);
		driverChoice = scanner.next();
		
		if (driverChoice.equals("1")) {
			signup();
			System.out.println("");
		}

		else if (driverChoice.equals("2")) {
			login();
			System.out.println("");
		}

		else if (driverChoice.equals("3")) {
			setFavArea();
			System.out.println("");
		}

		else if (driverChoice.equals("4")) {
			System.out.println(this.entitydriver.getFavArea());
			System.out.println("");
		}

		else if (driverChoice.equals("5")) {
			n.setUser(entityuser);
			entitydriver.setNotifier(n);
			entitydriver.RideRequests();
			System.out.println("");
		}

		else if (driverChoice.equals("6")) {
			r.rideDetails();
			System.out.println("");
		}

		else if (driverChoice.equals("7")) {
			n.setUser(entityuser);
			entitydriver.setNotifier(n);
			entitydriver.offerNotification();

			Scanner enter = new Scanner(System.in);
			String choice1;
			System.out.println("Do you accept user's offer? (Y/N)");
			choice1 = enter.nextLine();
			while (true) {
				if (choice1.equals("Y") || choice1.equals("y")) {
					acceptOffer();
					break;
				} else if (choice1.equals("N") || choice1.equals("n")) {
					declineOffer();
					break;
				} else {
					System.out.println("Please enter (Y/N)");
					continue;
				}

			}

			System.out.println("");
		}

		else if (driverChoice.equals("8")) {
			
			System.out.print("Enter your offer: ");
			double offer = 0;
			offer = scanner.nextDouble();
			entitydriver.setOffer(offer);
		}
	}
	
}
