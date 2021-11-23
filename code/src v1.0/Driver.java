import java.util.Scanner;

public class Driver implements UserInterface {

	private String DriverName;
	private char passWord;
	private char Email;
	private int driverLicenseDate;
	private int nationalID;
	private int PhoneNumber;
	private String source;
	private String destination;
	private Ride r = new Ride();
	private Client c = new Client();
	@Override
	public void requestRide(String a, String b) {
		// TODO Auto-generated method stub
		r.rideRequest(a, b);

	}

	@Override
	public void setName(String n) {
		// TODO Auto-generated method stub
		DriverName = n;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return DriverName;
	}

	@Override
	public void setPassword(char P) {
		// TODO Auto-generated method stub
		passWord = P;
	}

	@Override
	public char getPassword() {
		// TODO Auto-generated method stub
		return passWord;
	}

	@Override
	public void setEmail(char e) {
		// TODO Auto-generated method stub
		Email = e;
	}

	@Override
	public char getEmail() {
		// TODO Auto-generated method stub
		return Email;
	}

	@Override
	public void setPhoneNumber(int Pn) {
		// TODO Auto-generated method stub
		PhoneNumber = Pn;
	}

	@Override
	public int getPhoneNumber() {
		// TODO Auto-generated method stub
		return PhoneNumber;
	}

	@Override
	public void setRideOfferPrice(double Rp) {
		// TODO Auto-generated method stub

	}

	public void setDriverLicenseDate(int DL) {
		driverLicenseDate = DL;

	}

	public int getDriverLicenseDate() {
		return driverLicenseDate;
	}

	public void setNationalID(int nID) {
		nationalID = nID;

	}

	public int getNationalID() {
		return nationalID;

	}

	@Override
	public double getRideOfferPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void accessHistory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void notification() {
		// TODO Auto-generated method stub

	}
	
	public void getRideLocation() {	
		System.out.println(r.getDestination());
	}
	
}