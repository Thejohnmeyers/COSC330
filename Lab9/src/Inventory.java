
public class Inventory {
	String name;
	int stock;
	double price;
	String[] name2 = {" ", " ", " ", " ", " "};
	double[] price2 = {0, 0, 0, 0, 0};
	int[] stock2 = {0, 0, 0, 0, 0};
	public void setName(String n) {
		name = n;
		if(name2[0] == " ")
		{
			name2[0] = name;
		}
		else if(name2[1] == " ")
		{
			name2[1] = name;
		}
		else if(name2[2] == " ")
		{
			name2[2] = name;
		}
		else if(name2[3] == " ")
		{
			name2[3] = name;
		}
		else if(name2[4] == " ")
		{
			name2[4] = name;
		}
		else {
			System.out.println("error!");
		}
	}
	public String getName() {
		return name;
	}
	public void setStock(int s) {
		stock = s;
		if(stock2[0] == 0)
		{
			stock2[0] = stock;
		}
		else if(stock2[1] == 0)
		{
			stock2[1] = stock;
		}
		else if(stock2[2] == 0)
		{
			stock2[2] = stock;
		}
		else if(stock2[3] == 0)
		{
			stock2[3] = stock;
		}
		else if(stock2[4] == 0)
		{
			stock2[4] = stock;
		}
		else {
			System.out.println("error!");
		}
	}
	public int getStock() {
		return stock;
	}
	public void setPrice(double p) {
		price = p;

		if(price2[0] == 0)
		{
			price2[0] = price;
		}
		else if(price2[1] == 0)
		{
			price2[1] = price;
		}
		else if(price2[2] == 0)
		{
			price2[2] = price;
		}
		else if(price2[3] == 0)
		{
			price2[3] = price;
		}
		else if(price2[4] == 0)
		{
			price2[4] = price;
		}
		else {
			System.out.println("error!");
		}
	
	}
	public double getPrice() {
		return price;
	}
}
