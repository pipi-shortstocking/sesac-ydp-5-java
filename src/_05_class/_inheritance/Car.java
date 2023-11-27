package _05_class._inheritance;

public class Car extends Vehicles {
	boolean convertible;

	public Car(String brand, String model, int year) {
		super(brand, model, year);
	}
	
	public boolean isConvertible() {
		return convertible;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}
}
