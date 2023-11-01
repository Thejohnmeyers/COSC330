
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee employeeArr[] = new Employee[3];
		Executive emp0 = new Executive("John", "Doe", "VP", 100000, 1000000, 2000);
		Software_Engineer emp1 = new Software_Engineer("Seth", "Meyers", "Developer", 90000, 30000, 12000);
		Test_Engineer emp2 = new Test_Engineer("Sean", "Jones", "Tester", 80000, 20000);
		employeeArr[0] = emp0;
		employeeArr[1] = emp1;
		employeeArr[2] = emp2;
		employeeArr[0].displayInfo();
		employeeArr[1].displayInfo();
		employeeArr[2].displayInfo();
		emp0.displayInfo();
		emp1.displayInfo();
		emp2.displayInfo();
	}

}
