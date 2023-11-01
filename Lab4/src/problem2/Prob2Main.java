package problem2;
//John Meyers
//testing the double interface
public class Prob2Main {

	public static void main(String[] args) {
		StratProblem2 main = new StratProblem2(new Adult(), new USTax());
		main.sales();
		main.ticket();

	}

}
