package WeatherData;

import java.util.Observable;

import java.util.Observer;

//John Meyers
//Forecast implementation of observer
@SuppressWarnings("deprecation")
public class ForecastDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if (obs instanceof Weather) {
			Weather weatherData = (Weather)obs;
			this.temperature = weatherData.getTemperature();
			
			display();
		}
	}
	
	public void display() {
		System.out.println("Forecast: " + temperature 
			+ "F degrees");
	}
}



