
public class manager extends Employee{
	private int bonus;
	private int completeSalary;
	private int sal;
	manager(String Last, String First, String Job, int Sal, int BP) {
		super(Last, First, Job, Sal);
		setBonus(BP);
		
	}
	protected int bonusPayment;
	void displayBonus() {
		System.out.println("Bonus payment: " + getBonus());
	}
	int calcSalaryBonus() {
		sal = setSal();
		completeSalary = getBonus() + sal;
		return completeSalary;
	}
	void displayinfo() {
		super.displayInfo();
		System.out.println("Bonus payment: " + getBonus());
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
