package RegistrarProb;
//John Meyers
public class Registrar {
	public boolean evaluate(Application App, EvaluationCriteria criteria) {
		boolean success = criteria.evaluate(App);
		return success;//returning if its a success evaluating the application
	}
}
