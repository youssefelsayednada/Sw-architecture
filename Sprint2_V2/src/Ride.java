import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class Ride {
	
	private static String source;
	private static String destination;
	static ArrayList<Ride> rides = new ArrayList<Ride>();
	
	public void setSource(String s) {
		Ride.source=s;
	}

	public static ArrayList<Ride> getRides() {
		return rides;
	}

	public String getSource(){
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
		System.out.println("Source : "+this.getSource()+" /Destination : "+this.getDestnation());
	}
	public void startRide() throws InterruptedException {
		System.out.println("Ride [ "+this.getSource()+" -> "+this.getDestnation()+" ]");
		TimeUnit.SECONDS.sleep(5);
		this.endRide();
	}
	public void endRide() {
		System.out.println("Ride has ended & saved to history");
		rides.add(this);
	}
}
