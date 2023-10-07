package RegistrarProb;

public class CriteriaLink extends EvaluationCriteria{
	private EvaluationCriteria next;
	public CriteriaLink(EvaluationCriteria theNext) {
		next = theNext;
	}
	public boolean evaluate(Application App) {
		if(next != null) {
			return next.evaluate(App);
		}
		else {
			return true;
		}
	}

}
