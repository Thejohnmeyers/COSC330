package WeatherData;

import java.util.Observable;
import java.util.Observer;
	//John Meyers
//current conditions implmentation of observer
@SuppressWarnings("deprecation")
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object arg) {
		if (obs instanceof Weather) {
			Weather weatherData = (Weather)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
