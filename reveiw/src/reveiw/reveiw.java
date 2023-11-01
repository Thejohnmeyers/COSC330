package reveiw;


	/*
	 * Phillip Riazi
	 * Project 2
	 * COSC 117-601
	 * 11/8/20
	 * 
	 * This program demonstrates the use of subroutines, file input and output, and multidemensional arrays.
	 * 
	 * 
	 * The program begins by asking a user if they want to start a new tic tac toe game or load in a game from 
	 * a text file. If the user chooses to load in the game, they will be asked for the name of the file. The program
	 * will read the file and display the board along with whose turn it is next beginning the game from there.
	 * If the user chooses to start a new game, a blank board will be displayed and X will be asked to go first. 
	 * A player places their X or O by giving an int for the row (1,2,3) and then an int for the column (1,2,3).
	 * When a player wins the program will congratulate them and terminate the program. If no one wins, the program will display this
	 * and terminate. A player may choose to save the game at any time by inputting -1.
	 * 
	 * 
	 * 
	 * 
	 */
	import java.io.File;
	import java.io.PrintWriter;
	import java.util.Scanner;
	public class reveiw {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			boolean winner = false;   // a boolean used for keeping the game going
			char board[][] = {   // initializes and declares the format of the tic tac toe board
					{'_','_','_'},
					{'_','_','_'},
					{'_','_','_'},
			};
			
			System.out.println("Would you like to start a new game or load from a file? N/L");
			
					
					char Answer =  sc.next().charAt(0);    
					
					
					 if(Answer =='L') {  // if the user wants to load in a file
						System.out.println("What is the name of the text file with a valid tic tac toe board ?");  
						String userLoad = sc.next();
						userLoad += sc.nextLine();
						FileLoad(userLoad);  // sends the user inputed file name to the FileLoad function
						
					} 
					 if(Answer == 'N') {		// if the user wants to start a new game.
		
		
		for (int i = 0; i < board.length; i++) {
	        for (int j = 0; j < board.length; j++) {  
	        
	            System.out.print(board[i][j]);    // prints out the blank tic tac toe board.
	            System.out.print(" ");
	        }
	        System.out.println();
	    }
		while(winner = true) {   // this will keep the game going, Xturn then Oturn until the program terminates
		Xturn(board); // sends the board to the Xturn function
		Oturn(board); // then sends the board to the Oturn function.
		}
					 }	
					 
		}
		
		
		/**
		 * This function takes the board and places X
		 * wherever the user decides.
		 * 
		 * @param a: a is the two dimensional char array
		 */
		public static void Xturn(char[][] a) {  
		
			Scanner sc = new Scanner(System.in);
		
			char playerX = 'X';  // creates a char variable called playerX to be used for the placeRC() function.
			
		System.out.println("Player X's turn!");
		
		System.out.println("Enter the row (-1 to save): ");
				while(!sc.hasNextInt()) {	// waits for the user to input a valid int  
	         
							sc.nextLine();
						}
		
			int row = sc.nextInt();  // declares the row as the next int inputed by the user.
			
			if(row >3 || row<-1) {
				
				System.out.println("Invalid row. Enter a number between 1 and 3");
					row= sc.nextInt();
			}
			
			
			if(row == -1) {         // if the user decides to save the game
				System.out.println("What would you like the name of the text file to be?");
				String userFile = sc.next();
				userFile += sc.nextLine();
				tFileSave(userFile, a, playerX);  // sends the new user file name, the current board, and the playerX char to the
													// tFileSave() function.
				System.exit(0); // terminates the program
			}
		System.out.println("Enter the column (-1 to save): ");
		while(!sc.hasNextInt()) {	  
	        
			sc.nextLine();
		
		}
			int column = sc.nextInt();   // declares the column as the next int inputed by the user.
			
		if(column >3 || column<-1) {
				
				System.out.println("Invalid column. Enter a number between 1 and 3");
					column= sc.nextInt();
			}
			
			
			
			if(column == -1) {
				System.out.println("What would you like the name of the text file to be?");
				String userFile = sc.next();
				userFile += sc.nextLine();
				tFileSave(userFile, a, playerX);
				System.exit(0); 
				
			}
			
			placeRC(row, column, playerX, a);    //sends the declared row, column, playerX char, and current board to the placeRC() function
		
		
		}
		public static void Oturn(char[][] b) {
			
			Scanner sc = new Scanner(System.in);
		
			char playerO = 'O';  // creates a char variable called playerO to be used for the placeRC() function.
		System.out.println("Player O's turn!");
		
		System.out.println("Enter the row (-1 to save): ");
		while(!sc.hasNextInt()) {	  
	        
			sc.nextLine();
		}
			int row = sc.nextInt();  // declares the row as the next int inputed by the user.
			
				if(row >3 || row<-1) {
				
				System.out.println("Invalid row. Enter a number between 1 and 3");
					row= sc.nextInt();
			}
			
			if(row == -1) {
				System.out.println("What would you like the name of the text file to be?");
				String userFile = sc.next();
				userFile += sc.nextLine();
				tFileSave(userFile, b, playerO);
				System.exit(0); 
				
			}
			
			
			
			
		System.out.println("Enter the column (-1 to save): ");
		while(!sc.hasNextInt()) {	  
	        
			sc.nextLine();
		}
			int column = sc.nextInt(); // declares the column as the next int inputed by the user.
			
				if(column >3 || column<-1) {
				
				System.out.println("Invalid column. Enter a number between 1 and 3");
					column= sc.nextInt();
					}
			
			
			
			if(column == -1) {
				System.out.println("What would you like the name of the text file to be?");
				String userFile = sc.next();
				userFile += sc.nextLine();
				tFileSave(userFile, b, playerO);
				System.exit(0); 
				
			}
			
			placeRC(row, column, playerO, b);  // sends the declared row, column, playerX char, and current board to the placeRC() function
		
		
		}
		
		public static void placeRC(int row, int column, char player, char[][] tboard) {
			Scanner sc = new Scanner(System.in);
			
			if(tboard[row-1][column-1] == 'X' || tboard[row-1][column-1] == 'O') { // if the user tries to place and X or an O where there already
	    		System.out.println("You can't go there! Try another spot!");		// is one.
	    		if(player == 'O') {  // if it's O's turn
	    			Oturn(tboard);  // sends the board back to the Oturn function, so it asks for another placement 
	    			return;        // returns out of the if statement.
	    		}
	    		if(player == 'X') { // if it's X's turn
	    			Xturn(tboard); // sends the board back to the Xturn function, so it asks for another placement
	    			return;    // returns out of the if statement.
	    		}
	    	}
			
			
			tboard[row-1][column-1] = player;   // places the X or O at the valid spot that the user inputed.
			  // the -1 is because otherwise the user would have to say row 0 when they meant row 1
			
			
			for (int i = 0; i < tboard.length; i++) {
		        for (int j = 0; j < tboard.length; j++) {
		      
		        	
		            System.out.print(tboard[i][j]);   // prints out the new board with the new placement.
		            System.out.print(" ");
		        }
		        
		        
		      //  winnerCheck(tboard);
		        System.out.println();
		        
		    }
			
		
			winnerCheck(tboard);  // sends the board to the winnerCheck() function.
			
			
		}
		
		/**
		 * This function checks if there is a winner or not.
		 * Takes the current board sent from placeRC().
		 * 
		 * @param board: A two dimensional array.
		 */
		public static void winnerCheck(char[][] board) {   
			
			// the function will check the board with each of these if statements
		
			// These are all of the possible winning combinations for tic tac toe
			if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
				System.out.println("X won!");   // depending on the winner combination it will output this congratulating the user.
				System.exit(0);  // terminates the program.
			}
			if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' ) {
				System.out.println("O won!");
				System.exit(0); 
			}
			if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' ) {
				System.out.println("X won!");
				System.exit(0); 
			}
			if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' ) {
				System.out.println("O won!");
				System.exit(0); 
			}
			if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' ) {
				System.out.println("X won!");
				System.exit(0); 
			}
			if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' ) {
				System.out.println("O won!");
				System.exit(0); 
			}
			if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ) {
				System.out.println("X won!");
				System.exit(0); 
			}
			if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' ) {
				System.out.println("O won!");
				System.exit(0); 
			}
			if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' ) {
				System.out.println("X won!");
				System.exit(0); 
			}
			if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' ) {
				System.out.println("O won!");
				System.exit(0); 
			}
			if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X' ) {
				System.out.println("X won!");
				System.exit(0); 
			}
			if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O' ) {
				System.out.println("O won!");
				System.exit(0); 
			}
			if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ) {  // diagonal
				System.out.println("X won!");
				System.exit(0); 
			}
			if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ) {  // diagonal
				System.out.println("O won!");
				System.exit(0); 
			}
			if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X' ) {  // diagonal opposite
				System.out.println("X won!");
				System.exit(0); 
			}
			if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O' ) {  // diagonal opposite
				System.out.println("O won!");
				System.exit(0); 
			} 
					
			
			// this if statement checks to see if the board is filled out and no one has won.
		        	if((board[0][0] == 'X' || board[0][0] == 'O') && (board[0][1] == 'X' || board[0][1] == 'O') &&
		        			(board[0][2] == 'X' || board[0][2] == 'O') && (board[1][0] == 'X' || board[1][0] == 'O') &&
		        			(board[1][1] == 'X' || board[1][1] == 'O') &&(board[1][2] == 'X' || board[1][2] == 'O') &&
		        			(board[2][0] == 'X' || board[2][0] == 'O' )&&(board[2][1] == 'X' || board[2][1] == 'O') &&
		        			(board[2][2] == 'X' || board[2][2] == 'O')) {
		        		
		        		System.out.println("Sorry no winners!");
		        		System.exit(0);
		        	}
		        	
		        	
			
			
		}
		
		/**
		 * This function creates a new file with the user inputed file name
		 * and saves the board to the file.
		 * 
		 * @param file: a string, the user inputed name of the file
		 * @param board: a two dimensional, the current board, to be sent to printed to the file
		 * @param player: a char, the current term, X or O.
		 */
		public static void tFileSave(String file, char[][] board, char player) {  
		
			
			try {
				
			
				File tfile = new File(file +".txt");		// creates a new text file with the user inputed file name
				PrintWriter outfile = new PrintWriter(tfile);   // opens the PrintWriter named outfile to print
																// to the user file tfile
				for(int row =0; row<board.length; row++) {
					for(int col = 0; col<board[row].length; col++) {    //reads the board into the char board array.
						outfile.print(board[row][col] + " "); //prints out the tic tac toe board.
					}
					outfile.println(); // so that the next line does not start right after the last board char.
					
				}
			
				outfile.close(); // closes the outfile
				
				System.out.println("Text File "+ file + " created!");
				System.out.println("I'll remember it's " + player + "'s turn if you load in the file later!");
					
			} catch(Exception e) {
			System.out.println("Error opening file.");
				return;
			}
			
			
		}
		
		
		/**
		 * This function reads in a valid tic tac toe board from a text file.
		 * 
		 * 
		 * @param file : a string, the name of the file to read in from the user.
		 */
		public static void FileLoad(String file) {
			Scanner sc = new Scanner(System.in);
			boolean winner2 = false;  // a boolean to keep the game going with the new board
			int counterX = 0;  // declares and initializes a counter for X
			int counterO = 0;  // declares and initializes a counter for O
			
			
			char board[][] = {
					{'_','_','_'},   // the format of the tic tac toe board
					{'_','_','_'},
					{'_','_','_'},
			};
			
			try {
				//sc = new Scanner(new File("/Users/priaz/Desktop/"+file +".txt"));   //opens a scanner that reads the file
			//	File tfile = new File(file +".txt");	
				sc = new Scanner(new File(file +".txt"));   //opens a scanner that reads the file
				
				
			} catch (Exception e) {
				System.out.println("Error.");   // If the file cannot be opened outputs this.
			}
			
			while(sc.hasNext("X")|| sc.hasNext("_")||sc.hasNext("O")) {    // while there are chars to read
				for(int row =0; row<board.length; row++) {
					for(int col = 0; col<board[row].length; col++) {    //reads the board into the char board array.
						
						
						board[row][col] = sc.next().charAt(0);
						
						
						if(board[row][col] == 'X') {
							 counterX ++;  // counts how many X's there are, to be used to decide who goes first
				
						}
						if(board[row][col] == 'O') {
							counterO ++; // counts how many O's there are, to be used to decide who goes first.
						}
						System.out.print(board[row][col] + " "); //prints out the tic tac toe board.
						
					}
					System.out.println(); // so that the next line does not start right after the last board char.
					
				}
			
			}
			
			if(counterX== 1 && counterO == 0) {
				while(winner2==false) {
					Oturn(board);
					Xturn(board);
					}
			}
			if(counterX== 0 && counterO == 1) {
				while(winner2==false) {
					Xturn(board);
					Oturn(board);
					}
			
			}
			
			if(counterX == 0 && counterO == 0) { // if there are no X or O start with Xturn
				while(winner2 == false) {
				Xturn(board);
				Oturn(board);
				}
			}
			if(counterX % 2 == 0 && counterO % 2 != 0)   {     // if the amount of X are even and O is odd it is O's turn
				while(winner2==false) {
				Oturn(board);
				Xturn(board);
				}
			}
			
			if(counterX == counterO) {  // if both are the same it is X's turn 
				while(winner2 == false) {
				Xturn(board);
				Oturn(board);
				}
				
			}
			
		
		}
		

		
		
		
		
	}


