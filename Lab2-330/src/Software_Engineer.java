
public class Software_Engineer extends Technical_Staff{
	private int OTpay;
	Software_Engineer(String Last, String First, String Job, int Sal, int PS, int overtime) {
		super(Last, First, Job, Sal, PS);
		// TODO Auto-generated constructor stub
		OTpay = overtime;
	}
	int calcSal() {
		compSal = setSal() + OTpay; 
		return compSal;
	}
	void displayOT() {
		System.out.println("Overtime Pay: " + OTpay);
	}
	void displayInfo(){
		super.displayInfo();
		System.out.println(" Overtime Pay: " + OTpay);
	}

}
