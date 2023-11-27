package _05_class._inheritance;

public class Bus extends Vehicles {
	int passengerCapacity;

	public Bus(String brand, String model, int year) {
		super(brand, model, year);
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

}
