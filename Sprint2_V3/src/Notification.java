
public class Notification {

	private EntityUser entityuser;
	private EntityDriver entitydriver;
	private boolean flag = false;
	private static double offer = 0;
	
	
	public void setUser(EntityUser entityuser) {
		this.entityuser = entityuser;
	}
	public void setDriver(EntityDriver entitydriver) {
		this.entitydriver = entitydriver;
	}

	public void notifyRide() {
		flag = entityuser.getFlag();
		if (flag == true)
			System.out.println("Their is a new ride request.");
		else
			System.out.println("Their is no new requests.");
	}

	public void userOffer() {
		offer = entityuser.getOffer();
		System.out.println("User offered " + offer + " LE for the ride.");
		
	}

	public void driverOffer() {
		offer = entitydriver.getOffer();
		System.out.println("Driver offered " + offer + " LE for the ride.");
		
	}

}
