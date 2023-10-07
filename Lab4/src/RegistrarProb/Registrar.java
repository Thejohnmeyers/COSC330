package RegistrarProb;

public class Registrar {
	public boolean evaluate(Application App, EvaluationCriteria criteria) {
		boolean success = criteria.evaluate(App);
		return success;
	}
}
