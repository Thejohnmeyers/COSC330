
public class StratProb1{
	String instructor;
	String title;
	String[] students;
	SortStrat algorithm;
	public  StratProb1(SortStrat name) {
		algorithm = name;
		
	}
	public void courseSort() {
		algorithm.Sort();
	}
	
	
	
}
