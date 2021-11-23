import java.util.Scanner;

public class Login {
	
	private String name;
	private char password;

	
	
	public void logInClient() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name: ");
		name = scanner.nextLine();
		System.out.print("Enter password: ");
		password = scanner.next().charAt(0);

		System.out.println("Successfully login.");
		System.out.println("");

	}

	public void logInDriver() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter name: ");
		name = scanner.nextLine();
		System.out.print("Enter password: ");
		password = scanner.next().charAt(0);

		System.out.println("Successfully login.");
		System.out.println("");

	}

}
