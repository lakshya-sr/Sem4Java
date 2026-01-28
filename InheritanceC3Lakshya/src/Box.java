
public class Box {
	private double l, b, h;
		
	public void setLength(double length) {
		if (length < 0) {
			System.out.println("Invalid length");
			return;
		}
		
		l = length;
	}
	
	public double getLength() {
		return l;
	}
	
	public void setBreadth(double breadth) {
		if (breadth < 0) {
			System.out.println("Invalid breadth");
			return;
		}
		
		b = breadth;
	}
	
	public double getBreadth() {
		return b;
	}
	
	public void setHeight(double height) {
		if (height < 0) {
			System.out.println("Invalid height");
			return;
		}
		
		h = height;
	}
	
	public double getHeight() {
		return h;
	}
	
	public Box() {
		l = b = h = 1;
	}
	
	public Box(double length, double breadth, double height) {
		l = length;
		b = breadth;
		h = height;
	}
	
	public double volume() {
		return l * b * h;
	}
	
	static double volume(double l, double b, double h) {
//		System.out.println("double volume");
		return l * b * h;
	}
	
	static int volume(int l, int b, int h) {
//		System.out.println("int volume");
		return l * b * h;
	}
	
	public void display() {
		System.out.print(l + " " + b + " " + h);
	}
}

class BoxWeight extends Box{
	
}

class BoxColor extends Box{
	static String color;
	static int count = 0;
	
	public BoxColor() {
		count++;
	}
	
	public BoxColor(double l, double b, double h, String color) {
		super(l, b, h);
		this.color = color;
		count++;
	}
	
	
	public void display() {
		super.display();
		System.out.println(" " + color);
	}
}