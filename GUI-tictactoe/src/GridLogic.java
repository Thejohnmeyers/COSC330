

public class GridLogic {
	private String[][] grid = new String[3][3];
	public GridLogic(String[][] buttonArr) {
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				grid[row][col] = buttonArr[row][col];
			}
		}
	}
	public boolean isWin() {
		for(int i = 0; i < 3; i++) {
			if(grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
				//win
				
				return true;
			}
			else if(grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
				//win
				
				return true;
			}
			
		}
		if(grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
			//win
			return true;
		}
		else if(grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
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
				if(grid[row][col].equals("X") || grid[row][col].equals("O")) {
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
