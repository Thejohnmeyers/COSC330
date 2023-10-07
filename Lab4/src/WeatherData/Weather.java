package WeatherData;
import java.util.Observable;
import java.util.Observer;
	
@SuppressWarnings("deprecation")
public class Weather extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public Weather() { }
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
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

