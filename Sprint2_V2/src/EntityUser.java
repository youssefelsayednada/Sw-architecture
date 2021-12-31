
public class EntityUser {
	
	private Notification n;
	private String username = "";
	private String password = "";
	private int phoneNumber = 0;
	private String Email = "";
	boolean flag = false;
	private static double RideOffer = 0;

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
