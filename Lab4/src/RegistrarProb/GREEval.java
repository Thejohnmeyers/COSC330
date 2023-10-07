package RegistrarProb;

public class GREEval extends CriteriaLink{
	public GREEval(EvaluationCriteria Next) {
		super(Next);
	}
	public boolean evaluate(Application App) {
		if(super.evaluate(App)) {
			System.out.println("GREEval.evaluate called");
			return true;
		}
		else {
			return false;
		}
	
	}

}
