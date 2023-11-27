package _07_generic;

public class Calculator <T extends Number> {
	private T num1;
	private T num2;
	
	public Calculator(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public T getNum1() {
		return num1;
	}

	public T getNum2() {
		return num2;
	}
	
	public double add() {
		return num1.doubleValue() + num2.doubleValue();
	}

	public static void main(String[] args) {
		Calculator<Integer> cal1 = new Calculator<Integer>(10, 5);
		System.out.println("Integer Sum: " + cal1.add());
		
		Calculator<Double> cal2 = new Calculator<Double>(5.123, 1.2342);
		System.out.println("Double Sum: " + cal2.add());
	}

}
