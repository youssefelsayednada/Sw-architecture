import java.util.*;

public class User {
	
	private Notification n;
	private String username = "";
	private String password = "";
	private int phoneNumber = 0;
	private String Email = "";
	private boolean flag = false;
	private double RideOffer = 0;
	private Ride ride = new Ride() ;

	 
	public void setUserName(String un) {
		// TODO Auto-generated method stub
		this.username = un;
	}


	public String getUserName() {
		// TODO Auto-generated method stub
		return username;
	}


	public void setPassaword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}

	 
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	 
	public void setPhoneNumber(int pn) {
		// TODO Auto-generated method stub
		this.phoneNumber = pn;
	}

	 
	public int getPhoneNumber() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}

	 
	public void setEmail(String e) {
		// TODO Auto-generated method stub
		this.Email = e;
	}

	 
	public String getEmail() {
		// TODO Auto-generated method stub
		return Email;
	}

	 
	public void setOffer(double offer) {
		
		this.RideOffer = offer;
	}
	
	 
	public double getOffer() {
		// TODO Auto-generated method stub
		return RideOffer;
	}
	
	 
	public void setUsers(User acc) {
		// TODO Auto-generated method stub
		Users.add(acc);
	}

	 
	public ArrayList<User> getUsers() {
		// TODO Auto-generated method stub
		return Users;
	}

	 
	public void signup() {
		// TODO Auto-generated method stub
		String un, pw, e;
		int pn;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sign up :: Passenger");

		System.out.print("Enter Username: ");
		un = scanner.nextLine();
		setUserName(un);

		System.out.print("Enter password: ");
		pw = scanner.nextLine();
		setPassaword(pw);

		System.out.print("Enter E-Mail(optional): ");
		e = scanner.nextLine();
		setEmail(e);

		System.out.print("Etner phone number: ");
		pn = scanner.nextInt();
		setPhoneNumber(pn);

		System.out.println("Successfully signed in.");
		Users.add(new User());
	}
	
	 
	public boolean acceptOffer() {
		System.out.println("Offer Accepted.");
		return true;
	}

	 
	public boolean declineOffer() {
		System.out.println("Offer Declined.");
		return false;
	}

	 
	public void login() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String userName = getUserName();
		String pass = getPassword();
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

	public void setDrivers(EntityDriver ed) {

	}

	 
	public ArrayList<ModelDriver> getDrivers() {
		// TODO Auto-generated method stub
		return null;
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
		setOffer(price);

		System.out.println("Successful request.");
		System.out.println("Waiting for driver.");
		
		flag = true;
	
	}
	
	public boolean getFlag() {
		return flag;
	}

	public void setNotifier(Notification notifier) {
		this.n = notifier;
	}
	
	public void offerNotification() {
		n.driverOffer();
	}

}
