/*import java.util.*;

public class Driver implements InterfaceUser {

	private Notification n;
	private String username = "";
	private String password = "";
	private int phoneNumber = 0;
	private String Email = "";
	private String driverLicense = "";
	private String nationalID = "";
	private double RideOffer = 0;

	private ArrayList<String> FavoriteAreas = new ArrayList<String>();
	private ArrayList<Driver> PendingDrivers = new ArrayList<Driver>();

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
	public void setOffer(double offer) {
		// TODO Auto-generated method stub
		this.RideOffer = offer;
	}

	@Override
	public double getOffer() {
		return RideOffer;
	}

	@Override
	public void setDrivers(Driver d) {
		PendingDrivers.add(d);
	}

	@Override
	public ArrayList<Driver> getDrivers() {
		return PendingDrivers;
	}

	@Override
	public boolean acceptOffer() {
		System.out.println("Driver accepted your offer.");
		return true;
	}

	@Override
	public boolean declineOffer() {
		System.out.println("Driver declined your offer.");
		return false;
	}

	@Override
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
		setUserName(un);

		System.out.print("Enter password: ");
		pw = scanner.nextLine();
		setPassaword(pw);

		System.out.print("Enter E-Mail(optional): ");
		e = scanner.nextLine();
		setEmail(e);

		System.out.print("Enter phone number: ");
		pn = scanner.nextInt();
		setPhoneNumber(pn);

		System.out.print("Enter driving License id: ");
		dLicense = input.nextLine();
		setDriverLicense(dLicense);

		System.out.print("Enter national id: ");
		natID = input.nextLine();
		setNationalID(natID);

		System.out.println("Successfully signed in.");
		System.out.println("Waiting for admin to varify request.");
		setDrivers(new Driver());
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

	@Override
	public void setUsers(User acc) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public void setFavArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter favorite areas: ");
		String input = "";
		input = scanner.nextLine();
		FavoriteAreas.add(input);
	}

	public ArrayList<String> getFavArea() {
		return FavoriteAreas;
	}

	public void RideRequests() {
		n.notifyRide();
	}

	public void setNotifier(Notification notifier) {
		this.n = notifier;
	}

	public void offerNotification() {
		n.userOffer();
	}

}*/
