import java.util.Scanner;
public class Ceaser {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char[] letters = {'a', 'e', 'l', 'o', 's', 't'};
		char[] symbols = {'@', '3', '1', '0', '$', '7'};

		System.out.println("Please enter a statement with all lower-case letters: ");
		String state = sc.nextLine();
		String answer = state.toLowerCase();
		char[] x = new char[answer.length()];
		for (int i = 0; i < answer.length(); i++) { 
            x[i] = answer.charAt(i); 
        } 
		for(int y = 0; y < x.length; y++)
		{
			if(x[y] == letters[0])
			{
				x[y] = symbols[0];
			}
			if(x[y] == letters[1])
			{
				x[y] = symbols[1];
			}
			if(x[y] == letters[2])
			{
				x[y] = symbols[2];
			}
			if(x[y] == letters[3])
			{
				x[y] = symbols[3];
			}
			if(x[y] == letters[4])
			{
				x[y] = symbols[4];
			}
			if(x[y] == letters[5])
			{
				x[y] = symbols[5];
			}
		}
		System.out.println("Enter an integer for the ceasar cypher shift: ");
		int shift = sc.nextInt();
		for (int c = 0; c < answer.length(); c++)
		{
			int combined = x[c] + shift;
			System.out.println(x[c]);
			System.out.println((int) x[c]);
			System.out.println(x[c] + shift);
			System.out.println((char) combined);
			if(x[c] + shift <= 122)
			{
				x[c] = (char) combined;
				
			}
			
			if (x[c] + shift > 122)
			{
				int r = shift - 122;
				int u = r + x[c];
				int fin = u + 96;
				x[c] = (char) fin;
			}

		}
		System.out.print("Here is your final shifted phrase: ");
		for(int b = 0; b < answer.length(); b++)
		{
			System.out.print(x[b]);
		}
	}
}
