package _05_class._inheritance;

public class Vehicles {
	private String brand;
	private String model;
	private int year;

	public Vehicles(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void start() {
		System.out.println("차량 시동을 걸었습니다.");
	}
	
	public void drive() {
		System.out.println("차량이 움직입니다.");
	}
	
	public void stop() {
		System.out.println("차량이 정지했습니다.");
	}
	
	@Override
	public String toString() {
		return "Vehicle{" + "brand='" + brand + "' model='" + model + ", year=" + year;
	}
}
