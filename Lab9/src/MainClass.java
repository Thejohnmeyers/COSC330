import java.util.Scanner;
public class MainClass {
	int[] inventory = {1, 2, 3, 4, 5};
	Inventory in = new Inventory();
	public void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < inventory.length; i++) {
			System.out.println("What is the name of item " + inventory[i]);
			String n = sc.nextLine();
			in.setName(n);
			System.out.println("What is the price of item " + inventory[i]);
			double p = sc.nextDouble();
			in.setPrice(p);
			System.out.println("how much stock is there of item " + inventory[i]);
			int s = sc.nextInt();
			in.setStock(s);
			
		}
	}
	
	
	
	
	public static void showInventory(Inventory[] items) {
		System.out.println(items);
	}
}
