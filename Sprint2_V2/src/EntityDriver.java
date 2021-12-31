public class EntityDriver {
	
	protected Notification n;
	private String username = "";
	private String password = "";
	private int phoneNumber = 0;
	private String Email = "";
	private String driverLicense = "";
	private String nationalID = "";
	private static double RideOffer = 0;
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

		RideOffer = offer;
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
	
}
