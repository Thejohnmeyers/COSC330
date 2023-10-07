package RegistrarProb;
//john meyers
//TOEFL implementation for grades
public class TOEFLEval extends CriteriaLink{
	public TOEFLEval(EvaluationCriteria Next) {
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
