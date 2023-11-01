import java.util.Scanner;
public class Salsa {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to your salsa profit calculator! ");
		
		String[] salsa = {"Mild", "Medium", "Sweet", "Hot", "Zesty"};
		double[] price = {2.25, 3.00, 3.50, 4.00, 4.50};
		int[] amount = {0, 0, 0, 0, 0};
		System.out.println("Enter how many Mild salsas were sold (at $2.25 each): ");
		int mild = sc.nextInt();
		System.out.println("Enter how many Medium salsas were sold (at $3.00 each): ");
		int medium = sc.nextInt();
		System.out.println("Enter how many Sweet salsas were sold (at $3.50 each): ");
		int sweet= sc.nextInt();
		System.out.println("Enter how many Hot salsas were sold (at $4.00 each): ");
		int hot = sc.nextInt();
		System.out.println("Enter how many Zesty salsas were sold (at $4.50 each): ");
		int zesty = sc.nextInt();
		amount[0] = mild;
		amount[1] = medium;
		amount[2] = sweet;
		amount[3] = hot;
		amount[4] = zesty;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Processing...");
		System.out.println("Here is your monthly sales report: ");
		double gross = (mild * price[0]) + (medium * price[1]) + (sweet * price[2]) + (hot * price [3]) + (zesty * price[4]);
		double tax = gross * 0.06;
		double net = gross - tax;
		for(int i = 0; i < 5; i++)
		{
			System.out.println(salsa[i] + ":   " + amount[i] + " x " + price[i] + " = " + amount[i] * price[i]);
		}
		System.out.println("--------------------------");
		System.out.println("Gross:            " + gross);
		System.out.format("%-1s %.2f", "tax:             ", tax);
		System.out.println();
		System.out.println("--------------------------");
		System.out.format("%-1s %.2f", "Net:             ", net);
		System.out.println();

		sc.close();
				


		
		
		
		
		
	}
}
