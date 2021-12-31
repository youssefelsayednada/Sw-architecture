
public class EntityUser {

	// private Notification n;
	private String username = "";
	private String password = "";
	private int phoneNumber = 0;
	private String Email = "";
	private String source = "";
	private String destination = "";
	// private boolean flag = false;
	private double RideOffer = 0;

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

	public void setSource(String s) {
		this.source = s;
	}

	public String getSource() {
		return source;
	}

	public void setDestnation(String des) {
		this.destination = des;
	}

	public String getDestnation() {
		return destination;
	}

	public void setOffer(double offer) {
		this.RideOffer = offer;
	}

	public double getOffer() {
		return RideOffer;
	}

	@Override
	public String toString() {
		if (this.getEmail().equals(""))
			return "User name: " + this.getUserName() + ", No E-mail entered" + ", Phone number: "
					+ this.getPhoneNumber() + "\n";
		else
			return "User name: " + this.getUserName() + ", E-mail: " + this.getEmail() + ", Phone number: "
					+ this.getPhoneNumber() + "\n";

	}

}
