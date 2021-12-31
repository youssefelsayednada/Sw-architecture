import java.util.*;

public class History {
	
	static ArrayList<Ride> ridesHistory = new ArrayList<Ride>();
	
	public History() {
		
	}

	public static ArrayList<Ride> getRidesHistory() {
		return ridesHistory;
	}

	public static void setRidesHistory(ArrayList<Ride> rideHistory) {
		ridesHistory = rideHistory;
	}

}
