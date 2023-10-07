import javax.swing.JButton;

public class GridController {
	private String[][] grid = new String[3][3];
	GridLogic model;
	public GridController(JButton[][] buttonArr) {
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				grid[row][col] = buttonArr[row][col].getName();
				System.out.println(grid[row][col]);
			}
		}
		model = new GridLogic(grid);
		
		
		
	}
	public boolean checkTie() {
		boolean tie = model.isTie();
		return tie;
	}
	public boolean checkWin() {
		boolean win = model.isWin();
		return win;
	}
	
	
	
}
