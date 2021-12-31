import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String choice;
		BoundryUser boundryuser = new BoundryUser();
		BoundryDriver boundrydriver = new BoundryDriver();
		AdminUser au = new AdminUser();
		
		while (true) {
			
			System.out.println("<<WASALNY APP>>");
			System.out.println("1. Admin");
			System.out.println("2. User");
			System.out.println("3. Driver");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.next();
			
			// ADMIN
			if(choice.equals("1")) {
				au.mainAdmin();			
			}
			
			// USER
			else if (choice.equals("2")) {
				boundryuser.mainUser();
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
