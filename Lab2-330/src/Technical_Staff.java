
public class Technical_Staff extends Employee{
	protected int profitS;
	protected int compSal;
	Technical_Staff(String Last, String First, String Job, int Sal, int PS) {
		super(Last, First, Job, Sal);
		profitS = PS;
	}
	int calcSal() {
		compSal = setSal() + profitS;
		return compSal;
	}
	void displayPS(){
		System.out.println("Profit Sharing: " + profitS);
	}
	void displayInfo(){
		super.displayInfo();
		System.out.println("Profit Sharing: " + profitS);
	}
}
