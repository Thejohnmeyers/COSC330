package WeatherData;
import java.util.Observable;
import java.util.Observer;
//John Meyers
@SuppressWarnings("deprecation")
public class Weather extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public Weather() { }
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}//notifying the observers and displaying through the observers
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();//calling the observers after setting the new parameters
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}

