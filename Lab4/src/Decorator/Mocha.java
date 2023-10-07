package Decorator;

public class Mocha extends CondimentDecorator{

	Beverage beverage;
	public Mocha(Beverage b) {
		this.beverage = b;
	}
	public String getDescription() {
		
		return beverage.getDescription() + " Mocha";
	}

	@Override
	public double cost() {
		
		return .20 + beverage.cost();
	}

}
