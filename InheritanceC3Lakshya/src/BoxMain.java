
public class BoxMain {

	static {
		System.out.println("Static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Static method: " + Box.volume(1, 2, 3));
		
		System.out.println("Static variable");
		BoxColor.color = "red";
		System.out.println(BoxColor.color);
		
		BoxColor b1 = new BoxColor();
		System.out.println(b1.color);
		b1.color = "blue";
		System.out.println(BoxColor.color);
		
		BoxColor b2 = new BoxColor();
		System.out.println(b2.color);
		b1.color = "green";
		System.out.println(b2.color);
		
		final int a = 10;
//		a = 1;
		System.out.println(a);
		
		
		BoxColor arr[] = new BoxColor[4];
		
		for(BoxColor b : arr) {
			b = new BoxColor();
		}
		
		System.out.println(BoxColor.count);
	}

}
