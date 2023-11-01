
public class Employee {
	private String lName, fName, jTitle;
	private int bSalary;
	Employee(String Last, String First, String Job, int Sal){
		lName = Last;
		fName = First;
		jTitle = Job;
		bSalary = Sal;
	}
	void displayInfo(){
		System.out.println("Name: " + lName + ", " + fName + " Title: " + jTitle + " Base Salary: " + bSalary);
		
	}
	void displayName() {
		System.out.println("Name: " + lName + ", " + fName);
	}
	void displaySal() {
		System.out.println("Base Salary: " + bSalary);
		
	}
	int setSal() {
		return bSalary;
	}
	void displayTitle() {
		System.out.println("Title: " + jTitle);
	}
	
}
