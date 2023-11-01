package problem2;
//John Meyers
//setting the variables to be displayed
public class StratProblem2 {
	TicketType ticketType;
	SalesTax salesTax;
	public StratProblem2(TicketType type, SalesTax sale) {
		ticketType = type;
		salesTax = sale;
	}
	public void sales() {
		salesTax.CountryTax();
	}
	public void ticket() {
		ticketType.TicketPrice();
	}
}
