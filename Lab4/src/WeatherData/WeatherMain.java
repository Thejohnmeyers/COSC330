package WeatherData;

import java.util.Observable;
import java.util.Observer;

public class WeatherMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Weather w = new Weather();
		w.setMeasurements(97, 30, 10);
		
		CurrentConditionsDisplay c = new CurrentConditionsDisplay(w);
		c.display();
		
		

	}

}
