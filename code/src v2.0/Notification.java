
public class Notification {
	Client c;
	public Notification() {
		c = new Client();
	}
	
	public Notification(Client client) {
		c = client;
	}
	
	public void notifyRide() {
		if (c.getFlag() == true) {
			System.out.println("User requested a ride");
		}
		else
			System.out.println("x");
	}

}
