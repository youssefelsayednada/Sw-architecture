import java.util.*;

public class BoundryDriver {

	EntityDriver entitydriver = new EntityDriver();

	Notification n = new Notification();
	Ride r = new Ride();
	User u = new User();

	public boolean acceptOffer() {
		System.out.println("Driver accept driver your offer.");
		return true;
	}

	public boolean declineOffer() {
		System.out.println("Driver decline driver your offer.");
		return false;
	}

	public void offerNotification() {
		n.userOffer();
	}

	public void signup() {
		String un, pw, e;
		int pn;
		String natID, dLicense;

		Scanner scanner = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println("Sign up :: Driver");

		System.out.print("Enter Username: ");
		un = scanner.nextLine();
		entitydriver.setUserName(un);

		System.out.print("Enter password: ");
		pw = scanner.nextLine();
		entitydriver.setPassaword(pw);

		System.out.print("Enter E-Mail(optional): ");
		e = scanner.nextLine();
		entitydriver.setEmail(e);

		System.out.print("Enter phone number: ");
		pn = scanner.nextInt();
		entitydriver.setPhoneNumber(pn);

		System.out.print("Enter driving License id: ");
		dLicense = input.nextLine();
		entitydriver.setDriverLicense(dLicense);

		System.out.print("Enter national id: ");
		natID = input.nextLine();
		entitydriver.setNationalID(natID);

		this.entitydriver.addDriver(this.entitydriver);
		
		System.out.println(this.entitydriver.getDrivers());
		
		System.out.println("Successfully sign driver in.");
		System.out.println("Waiting for admin to varify request.");
	}

	public void login() {

		Scanner scanner = new Scanner(System.in);
		String userName = entitydriver.getUserName();
		String pass = entitydriver.getPassword();
		;
		String un, pw;
		System.out.println("");
		System.out.println("Login :: Driver");

		System.out.print("Enter username: ");
		un = scanner.nextLine();

		System.out.print("Enter password: ");
		pw = scanner.nextLine();

		if (un.equals(userName) && pw.equals(pass)) {
			System.out.println("Successfully login.");
		} else
			System.out.println("Invalid username or password.");
	}

	public void setFavArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter favorite areas: ");
		String area = "";
		area = scanner.nextLine();
		this.entitydriver.addFavoAreas(area);
	}

	public void mainDriver() {

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
			System.out.println(entitydriver.getFavArea());
			System.out.println("");
		}

		else if (driverChoice.equals("5")) {
			n.setUser(u);
			entitydriver.setNotifier(n);
			entitydriver.RideRequests();
			System.out.println("");
		}

		else if (driverChoice.equals("6")) {
			r.rideDetails();
			System.out.println("");
		}

		else if (driverChoice.equals("7")) {
			entitydriver.n.setUser(u);
			entitydriver.setNotifier(n);
			entitydriver.offerNotification();

			Scanner enter = new Scanner(System.in);
			String choice1;
			System.out.println("Do you accept user's offer? (Y/N)");
			choice1 = enter.nextLine();
			while (true) {
				if (choice1.equals("Y") || choice1.equals("y")) {
					entitydriver.acceptOffer();
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
