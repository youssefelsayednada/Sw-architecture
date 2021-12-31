
public class ControllerDriver {

	EntityDriver entitydriver = new EntityDriver();

	public ControllerDriver() {

	}

	public void checkLogin(EntityDriver entityDriver, String userName, String password) {

		this.entitydriver = entityDriver;

		String username = entitydriver.getUserName();
		String pass = entitydriver.getPassword();

		if (userName.equals(username) && password.equals(pass)) {
			System.out.println("Successfully login.");
		} else {
			System.out.println("Invalid username or password.");
		}

	}
}
