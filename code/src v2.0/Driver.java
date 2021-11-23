import java.util.*;

public class Driver extends AbstractUser {

	private int driverLicenseDate;
	private int nationalID;
	private ArrayList<String> favArea = new ArrayList<String>();

	private Ride r = new Ride();

	public Driver() {
		driverLicenseDate = 0;
		nationalID = 0;
	}

	public Driver(String n, String Pass, String Mail, int pnum) {
		// TODO Auto-generated constructor stub
		super(n, Pass, Mail, pnum);

	}

	@Override
	public void requestRide(String a, String b) {
		// TODO Auto-generated method stub
		r.rideRequest(a, b);

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
		Notification n = new Notification();
		n.notifyRide();
	}

	public void setRideRequest(Ride ride) {
		r = ride;
	}

	public void getRideSource() {
		System.out.println(r.getSource());
	}

	public void getRideDestination() {
		System.out.println(r.getDestination());
	}

	public void setFavArea() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter favorite areas: ");
			String input = "";
			input = scanner.nextLine();
			favArea.add(input);
	}

	public ArrayList<String> getFavArea() {
		return favArea;
	}

}