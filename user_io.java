import java.util.Scanner;

class StringOperations
{
	static void print(Object s)
	{
		System.out.println(s);
	}
	
	public static void main(String args[])
	{
		// Scanner input = new Scanner(System.in);
		// String temp;
		// int i = 0, n = 4;
		// String names[] = new String[n];
		// do {
			// temp = input.nextLine();
			// names[i++] = temp != "" ? temp : null;
		// } while(temp != "" && i < n);
		
		// for (String s : names)
			// print(s);
		
		Scanner s = new Scanner(System.in);
		print("Enter first name: ");
		String fname = s.nextLine();
		print("Enter last name: ");
		String lname = s.nextLine();
		
		String name = String.join(" ", fname, lname);
		print(name);
		
		if (name.contains("ak"))
			print("name contains 'ak'");
		// print("Enter roll: ");
		// int roll = s.nextInt();
		// print("Enter CGPA: ");
		// float cgpa = s.nextFloat();
		
		// print(name + " " + roll + " " + cgpa);
		
	}
}