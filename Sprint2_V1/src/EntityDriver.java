import java.util.ArrayList;

public class EntityDriver {

	Notification n;
	private String username = "";
	private String password = "";
	private int phoneNumber = 0;
	private String Email = "";
	private String driverLicense = "";
	private String nationalID = "";
	private double RideOffer = 0;

	ArrayList<String> FavoriteAreas = new ArrayList<String>();
	static ArrayList<EntityDriver> PendingDrivers = new ArrayList<EntityDriver>();

	public EntityDriver() {

	}

	public EntityDriver(String un, String pw, int pn, String email, String dL, String nID) {
		this.username = un;
		this.password = pw;
		this.phoneNumber = pn;
		this.Email = email;
		this.driverLicense = dL;
		this.nationalID = nID;
	}

	public void setUserName(String un) {

		this.username = un;
	}

	public String getUserName() {

		return username;
	}

	public void setPassaword(String password) {

		this.password = password;
	}

	public String getPassword() {

		return password;
	}

	public void setPhoneNumber(int pn) {

		this.phoneNumber = pn;
	}

	public int getPhoneNumber() {

		return phoneNumber;
	}

	public void setEmail(String e) {

		this.Email = e;
	}

	public String getEmail() {

		return Email;
	}

	public void setOffer(double offer) {

		this.RideOffer = offer;
	}

	public double getOffer() {

		return RideOffer;
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

	public void RideRequests() {
		n.notifyRide();
	}

	public void setNotifier(Notification notifier) {
		this.n = notifier;
	}

	public void offerNotification() {
		n.userOffer();
	}

	public void addDriver(EntityDriver ed) {
		PendingDrivers.add(ed);
	}

	public static ArrayList<EntityDriver> getDrivers() {
		return PendingDrivers;
	}

	public static void setPendingDrivers(ArrayList<EntityDriver> pendingDrivers) {
		PendingDrivers = pendingDrivers;
	}

	public ArrayList<String> getFavArea() {
		return FavoriteAreas;
	}
	
	public boolean acceptOffer() {
		System.out.println("Driver accept driver your offer.");
		return true;
	}

	public boolean declineOffer() {
		System.out.println("Driver decline your offer.");
		return false;
	}


	@Override
	public String toString() {
		if (PendingDrivers.isEmpty())
			return "List is empty";

		if (this.getEmail().equals(""))
			return "User name: " + this.getUserName() + ", No E-mail entered" + ", Phone number: "
					+ this.getPhoneNumber() + ", National ID:" + this.getNationalID() + ", Driving license id: "
					+ this.getDriverLicense() + "\n";
		else
			return "User name: " + this.getUserName() + ", E-mail: " + this.getEmail() + ", Phone number: "
					+ this.getPhoneNumber() + ", National ID:" + this.getNationalID() + ", Driving license id: "
					+ this.getDriverLicense() + "\n";

	}

}
