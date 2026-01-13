class Array
{
	static void print(Object s)
	{
		System.out.println(s);
	}
	
	public static void main(String args[])
	{
		int num[];
		num = new int[4];
		
		for (int i = 0; i < num.length; i++)
		{
			print(num[i]);
			num[i] = 10;
		}
		
		int arr[] = {2, 3, 4};
		
		int sum = 0;
		for (int i : arr)
			sum += i;
		print("Sum: " + sum + ", Average: " + sum / arr.length);
		
		int days[] = new int[7];
	}
}