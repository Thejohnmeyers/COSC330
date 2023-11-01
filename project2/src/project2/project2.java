package project2;
import java.util.Scanner;
public class project2 {
	public static void displayBoard(String[][] gameBoard)
	  {
	     for (int row = 0; row < 3; row++)
	    {
	      for (int col = 0; col < 3; col++)
	      {
	        System.out.print(gameBoard[row][col] + " ");
	      }
	      System.out.println();
	    }

	  }
	  
	  public static boolean isWin(String[][] gameBoard)
	  {
	    if ((gameBoard[0][0] == gameBoard[0][1]) && (gameBoard[0][1] == gameBoard[0][2]))
	    {
	      return true;
	    }
	    else if ((gameBoard[1][0] == gameBoard[1][1]) && (gameBoard[1][1] == gameBoard[1][2]))
	    {
	      return true;
	    }
	    else if ((gameBoard[2][0] == gameBoard[2][1]) && (gameBoard[2][1] == gameBoard[2][2]))
	    {
	      return true;
	    }
	    else if ((gameBoard[0][0] == gameBoard[1][0]) && (gameBoard[1][0] == gameBoard[2][0]))
	    {
	      return true;
	    }
	    else if ((gameBoard[0][1] == gameBoard[1][1]) && (gameBoard[1][1] == gameBoard[2][1]))
	    {
	      return true;
	    }
	    else if ((gameBoard[0][2] == gameBoard[2][1]) && (gameBoard[2][1] == gameBoard[2][2]))
	    {
	      return true;
	    }
	    else if ((gameBoard[0][0] == gameBoard[1][1]) && (gameBoard[1][1] == gameBoard[2][2]))
	    {
	      return true;
	    }
	    else if ((gameBoard[0][2] == gameBoard[1][1]) && (gameBoard[1][1] == gameBoard[2][0]))
	    {
	      return true;
	    }
	    else
	    {
	      return false;
	    }
	  }
	  
	  public static void main(String[] args) 
	  {
	    System.out.println("TIC TAC TOE");
	    Scanner input = new Scanner(System.in);
	    System.out.println("Player 1 would you like to be X or O? ");
	    String playerToken = input.nextLine();
	    String player1Token = playerToken.toUpperCase();
	    String player2Token = "";
	    if (player1Token.equals("X"))
	    {
	      player2Token = "O";
	    }
	    else
	    {
	      player2Token = "X";
	    }
	    System.out.println("Player 1: " + player1Token);
	    System.out.println("Player 2: " + player2Token);
	    String Token;
	    double ranNum = Math.random();
	    if (ranNum > 0.5)
	    {
	      Token = "X";
	    }
	    else
	    {
	      Token = "O";
	    }
	    System.out.println(Token + " move first");
	    String B[][] = new String[3][3];
	    B[0][0] = "1";
	    B[0][1] = "2";
	    B[0][2] = "3";
	    B[1][0] = "4";
	    B[1][1] = "5";
	    B[1][2] = "6";
	    B[2][0] = "7";
	    B[2][1] = "8";
	    B[2][2] = "9";

	    int movecount = 0;


	    while(isWin(B) == false)
	    {
	      
	      
	      
	      if(Token.equals("X"))
	      {
	        displayBoard(B);
	        System.out.println("X's turn");
	        int move = input.nextInt();
	        if (move == 1 && B[0][0] == "1")
	        {
	          B[0][0] = Token;
	          movecount++;
	        }
	        
	        else if (move == 2 && B[0][1] == "2")
	        {
	          B[0][1] = Token;
	          movecount++;
	        }
	        
	        else if (move == 3 && B[0][2] == "3")
	        {
	          B[0][2] = Token;
	          movecount++;
	        }
	        
	        else if (move == 4 && B[1][0] == "4")
	        {
	          B[1][0] = Token;
	          movecount++;
	        }
	        
	        else if (move == 5 && B[1][1] == "5")
	        {
	          B[1][1] = Token;
	          movecount++;
	        }
	        
	        else if (move == 6 && B[1][2] == "6")
	        {
	          B[1][2] = Token;
	          movecount++;
	        }
	        else if (move == 7 && B[2][0] == "7")
	        {
	          B[2][0] = Token;
	          movecount++;
	        }
	        
	        else if (move == 8 && B[2][1] == "8")
	        {
	          B[2][1] = Token;
	          movecount++;
	        }
	        
	        else if (move == 9 && B[2][2] == "9")
	        {
	          B[2][2] = Token;
	          movecount++;
	        }
	        else
	        {
	        	System.out.println("Invalid move your turn has been skipped");
	        }
	        Token = "O";
	      }
	      if(Token.equals("O"))
	      {
	        displayBoard(B);
	        System.out.println("O's turn");
	        int move1 = input.nextInt();
	        if (move1 == 1 && B[0][0] == "1")
	        {
	          B[0][0] = Token;
	          movecount++;
	        }
	        
	        else if (move1 == 2 && B[0][1] == "2")
	        {
	          B[0][1] = Token;
	          movecount++;
	        }
	        else if (move1 == 3 && B[0][2] == "3")
	        {
	          B[0][2] = Token;
	          movecount++;
	        }
	        else if (move1 == 4 && B[1][0] == "4")
	        {
	          B[1][0] = Token;
	          movecount++;
	        }
	        else if (move1 == 5 && B[1][1] == "5")
	        {
	          B[1][1] = Token;
	          movecount++;
	        }
	        else if (move1 == 6 && B[1][2] == "6")
	        {
	          B[1][2] = Token;
	          movecount++;
	        }
	        else if (move1 == 7 && B[2][0] == "7")
	        {
	          B[2][0] = Token;
	          movecount++;
	        }
	        else if (move1 == 8 && B[2][1] == "8")
	        {
	          B[2][1] = Token;
	          movecount++;
	        }
	        else if (move1 == 9 && B[2][2] == "9")
	        {
	          B[2][2] = Token;
	          movecount++;
	        }
	        else
	        {
	        	System.out.println("Invalid move your turn has been skipped");
	        }
	        Token = "X";
	      }
	    }

	   if (isWin(B) == true)
	   {
		   
	     System.out.println("Congratulations you won!");

	   }
	   if (movecount == 9)
	   {
	     System.out.println("Tie");
	   }
	   input.close();

	  }
}
