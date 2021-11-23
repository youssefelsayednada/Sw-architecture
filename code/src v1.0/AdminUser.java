
public class AdminUser {
	private Driver d = new Driver();

	public void varifyDriver(int l) {
		d.setDriverLicenseDate(l);
		if (d.getDriverLicenseDate() == 2021)
			System.out.println("Varified driver. Enjoy working with us.");

		else
			System.out.println("Expired dirving license please renew your license.");

	};
}
