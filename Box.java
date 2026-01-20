
public class Box {
	private float l, b, h;
	
	public void setLength(float length) {
		if (length < 0) {
			System.out.println("Invalid length");
			return;
		}
		
		l = length;
	}
	
	public float getLength() {
		return l;
	}
	
	public void setBreadth(float breadth) {
		if (breadth < 0) {
			System.out.println("Invalid breadth");
			return;
		}
		
		b = breadth;
	}
	
	public float getBreadth() {
		return b;
	}
	
	public void setHeight(float height) {
		if (height < 0) {
			System.out.println("Invalid height");
			return;
		}
		
		h = height;
	}
	
	public float getHeight() {
		return h;
	}
	
	public Box() {
		l = b = h = 1;
	}
	
	public Box(float length, float breadth, float height) {
		l = length;
		b = breadth;
		h = height;
	}
	
	public float volume() {
		return l * b * h;
	}
	
	static double volume(double l, double b, double h) {
		System.out.println("float volume");
		return l * b * h;
	}
	
	static int volume(int l, int b, int h) {
		System.out.println("int volume");
		return l * b * h;
	}
	
	public void display() {
		System.out.print(l + " " + b + " " + h);
	}
}
