
public abstract class AbstractUser {
	
	private String name;
	private String passWord;
	private String Email;
	private int PhoneNumber;
	private String source;
	private String destination;
	
	public AbstractUser() {
		
	}
	
	public AbstractUser(String n,String Pass, String Mail, int pnum) {
		name = n;
		passWord = Pass;
		Email = "";
		PhoneNumber = pnum;
		
	}

	public void requestRide(String a, String b) {

	};

	public void setRideOfferPrice(double Rp) {

	};

	public double getRideOfferPrice() {
		return 0;
	};

	public void accessHistory() {

	};

	public void notification() {

	};

}
