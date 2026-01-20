
public class BoxMain {

	static void print(Object a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Box boxes[] = new Box[3];
		
		boxes[0] = new Box(1, 2, 3);
		boxes[1] = new Box();
		boxes[2] = new Box(2, 2, 2);
		
		for (Box box : boxes) {
			box.display();
			print(" Volume: " + box.volume());
		}
		print("");
		
		print(Box.volume(1,  2, 3));
		print(Box.volume(1.5,  2.1, 3.2));
		print("");
		
		boxes[0].setLength(1);
		boxes[0].setBreadth(5);
		boxes[0].setHeight(4);
		print(boxes[0].volume());
	}
}
