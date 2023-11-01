//John Meyers
//defining the sorting class
public class StratProb1{
	String instructor;
	String title;
	String[] students;
	SortStrat algorithm;
	public  StratProb1(SortStrat name) {
		algorithm = name;//setting the sorting algorithm to whats defined in main
		
	}
	public void courseSort() {
		algorithm.Sort();
	}
	
	
	
}
