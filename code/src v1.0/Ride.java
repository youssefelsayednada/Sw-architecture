
public class Ride {
	
	private String source;
	private String destination;
	
	
	public void rideRequest(String s, String des) {	
		
		source = s;
		destination = des;
	}
	
	public String getSource() {
		return source;
	}
	
	public String getDestination() {
		return destination;
	}

}
