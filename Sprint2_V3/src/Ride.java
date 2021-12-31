
public class Ride {
	
	private String source;
	private String destination;
	
	public void setSource(String s) {
		this.source=s;
	}

	public String getSource(){
		return source;
	}

	public void setDestnation(String des) {
		this.destination = des;
	}

	public String getDestnation() {
		return destination;
	}
	public void rideDetails() {
		System.out.println("Ride Details");
		System.out.println("Source : "+this.getSource()+" /Destination : "+this.getDestnation());
	}
	
}
