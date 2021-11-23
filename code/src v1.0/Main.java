import java.util.*;

public class Main {

	public static void main(String[] args) {

		Register r = new Register();
		Login l = new Login();
		Client c = new Client();
		Driver d = new Driver();

		/*
		 * System.out.println("Signup user"); r.signUpClient();
		 * System.out.println("Signup driver"); r.signUpDriver();
		 * 
		 * System.out.println("Login user"); l.logInClient();
		 * System.out.println("Login driver"); l.logInDriver();
		 */

		c.requestRide("A", "B");
		
	}

}
