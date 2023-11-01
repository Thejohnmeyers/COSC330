
public class Executive extends manager{
	private int stock;
	private int completeSalary;
	Executive(String Last, String First, String Job, int Sal, int BP, int stockop) {
		super(Last, First, Job, Sal, BP);
		stock = stockop;
	}
	void displayStock(){
		System.out.println("Stock Option: " + stock);
	}
	int calcSal() {
		completeSalary = setSal() + getBonus() + stock;
		return completeSalary;
	}
	void displayInfo(){
		super.displayinfo();
		System.out.println("Stock Option: " + stock);
	}
}
