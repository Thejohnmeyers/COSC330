package WeatherData;

import java.util.Observable;
import java.util.Observer;

public class WeatherMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Weather w = new Weather();
		w.addObserver(new CurrentConditionsDisplay(w));
		w.addObserver(new ForecastDisplay(w));
		w.addObserver(new StatisticDisplay(w));// creating observers for each
		w.setMeasurements(97, 30, 10);
		w.setMeasurements(30, 400, 0);
		w.setMeasurements(4, 20, 10);//testing measurements
		
		
		
		

	}

}
