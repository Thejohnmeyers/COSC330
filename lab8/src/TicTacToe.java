
import java.util.*;
public class TicTacToe
{
    public TicTacToe()
    {
            Scanner input = new Scanner(System.in);
                                  
            char[][] board = new char[3][3];             // Sets up game board
            final int totalturns = 9;                    // Initiaqlizes total amount of turns
            
            newBoard(board);
            print(board);
    }
    
    public static void print (String args[]) 
    {
    }
    
    private static void newBoard(char[][] board)
    {
        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[0].length; col++)
            {
                board[row][col] = '-';
            }
        }
    }
        
    private static void print(char[][] board)
    {
        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[0].length; col++)
            {
                System.out.print(board[row][col]);
            }
        }
    }      
   }