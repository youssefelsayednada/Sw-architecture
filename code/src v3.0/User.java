import java.util.*;

public class User implements InterfaceUser {
	
	private Notification n;
	
	private String username = "";
	private String password = "";
	private int phoneNumber = 0;
	private String Email = "";
	private String source = "";
	private String destination = "";
	private boolean flag = false;
	private double RideOffer = 0;

	@Override
	public void setUserName(String un) {
		// TODO Auto-generated method stub
		this.username = un;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public void setPassaword(String password) {
		// TODO Auto-generated method stub
		this.password = password;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public void setPhoneNumber(int pn) {
		// TODO Auto-generated method stub
		this.phoneNumber = pn;
	}

	@Override
	public int getPhoneNumber() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}

	@Override
	public void setEmail(String e) {
		// TODO Auto-generated method stub
		this.Email = e;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return Email;
	}

	@Override
	public void setSource(String s) {
		// TODO Auto-generated method stub
		this.source = s;
	}

	@Override
	public String getSource() {
		// TODO Auto-generated method stub
		return source;
	}

	@Override
	public void setDestnation(String des) {
		// TODO Auto-generated method stub
		this.destination = des;
	}

	@Override
	public String getDestnation() {
		// TODO Auto-generated method stub
		return destination;
	}

	@Override
	public void setOffer(double offer) {
		// TODO Auto-generated method stub
		this.RideOffer = offer;
	}
	
	@Override
	public double getOffer() {
		// TODO Auto-generated method stub
		return RideOffer;
	}
	
	@Override
	public void setUsers(User acc) {
		// TODO Auto-generated method stub
		Users.add(acc);
	}

	@Override
	public ArrayList<User> getUsers() {
		// TODO Auto-generated method stub
		return Users;
	}

	@Override
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
	
	@Override
	public boolean acceptOffer() {
		System.out.println("User accepted your offer.");
		return true;
	}

	@Override
	public boolean declineOffer() {
		System.out.println("User declined your offer.");
		return false;
	}

	@Override
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

	@Override
	public void setDrivers(Driver d) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Driver> getDrivers() {
		// TODO Auto-generated method stub
		return null;

	}

	public void requestRide() {
		Scanner scanner = new Scanner(System.in);
		String s, des;
		double price;

		System.out.print("Enter source location: ");
		s = scanner.nextLine();
		setSource(s);

		System.out.print("Enter destination location: ");
		des = scanner.nextLine();
		setDestnation(des);

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
