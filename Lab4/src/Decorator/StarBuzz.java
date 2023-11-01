package Decorator;
//John Meyers
//testing out starbuzz decorator
public class StarBuzz {

	public static void main(String[] args) {
		Beverage b = new Expresso();
		System.out.println(b.getDescription() + " $" + b.cost());
		Beverage b2 = new HouseBlend();
		b2 = new Mocha(b2);
		System.out.println(b2.getDescription() + " $" + b2.cost());

	}

}
