
public class Notification {

	private User u;
	private EntityDriver ed;
	
	private boolean flag = false;
	private double offer = 0;
	
	
	public void setUser(User user) {
		this.u = user;
	}
	public void setDriver(EntityDriver driver) {
		this.ed = driver;
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
		offer = ed.getOffer();
		System.out.println("Driver offered " + offer + " LE for the ride.");
		
	}

}
