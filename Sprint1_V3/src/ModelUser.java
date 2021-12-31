import java.util.*;

public class ModelUser {
	ArrayList<EntityUser> users = new ArrayList<EntityUser>();
	
	public void addUsers(EntityUser acc) {
		users.add(acc);
	}

	public ArrayList<EntityUser> getUsers() {
		return users;
	}
}
