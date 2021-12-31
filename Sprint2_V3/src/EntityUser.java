import java.util.ArrayList;

public class EntityUser {

	private Notification n;
	private String username = "";
	private String password = "";
	private int phoneNumber = 0;
	private String Email = "";
	boolean flag = false;
	private static double RideOffer = 0;

	static ArrayList<EntityUser> users = new ArrayList<EntityUser>();

	public EntityUser() {

	}

	public EntityUser(String un, String pw, int pn, String e) {
		this.username = un;
		this.password = pw;
		this.phoneNumber = pn;
		this.Email = e;

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

	static public void setOffer(double offer) {
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

	public static void addUsers(EntityUser acc) {
		users.add(acc);
	}

	public static ArrayList<EntityUser> getUsers() {
		return users;
	}

	public boolean acceptOffer() {
		System.out.println("User accepted your offer.");
		return true;
	}

	public boolean declineOffer() {
		System.out.println("User declined your offer.");
		return false;
	}

	@Override
	public String toString() {
		if (users.isEmpty())
			return "List is empty";

		if (this.getEmail().equals(""))
			return "User name: " + this.getUserName() + ", No E-mail entered" + ", Phone number: "
					+ this.getPhoneNumber() + "\n";
		else
			return "User name: " + this.getUserName() + ", E-mail: " + this.getEmail() + ", Phone number: "
					+ this.getPhoneNumber() + "\n";

	}

}
