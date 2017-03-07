package cmpt220;

public class MyRec2 {

	private double width;
	private double height;

	public MyRec2(int i, int j) {
		
	}
	public MyRec2(double width, double height) {
		this.width = width;
		this.height = height;
		
	}

	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return width + height;
	}
	
}
