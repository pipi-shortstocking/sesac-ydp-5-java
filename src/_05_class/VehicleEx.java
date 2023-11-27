package _05_class;

public class VehicleEx {

	public static void main(String[] args) {
		Car car = new Car();
		Airplane airplane = new Airplane();
		
		Vehicle[] vehicles = {car, airplane};
		
		car.setName("붕붕이");
		car.setMaxSpeed(100);
		
		airplane.setName("보잉");
		airplane.setMaxSpeed(1000);
		
		for(Vehicle v: vehicles) {
			v.move();
			System.out.println("이름은 " + v.getName());
			System.out.println("최고 속도는 " + v.getMaxSpeed());
			System.out.println();
			
			if(v instanceof Flyable) {
				((Flyable) v).fly();
			};
		}
	}

}
