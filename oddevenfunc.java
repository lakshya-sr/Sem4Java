class OddEven
{
	static boolean oddeven(int n)
	{
		return n % 2 == 0;
	}

	public static void main(String args[])
	{
		int n = 5;

		System.out.println(n + " is " + (oddeven(n) ? "even" : "odd"));

		if (oddeven(n))
			System.out.println(n + " is even.");
		else
			System.out.println(n + " is odd.");
	}
}