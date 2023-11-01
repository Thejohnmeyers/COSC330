import java.util.Scanner;
class Dice {
	private int value;
	private int sides;
	
	public void setSides(int s) {
		while (s == 4 || s == 6 || s == 8 || s == 10 || s == 12 || s == 20) {
			sides = s;
			break;
		}
	}
	public int getValue() {
		
		
		double random = Math.random();
		int num = (int) (random * sides);
		value = num;
		return value;
			
		
	}
	public void roll(int side) {
		
		setSides(side);
		getValue();
	}
}
class Roll{
	private int[] diceArr = new int[100];
	private int amount;
	Dice dice = new Dice();
	public void main(String[] args) {
		
		dice.setSides(6);
		for(int i=0;i<2;i++) {
			int n = dice.getValue();
			diceArr[i] = n;
		}
	}
	public void roll() {
		for(int i=0;i<amount;i++) {
			
			System.out.println("This is the new value of the dice " + diceArr[i]);
		}
		
	}
	public int getTotal() {
		int sum = 0;
		for(int i = 0; i < amount; i++) {
			sum = sum + diceArr[i];
		}
		
		System.out.println("This is the total of the " + amount + " dice " + sum);
		return sum;
	}
	public void diceRolled(int rolled, int sides) {
		amount = rolled;
		while (sides == 4 || sides == 6 || sides == 8 || sides == 10 || sides == 12 || sides == 20) {
			if(rolled < 0) {
				System.out.println("Thats an invalid amount of dice");
				break;
			}
			else {
				for(int i = 0; i < rolled; i++) {
					double random = Math.random();
					int num = (int) (random * sides);
					diceArr[i] = num;
					
				}
				break;
			}
		}
	}
}



class diceRoll{
	
	public static void main(String[] args) {
		Dice d = new Dice();
		Roll r = new Roll();
		Scanner sc = new Scanner(System.in);
		System.out.println("how many dice would you like? ");
		int die = sc.nextInt();
		System.out.println("How many sides would you like? (choose between 4,6,8,10,12,20) ");
		int side = sc.nextInt();
		r.diceRolled(die, side);
		d.roll(side);
		r.getTotal();
		sc.close();
	}
	
}