package review;

public class arrayof100 {
	public static void main(String[] args)
	{
		double myNumbers[] = new double[100];
		int count = 0;
		for(int i = 0; i < 100; i++)
		{
			if(myNumbers[i] == 10.5)
			{
				count++;
			}
			
		}
		System.out.println("10.5 occurs in the array " + count + " times");
		System.out.println("test" + 2 * 3);
	}
}
