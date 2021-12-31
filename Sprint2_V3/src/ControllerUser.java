
public class ControllerUser {

	EntityUser entityuser = new EntityUser();

	public void checkLogin(EntityUser entityuser ,String userName, String password) {
		
		this.entityuser = entityuser;
		
		String username = entityuser.getUserName();
		String pass = entityuser.getPassword();

		if (userName.equals(username) && password.equals(pass)) {
			System.out.println("Successfully login.");
		} else {
			System.out.println("Invalid username or password.");
		}
	}
	
	

	
}
