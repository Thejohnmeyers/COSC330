import java.util.Scanner;
import java.io.File;
public class Lab8 {
	public static void main(String[] args){
		Scanner sc;
		Scanner sc2 = new Scanner(System.in);
		String B[][] = new String[3][3];
		try {
			System.out.println("Please enter the name of the file you would like to test: ");
			String fileName = sc2.nextLine();
			System.out.println("Thank you! Here is the board to check: ");
			sc = new Scanner(new File(fileName));
			
			 for (int row = 0; row < 3; row++)
			    {
			      for (int col = 0; col < 3; col++)
			      {
			    	  if(sc.hasNext()) {
			    		  String x = sc.nextLine();
			    		  
			    		  B[row][col] = x;
			    		  
			    	  }
			    	  System.out.print(B[row][col] + " ");
			      }
			      System.out.println();
			    }
			 if ((B[0][0] == B[0][1]) && (B[0][1] == B[0][2]))
			    {
			      if(B[0][0] == "X") {
			    	  System.out.println("X is the Winner!");
			    }
			      if(B[0][0] == "O") {
			    	  System.out.println("O is the Winner!");
			    }
			    }
			    else if ((B[1][0] == B[1][1]) && (B[1][1] == B[1][2]))
			    {
			    	if(B[1][0] == "X") {
				    	  System.out.println("X is the Winner!");
				    }
				      if(B[1][0] == "O") {
				    	  System.out.println("O is the Winner!");
				    }
			    }
			    else if ((B[2][0] == B[2][1]) && (B[2][1] == B[2][2]))
			    {
			    	if(B[2][0] == "X") {
				    	  System.out.println("X is the Winner!");
				    }
				      if(B[2][0] == "O") {
				    	  System.out.println("O is the Winner!");
				    }
			    }
			    else if ((B[0][0] == B[1][0]) && (B[1][0] == B[2][0]))
			    {
			    	if(B[0][0] == "X") {
				    	  System.out.println("X is the Winner!");
				    }
				      if(B[0][0] == "O") {
				    	  System.out.println("O is the Winner!");
				    }
			    }
			    else if ((B[0][1] == B[1][1]) && (B[1][1] == B[2][1]))
			    {
			    	if(B[0][1] == "X") {
				    	  System.out.println("X is the Winner!");
				    }
				      if(B[0][1] == "O") {
				    	  System.out.println("O is the Winner!");
				    }
			    }
			    else if ((B[0][2] == B[2][1]) && (B[2][1] == B[2][2]))
			    {
			    	if(B[0][2] == "X") {
				    	  System.out.println("X is the Winner!");
				    }
				      if(B[0][2] == "O") {
				    	  System.out.println("O is the Winner!");
				    }
			    }
			    else if ((B[0][0] == B[1][1]) && (B[1][1] == B[2][2]))
			    {
			    	if(B[0][0] == "X") {
				    	  System.out.println("X is the Winner!");
				    }
				      if(B[0][0] == "O") {
				    	  System.out.println("O is the Winner!");
				    }
			    }
			    else if ((B[0][2] == B[1][1]) && (B[1][1] == B[2][0]))
			    {
			    	if(B[0][2] == "X") {
				    	  System.out.println("X is the Winner!");
				    }
				      if(B[0][2] == "O") {
				    	  System.out.println("O is the Winner!");
				    }
			    }
			    else
			    {
			      System.out.println("No Winner here sorry!");
			    }
			  
			
			sc.close();
			sc2.close();
		} catch (Exception e) {
			System.out.println("There was an error opening the file!");
			System.out.println(e.getMessage());
		}
	
		
	

		
	}
}