
public class Test_Engineer extends Technical_Staff{

	Test_Engineer(String Last, String First, String Job, int Sal, int PS) {
		super(Last, First, Job, Sal, PS);
		// TODO Auto-generated constructor stub
	}
	int calcSal() {
		compSal = setSal() + profitS;
		return compSal;
	}
	
	void displayInfo(){
		super.displayInfo();
	}
}
