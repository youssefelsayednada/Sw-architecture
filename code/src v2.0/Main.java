import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*
		 * boolean flag = true;
		 * 
		 * while (flag) {
		 * 
		 * System.out.println("WASALNY APP"); System.out.println("1. Register as user");
		 * System.out.println("2. Register as Driver"); System.out.println("3. exit");
		 * 
		 * System.out.print("Enter choice: "); String choice1 = scanner.next();
		 * 
		 * Register r = new Register(); Login l = new Login();
		 * 
		 * if (choice1.equals("1")) { System.out.println("Signup user");
		 * r.signUpClient(); } else if (choice1.equals("2")) {
		 * System.out.println("Signup driver"); r.signUpDriver(); } else if
		 * (choice1.equals("3")) { flag = false; break; } else
		 * System.out.println("Wrong choice");
		 * 
		 * System.out.println("1. Login as user");
		 * System.out.println("2. Login as driver");
		 * 
		 * System.out.print("Enter choice: "); String choice2 = scanner.next();
		 * 
		 * if (choice2.equals("1")) { System.out.println("Login user"); l.logInClient();
		 * } else if (choice2.equals("2")) { System.out.println("Login driver");
		 * l.logInDriver(); } else System.out.println("Wrong choice");
		 */

		Driver d = new Driver();
		d.setFavArea();
		System.out.println(d.getFavArea());

		Client c = new Client(d);
		Notification n = new Notification(c);
		c.requestRide("A", "B");
		d.getRideSource();
		d.getRideDestination();
		n.notifyRide();

//		}

	}

}
