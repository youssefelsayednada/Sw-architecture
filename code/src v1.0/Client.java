import java.util.*;

public class Client implements UserInterface {
	private String ClientName;
	private char passWord;
	private char Email;
	private int phoneNumber;
	private double ridePrice;
	private String source;
	private String destination;
	private Ride r = new Ride();
	
	
	@Override
	public void requestRide(String s, String des) {
		// TODO Auto-generated method stub
		source = s;
		destination = des;
		r.rideRequest(source, destination);
	}

	@Override
	public void setName(String clientName) {
		// TODO Auto-generated method stub
		ClientName = clientName;

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return ClientName;
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
		phoneNumber = Pn;
	}

	@Override
	public int getPhoneNumber() {
		// TODO Auto-generated method stub
		return phoneNumber;
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

	// bykalem registeration
	// bykalem ride
	// bykalem notification
	// bykalem history

}
