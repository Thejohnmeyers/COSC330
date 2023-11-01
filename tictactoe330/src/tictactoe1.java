
public class tictactoe1 {

	public static void main(String[] args) {
		gameBoard G = new gameBoard();
		G.welcome();
		
		boolean winTest = G.isWin();
		boolean tieTest = G.isTie();
		while(winTest != true) {
			
			G.gameLoop();
			winTest = G.isWin();
			tieTest = G.isTie();
			if(winTest == true) {
				G.displayBoard();
				System.out.println(G.Token + " Win!");
				break;
			}
			else if(tieTest == true) {
				G.displayBoard();
				System.out.println("Game is tied try again sometime!");
				break;
			}
			
		}
		
		
	}
	

}
