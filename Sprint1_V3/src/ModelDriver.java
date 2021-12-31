import java.util.ArrayList;

public class ModelDriver {

	ArrayList<String> FavoriteAreas = new ArrayList<String>();
	ArrayList<EntityDriver> PendingDrivers = new ArrayList<EntityDriver>();

	public void addDriver(EntityDriver drivers) {
		PendingDrivers.add(drivers);
	}

	public ArrayList<EntityDriver> getDrivers() {
		return PendingDrivers;
	}

	public void addFavoAreas(String area) {
		FavoriteAreas.add(area);
	}

	public ArrayList<String> getFavoAreas() {
		return FavoriteAreas;
	}	
}
