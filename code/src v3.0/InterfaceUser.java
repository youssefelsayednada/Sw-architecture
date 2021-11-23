import java.util.*;

public interface InterfaceUser extends Login {

	ArrayList<User> Users = new ArrayList<User>();

	void setPhoneNumber(int pn);
	int getPhoneNumber();

	void setEmail(String e);
	String getEmail();

	void setSource(String source);
	String getSource();

	void setDestnation(String destnation);
	String getDestnation();
	
	void setOffer(double o);
	double getOffer();
	
	boolean acceptOffer();
	boolean declineOffer();
		

	void setUsers(User acc);
	ArrayList<User> getUsers();

	void setDrivers(Driver d);ArrayList<Driver> getDrivers();

	void signup();

}
