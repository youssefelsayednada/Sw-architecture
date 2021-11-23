import java.util.*;

public class Client extends AbstractUser {

	private double ridePrice;
	private String source;
	private String destination;
	private boolean flag = false;
	
	private Ride r = new Ride();
	private Driver d = new Driver();

	public Client() {
		ridePrice = 0;
		source = "";
		destination = "";
	}
	
	public Client(Driver driver) {
		ridePrice = 0;
		source = "";
		destination = "";
		d = driver;
	}
	
	public Client(String n, String Pass, String Mail, int pnum) {
		super(n, Pass, Mail, pnum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestRide(String s, String des) {
		// TODO Auto-generated method stub
		source = s;
		destination = des;
		r.rideRequest(source, destination);
		d.setRideRequest(r);
		flag = true;
	}

	@Override
	public void setRideOfferPrice(double Rp) {
		// TODO Auto-generated method stub
		ridePrice = Rp;
	}

	@Override
	public double getRideOfferPrice() {
		// TODO Auto-generated method stub
		return ridePrice;
	}

	@Override
	public void accessHistory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void notification() {
		// TODO Auto-generated method stub

	}
	
	public boolean getFlag() {
		return flag;
	}

	// bykalem registeration
	// bykalem ride
	// bykalem notification
	// bykalem history

}
