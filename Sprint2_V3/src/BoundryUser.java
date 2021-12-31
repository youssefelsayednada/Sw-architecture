import java.util.ArrayList;
import java.util.Scanner;

public class BoundryUser {

	Ride ride = new Ride();
	History history = new History();
	Notification n = new Notification();
	EntityUser entityuser = new EntityUser();
	EntityDriver entityDriver = new EntityDriver();
	ControllerUser controllerUser = new ControllerUser();

	// users list
	static ArrayList<EntityUser> users = new ArrayList<EntityUser>();

	public void signup() {
		String un, pw, e;
		int pn;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sign up :: Passenger");

		System.out.print("Enter Username: ");
		un = scanner.nextLine();

		System.out.print("Enter password: ");
		pw = scanner.nextLine();

		System.out.print("Enter E-Mail(optional): ");
		e = scanner.nextLine();

		System.out.print("Etner phone number: ");
		pn = scanner.nextInt();

		System.out.println("Successfully signed in.");

		entityuser = new EntityUser(un, pw, pn, e);

		EntityUser.addUsers(this.entityuser);

		// add entity to the list
		users.add(entityuser);

		// add entity to the entity list
		EntityUser.addUsers(entityuser);

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

		controllerUser.checkLogin(entityuser, un, pw);
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
		EntityUser.setOffer(price);

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
		System.out.println("5. Rate rides.");

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
			n.setDriver(entityDriver);
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

		else if (userChoice.equals("5")) {
			String choice1 = "";
			Scanner sc = new Scanner(System.in);

			System.out.println("1. Get rides history.");
			System.out.println("2. Rate ride out of 10.");
			System.out.print("Enter your choice: ");
			choice1 = sc.next();

			if (choice1.equals("1")) {
				System.out.println(history.getRidesHistory());
			}

			else if (choice1.equals("2")) {
				System.out.print("enter ride id: ");
				int id = sc.nextInt();

				Ride tempRide = new Ride();
				for (int i = 0; i < Ride.getRides().size(); i++) {
					if (id == i) {
						tempRide = Ride.getRides().get(i);
					}
				}
				System.out.print("Enter ride rating: ");
				int rate = sc.nextInt();

				if (rate > 10) {
					System.out.println("out of bound.");
				}
				else {
					tempRide.setRate(rate);
					System.out.println("Rating added.");
				}
			}

			// history
		}

		else
			System.out.println("invalid choice");

	}

}
