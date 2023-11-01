package Decorator;
//John Meyers
//definging our first condiment
public class Mocha extends CondimentDecorator{

	Beverage beverage;
	public Mocha(Beverage b) {
		this.beverage = b;//creating class instance
	}
	public String getDescription() {
		
		return beverage.getDescription() + " Mocha";// adding mocha to beverage name
	}

	@Override
	public double cost() {
		
		return .20 + beverage.cost();// adding to cost
	}

}
