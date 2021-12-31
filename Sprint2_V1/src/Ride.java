
//import java.util.concurrent.TimeUnit;
import java.util.*;

public class Ride {

	private static String source;
	private static String destination;
	private static double offer;

	ArrayList<Ride> rides = new ArrayList<Ride>();
	
	public void setSource(String s) {
		Ride.source = s;
	}

	public String getSource() {
		return source;
	}

	public void setDestnation(String des) {
		Ride.destination = des;
	}

	public String getDestnation() {
		return destination;
	}

	public void rideDetails() {
		System.out.println("Ride Details");
		System.out.println("Source : " + this.getSource() + " /Destination : " + this.getDestnation());
	}

	public void startRide() {
		System.out
				.println("Ride starts from [ " + this.getSource() + " ] and ends at [ " + this.getDestnation() + "] .");
	}

	public void finishRide() {
		System.out.println("Ride ended thanks for using our application");
		rides.add(this);
		// TimeUnit.SECONDS.sleep(0);
	}

	public double getOffer() {
		return offer;
	}

	public void setOffer(double offer) {
		this.offer = offer;
	}


}
