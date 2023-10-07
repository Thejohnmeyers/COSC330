package RegistrarProb;

public class TestCode {
	public static void main(String args[]) {
		Application app = new Application();
		Registrar reg = new Registrar();
		System.out.println("Running first eval");
		GPAEval aEval = new GPAEval();
		reg.evaluate(app, aEval);
		//GRE
		System.out.println("Running second eval");
		GREEval aEval2 = new GREEval(new GPAEval());
		reg.evaluate(app, aEval2);
		
		//TOEFL
		System.out.println("Running third eval");
		TOEFLEval aEval3 = new TOEFLEval(new GPAEval());
		reg.evaluate(app, aEval3);
		
		//all three
		System.out.println("Running fourth eval");
		EvaluationCriteria criteria = new TOEFLEval(aEval2);
		reg.evaluate(app, criteria);
	}
}
