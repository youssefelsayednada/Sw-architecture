import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Ride {

	private static String source;
	private static String destination;
	private static int rate;

	History history = new History();
	static ArrayList<Ride> rides = new ArrayList<Ride>();

	public static void setSource(String s) {
		source = s;
	}

	public static ArrayList<Ride> getRides() {
		return rides;
	}

	public String getSource() {
		return source;
	}

	public static void setDestnation(String des) {
		destination = des;
	}

	public String getDestnation() {
		return destination;
	}

	public static int getRate() {
		return rate;
	}

	public static void setRate(int rate) {
		Ride.rate = rate;
	}

	public void rideDetails() {
		System.out.println("Ride Details");
		System.out.println("Source : " + this.getSource() + " /Destination : " + this.getDestnation());
	}

	public void startRide() throws InterruptedException {
		System.out.println("Ride [ " + this.getSource() + " -> " + this.getDestnation() + " ]");
		TimeUnit.SECONDS.sleep(3);
		this.endRide();
	}

	public void endRide() {
		System.out.println("Ride has ended & saved to history");
		rides.add(this);
		History.setRidesHistory(rides);
		System.out.println(History.getRidesHistory());
	}

	@Override
	public String toString() {
		if (rides.isEmpty())
			return "List is empty";
		else
			return " Ride source: " + this.getSource() + " and ride destnation: " + this.getDestnation() + "\n";

	}

}
