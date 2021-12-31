import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String choice;
		User u = new User();
		Ride r = new Ride();
		BoundryDriver boundrydriver = new BoundryDriver();
		EntityDriver entitydriver = new EntityDriver();
		AdminUser au = new AdminUser();
		Notification n = new Notification();

		while (true) {

			System.out.println("<<WASALNY APP>>");
			System.out.println("1. Admin");
			System.out.println("2. User");
			System.out.println("3. Driver");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.next();

			// ADMIN
			if (choice.equals("1")) {
				au.AdmainBoundary();

			}

			// USER
			else if (choice.equals("2")) {

				String userChoice;
				System.out.println("1. Signup user.");
				System.out.println("2. Login user.");
				System.out.println("3. Request ride.");
				System.out.println("4. Get drivers' offers.");

				System.out.print("Enter choice: ");
				userChoice = scanner.next();

				// Signup
				if (userChoice.equals("1")) {
					u.signup();
					System.out.println("");
				}

				// login
				else if (userChoice.equals("2")) {
					u.login();
					System.out.println("");
				}

				// request ride
				else if (userChoice.equals("3")) {
					u.requestRide();
					System.out.println("");
				}

				// notify
				
				/*
				 * else if (userChoice.equals("4")) { n.setDriver(entitydriver);
				 * u.setNotifier(n); u.offerNotification(); Scanner enter = new
				 * Scanner(System.in); String choice1;
				 * System.out.println("Do you accept driver's offer? (Y/N)"); choice1 =
				 * enter.nextLine(); while (true) { if (choice1.equals("Y") ||
				 * choice1.equals("y")) { u.acceptOffer(); break; } else if (choice1.equals("N")
				 * || choice1.equals("n")) { u.declineOffer(); break; } else {
				 * System.out.println("Please enter (Y/N)"); continue; }
				 * 
				 * }
				 * 
				 * System.out.println(""); }
				 */
			}

			// DRIVER
			else if (choice.equals("3")) {
				boundrydriver.mainDriver();
			}

			// EXIT
			else if (choice.equals("4")) {
				System.exit(0);
			}

			else
				System.out.println("Wrong choice enter valid choice.");

		}
	}

}
