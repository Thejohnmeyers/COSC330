package WeatherData;

import java.util.Observable;
import java.util.Observer;
//John Meyers
//Stats implementation for the observer
@SuppressWarnings("deprecation")
public class StatisticDisplay implements Observer, DisplayElement {
			Observable observable;
			private float temperature;
			private float humidity;
			private float pressure;
			
			public StatisticDisplay(Observable observable) {
				this.observable = observable;
				observable.addObserver(this);
			}
			
			public void update(Observable obs, Object arg) {
				if (obs instanceof Weather) {
					Weather weatherData = (Weather)obs;
					this.temperature = weatherData.getTemperature();
					this.humidity = weatherData.getHumidity();
					this.pressure = weatherData.getPressure();
					display();
				}
			}
			
			public void display() {
				System.out.println("Statistics: " + temperature 
					+ "F degrees and " + humidity + "% humidity " + pressure + " pressure");
			}
		}
