package _05_class;

public class VehicleEx {

	public static void main(String[] args) {
		Car car = new Car();
		Airplane airplane = new Airplane();
		
		Vehicle[] vehicles = {car, airplane};
		
		for(Vehicle v: vehicles) {
			v.move();
			
			if(v instanceof Flyable) {
				((Flyable) v).fly();
			};
		}
	}

}
