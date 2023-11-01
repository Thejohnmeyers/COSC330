package craps;

public class Craps {
	public static void main(String[] args)
	{
		/*
		double rand = Math.random();
		System.out.println(rand*10);
		int myRand = (int) (rand*10);
		System.out.println(myRand);
		int proRand = (int) (Math.random()*10);
		System.out.println(proRand);
		*/
		double[] testScores;
		testScores = new double[5];
		testScores[0] = 87;
		System.out.println("person 0 got a " + testScores[0] + "%");
		// index by index for arrays
		for (int i = 0; i <testScores.length; i++)
		{
			System.out.println("Score for person " + i + ": ");
			testScores[i] = sc.nextDouble
		}
		for (int i = 0; i <testScores.length; i++)
		{
			System.out.println("testScores[" + i + "] = " + testScores[i]);
		}
	}
}
