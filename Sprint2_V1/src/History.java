import java.util.*;

public class History {
	
	Ride ride = new Ride();
	
	ArrayList<Ride> rideHistory = new ArrayList<Ride>();

	public void setRideHistory(ArrayList<Ride> rideHistory) {
		this.rideHistory = rideHistory;
	}

	public ArrayList<Ride> ridesHistory(){
		return rideHistory;
	}
}
