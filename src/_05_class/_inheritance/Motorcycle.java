package _05_class._inheritance;

public class Motorcycle extends Vehicles {
	String licenseType;
	
	public Motorcycle(String brand, String model, int year) {
		super(brand, model, year);
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	
	
}
