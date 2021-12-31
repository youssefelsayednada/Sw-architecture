import java.util.*;

public class EntityDriver {

	ArrayList<String> FavoriteAreas = new ArrayList<String>();
	ArrayList<EntityDriver> PendingDrivers = new ArrayList<EntityDriver>();

	
	protected Notification n;
	private String username = "";
	private String password = "";
	private int phoneNumber = 0;
	private String Email = "";
	private String driverLicense = "";
	private String nationalID = "";
	private double RideOffer = 0;

	ModelDriver modeldriver = new ModelDriver();

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

	public ArrayList<String> getFavArea() {
		return modeldriver.FavoriteAreas;
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

	public boolean acceptOffer() {
		return false;
	}

	public boolean declineOffer() {
		return false;
	}
	
	
	public void addDriver(EntityDriver drivers) {
		PendingDrivers.add(drivers);
	}

	public ArrayList<EntityDriver> getDrivers() {
		return PendingDrivers;
	}

	public void addFavoAreas(String area) {
		FavoriteAreas.add(area);
	}

	public ArrayList<String> getFavoAreas() {
		return FavoriteAreas;
	}	

	
	
	@Override
	public String toString() {
		if (this.getEmail().equals(""))
			return "User name: " + this.getUserName() + ", No E-mail entered" + ", Phone number: "
					+ this.getPhoneNumber() + ", National ID:" + this.getNationalID()
					+ ", Driving license id: " + this.getDriverLicense() + "\n";
		else
			return "User name: " + this.getUserName() + ", E-mail: " + this.getEmail()
					+ ", Phone number: " + this.getPhoneNumber() + ", National ID:"
					+ this.getNationalID() + ", Driving license id: "
					+ this.getDriverLicense() + "\n";

	}


}
