package WeatherData;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
