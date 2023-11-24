package _05_class;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width) {
		this.width = width;
	}
	
	public int area(int width, int height) {
		return width * height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
