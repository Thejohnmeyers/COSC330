package diceroll;



public class snakeEyes {
	public static void main(String [] args)
	{
		
	
		double x = 0.0;
		double y = 0.0;
		int counter = 0;
		int box = 1;
		int yo = 1;
		while( box != 0) {
			x = Math.random();
			y = Math.random();
			if (x <= 1.0/6.0) {
				x = 1.0;
				
			}
			else if (x <= 2.0/6.0) {
				x = 2.0;
				
			}
			else if (x <= 3.0/6.0) {
				x = 3.0;
				
			}
			else if (x <= 4.0/6.0) {
				x = 4.0;
				
			}
			else if (x <= 5.0/6.0) {
				x = 5.0;
				
			}
			else {
				x = 6.0;
				
			}
			if (y <= 1.0/6.0) {
				y = 1.0;
			}
			else if (y <= 2.0/6.0) {
				y = 2.0;
			}
			else if (y <= 3.0/6.0) {
				y = 3.0;
			}
			else if (y <= 4.0/6.0) {
				y = 4.0;
			}
			else if (y <= 5.0/6.0) {
				y = 5.0;
			}
			else {
				y = 6.0;
			}
			if (x == 1.0 && y == 1.0) {
				System.out.println("It took " + counter + " tries to get snake eyes");
				break;
			}
			else
			{
				counter++;
			}
			if (x == 5 && y == 6)
			{
				
				System.out.println("there has been " + yo + " yo-levens");
				yo++;
			}
			if (x == 6 && y == 5)
			{
				
				System.out.println("there has been " + yo + " yo-levens");
				yo++;
				
			}
			if (x == 6 && y == 6)
			{
				
				System.out.println("there has been " + box + " boxcars(two sixes)");
				box++;
			}
			 
				
			}
	}

}

