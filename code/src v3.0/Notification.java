
public class Notification {

	private User u;
	private Driver d;
	
	private boolean flag = false;
	private double offer = 0;
	
	
	public void setUser(User user) {
		this.u = user;
	}
	public void setDriver(Driver driver) {
		this.d = driver;
	}

	
	public void notifyRide() {
		flag = u.getFlag();
		if (flag == true)
			System.out.println("Their is a new ride request.");
		else
			System.out.println("Their is no new requests.");
	}

	public void userOffer() {
		offer = u.getOffer();
		System.out.println("User offered " + offer + " LE for the ride.");
		
	}

	public void driverOffer() {
		offer = d.getOffer();
		System.out.println("Driver offered " + offer + " LE for the ride.");
		
	}


}
