import java.util.Scanner;

public class gameBoard {
	public String Board[][] = {{"0","1","2"},{"3","4","5"},{"6","7","8"}};
	protected String Token;
	protected int movecount = 0;
	Scanner input = new Scanner(System.in);
	public void displayBoard()
	  {
	     for (int row = 0; row < 3; row++)
	    {
	      for (int col = 0; col < 3; col++)
	      {
	        if(col != 0) {
	        	System.out.print("| ");
	        }
	    	System.out.print(Board[row][col] + " ");
	      }
	      if(row != 2) {
	    	  System.out.println();
	    	  System.out.print("---------");
	      }
	      System.out.println();
	    }

	  }
	public void welcome() {
		System.out.println("TIC TAC TOE");
		String playerToken;
	    
	    System.out.println("Player 1 would you like to be X or O? ");
	    playerToken = input.nextLine();
	    String player1Token = playerToken.toUpperCase();
	    String player2Token = "";
	    if (player1Token.equals("X"))
	    {
	      player2Token = "O";
	    }
	    else if(player1Token.equals("O"))
	    {
	      player2Token = "X";
	    }
	    else {
	    	System.out.println("Invalid Input you have been given the following tokens to play");
	    	player1Token = "X";
	    	player2Token = "O";
	    }
	    System.out.println("Player 1: " + player1Token);
	    System.out.println("Player 2: " + player2Token);
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
	    
	}
	public void insertX(int row, int column) {
		if(Board[row][column] != "O" || Board[row][column] != "X") {
			Board[row][column] = "X";
		}
		else {
			System.out.println("Invalid input your turn has been skipped");
		}
	}
	public void insertO(int row, int column) {
		if(Board[row][column] != "O" || Board[row][column] != "X") {
			Board[row][column] = "O";
		}
		else {
			System.out.println("Invalid input your turn has been skipped");
		}
	}
	public void gameLoop() {
		if(Token.equals("X"))
	      {
	        displayBoard();
	        System.out.println("X's turn");
	        String move = input.nextLine();
	        int invalidTest = 0;
	        for(int row = 0; row < 3; row++) {
	        	for(int col = 0; col < 3; col++) {
	        		
	        		if(move == "X" || move == "O") {
	        			invalidTest++;
	        			continue;
	        		}
	        		else if(move.equals(Board[row][col])) {
	        			Board[row][col] = Token;
	        			invalidTest = 0;
	        			break;
	        		}
	        		else {
	        			invalidTest++;
	        		}
	        	}
	        	if(invalidTest == 0) {
	        		break;
	        	}
	        }
	        if(invalidTest > 0) {
	        	System.out.println("Invalid Input your turn has been skipped");
	        }
	        if(isWin() == false) {
	        	Token = "O";
	        }
	      }
		else if(Token.equals("O"))
	      {
	        displayBoard();
	        System.out.println("O's turn");
	        String move = input.nextLine();
	        int invalidTest = 0;
	        for(int row = 0; row < 3; row++) {
	        	for(int col = 0; col < 3; col++) {
	        		
	        		if(move == "X" || move == "O") {
	        			invalidTest++;
	        			continue;
	        		}
	        		else if(move.equals(Board[row][col])) {
	        			Board[row][col] = Token;
	        			invalidTest = 0;
	        			break;
	        			
	        		}
	        		else {
	        			invalidTest++;
	        		}
	        	}
	        	if(invalidTest == 0) {
	        		break;
	        	}
	        }
	        if(invalidTest > 0) {
	        	System.out.println("Invalid Input your turn has been skipped");
	        }
	        if(isWin() == false) {
	        	Token = "X";
	        }
	    }

	}
	public boolean isWin() {
		for(int i = 0; i < 3; i++) {
			if(Board[0][i] == Board[1][i] && Board[1][i] == Board[2][i]) {
				//win
				
				return true;
			}
			else if(Board[i][0] == Board[i][1] && Board[i][1] == Board[i][2]) {
				//win
				
				return true;
			}
			
		}
		if(Board[0][0] == Board[1][1] && Board[1][1] == Board[2][2]) {
			//win
			return true;
		}
		else if(Board[0][2] == Board[1][1] && Board[1][1] == Board[2][0]) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public boolean isTie() {
		int numCount = 0;
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				if(Board[row][col].equals("X") || Board[row][col].equals("O")) {
					numCount++;
				}
			}
		}
		if(numCount == 9) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
