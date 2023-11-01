package lab7;
import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.*;
public class fileinput {
	public static void main(String[] args) {
		PrintWriter outfile;
		Scanner sc = new Scanner(System.in);
		System.out.println("If you would like to encode(1) enter a 1 or if you would like to decode(2) enter a 2:");
		int answer  = sc.nextInt();
		if(answer == 1)
		{
			System.out.println("You have chosen to encode please enter something to encode: ");
			String phrase = sc.nextLine();
			System.out.println("How far would you like to shift? ");
			int shift = sc.nextInt();
			char[] x = new char[phrase.length()];
			for (int i = 0; i < phrase.length(); i++) { 
	            x[i] = phrase.charAt(i);
			}
			for (int c = 0; c < phrase.length(); c++)
			{
				int combined = x[c] + shift;
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
			System.out.println("please enter the file you would like to put the encoded phrase in: ");
			String file = sc.nextLine();
			
			try
			{
				outfile = new PrintWriter(new File(file));
				
			}
			catch(Exception e) {
				System.out.println("error!");
				return;
			}
		}
		else if(answer == 2)
		{
			System.out.println("You have chosen to decrypt a file");
			System.out.println("please enter a file: ");
			String file2 = sc.nextLine();
			Scanner x;
			try {
				x = new Scanner(new File(file2));
				while(x.hasNextLine())
				{
					String y = x.nextLine();
					System.out.println("Your phrase that will be decrypted is " + y);
					System.out.println("What was the original shift of the encoded phrase: ");
					int shift2 = sc.nextInt();
					char[] v = new char[y.length()];
					for (int i = 0; i < y.length(); i++) { 
			            v[i] = y.charAt(i);
					}
					for (int c = 0; c < y.length(); c++)
					{
						int combined2 = v[c] - shift2;
						if(v[c] - shift2 >= 96)
						{
							v[c] = (char) combined2;
								
						}
							
						if (v[c] - shift2 < 96)
						{
							int p = shift2 - 96;
							int o = p + v[c];
							int s = o - shift2;
							int r = shift2 - s;
							int fin = 122 - r;
							v[c] = (char) fin;
						}
						
					}
					System.out.print("Here is your final decrypted phrase: ");
					for(int b = 0; b < y.length(); b++)
					{
						System.out.print(v[b]);
					}
				}
				x.close();
			}
			catch(Exception e) {
				System.out.println("There was a problem opening your file");
				System.out.println(e.getMessage());
			}
		}
		sc.close();
		
	}
}
