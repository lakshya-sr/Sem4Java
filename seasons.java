class Seasons
{
	static String seasons(int month)
	{
		if (month > 12 || month < 1) return "invalid";
		else if (month >= 10 || month == 1) return "winter";
		else if (month >= 2 && month <= 5) return "summer";
		else return "rainy";
	}

	public static void main(String args[])
	{
		for (int i = -1; i < 14; i++)
		{
			System.out.println(seasons(i));
		}
	}
}