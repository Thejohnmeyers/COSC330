package Decorator;
//John Meyers
//Main Beverageclass
public abstract class Beverage {
	String description = "Unknown Beverage";
	public String getDescription() {
		return description;
	}//defining needed methods
	public abstract double cost();
	
}

