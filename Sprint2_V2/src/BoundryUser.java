import java.util.Scanner;

public class BoundryUser {
	Notification n = new Notification();
	EntityUser entityuser = new EntityUser();
	ModelUser modeluser = new ModelUser();
	EntityDriver entitydriver = new EntityDriver();
	Ride ride = new Ride();
	public void signup() {
		String un, pw, e;
		int pn;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sign up :: Passenger");

		System.out.print("Enter Username: ");
		un = scanner.nextLine();
		entityuser.setUserName(un);

		System.out.print("Enter password: ");
		pw = scanner.nextLine();
		entityuser.setPassaword(pw);

		System.out.print("Enter E-Mail(optional): ");
		e = scanner.nextLine();
		entityuser.setEmail(e);

		System.out.print("Etner phone number: ");
		pn = scanner.nextInt();
		entityuser.setPhoneNumber(pn);

		System.out.println("Successfully signed in.");
		modeluser.addUsers(this.entityuser);
	}
	
	
	 
	public boolean acceptOffer() throws InterruptedException {
		System.out.println("Offer Accepted.");
		ride.startRide();
		return true;
	}

	 
	public boolean declineOffer() {
		System.out.println("Offer Declined.");
		return false;
	}

	 
	public void login() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String userName = entityuser.getUserName();
		String pass = entityuser.getPassword();
		;
		String un, pw;
		System.out.println("");
		System.out.println("Login :: user");

		System.out.print("Enter username: ");
		un = scanner.nextLine();

		System.out.print("Enter password: ");
		pw = scanner.nextLine();

		if (un.equals(userName) && pw.equals(pass)) {
			System.out.println("Successfully login.");
		} else
			System.out.println("Invalid username or password.");

	}


	public void requestRide() {
		Scanner scanner = new Scanner(System.in);
		String s, des;
		double price;
		System.out.print("Enter source location: ");
		s = scanner.nextLine();
		ride.setSource(s);

		System.out.print("Enter destination location: ");
		des = scanner.nextLine();
		ride.setDestnation(des);

		System.out.print("Enter ride offer: ");
		price = scanner.nextDouble();
		entityuser.setOffer(price);

		System.out.println("Successful request.");
		System.out.println("Waiting for driver.");
		entityuser.flag = true;
	
	}
	public void mainUser() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		String userChoice;
		System.out.println("1. Signup user.");
		System.out.println("2. Login user.");
		System.out.println("3. Request ride.");
		System.out.println("4. Get drivers' offers.");
		
		System.out.print("Enter choice: ");
		userChoice = scanner.next();
		
		// Signup
		if (userChoice.equals("1")) {
			signup();
			System.out.println("");
		}
		
		// login
		else if (userChoice.equals("2")) {
			login();
			System.out.println("");
		}
		
		// request ride
		else if (userChoice.equals("3")) {
			requestRide();
			System.out.println("");
		}
		
		// notify
		else if (userChoice.equals("4")) {
			n.setDriver(entitydriver);
			entityuser.setNotifier(n);
			entityuser.offerNotification();
			Scanner enter = new Scanner(System.in);
			String choice1;
			System.out.println("Do you accept driver's offer? (Y/N)");
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
		
	}
	
}
