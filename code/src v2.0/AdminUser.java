
public class AdminUser {

	public void varifyDriver(Driver d) {

		if (d.getDriverLicenseDate() == 2021)
			System.out.println("Varified driver. Enjoy working with us.");

		else
			System.out.println("Expired dirving license please renew your license.");

	}
}
