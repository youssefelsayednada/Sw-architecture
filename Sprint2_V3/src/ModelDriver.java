import java.util.ArrayList;

public class ModelDriver {

	ArrayList<String> FavoriteAreas = new ArrayList<String>();
	ArrayList<EntityDriver> PendingDrivers = new ArrayList<EntityDriver>();
	
	public void addDriver(EntityDriver ed) {
		PendingDrivers.add(ed);
	}
	public ArrayList<EntityDriver> getDrivers(){
		return PendingDrivers;
	}
	
	public ArrayList<String> getFavArea(){
		return FavoriteAreas;
	}
}
