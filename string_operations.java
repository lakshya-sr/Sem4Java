import java.util.Scanner;

class StringOperations
{
	static void print(Object s)
	{
		System.out.println(s);
	}
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String temp;
		int i = 0, n = 4;
		String names[] = new String[n];
		do {
			temp = input.nextLine();
			names[i++] = temp != "" ? temp : null;
		}while(temp != "" && i < n);
		
		for (String s : names)
			print(s);
	}
}