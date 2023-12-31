package observerPattern;

public class CurrentWeatherDisplay implements Observer {

	private double temperature, humidity ; 
	
	public CurrentWeatherDisplay(Observable observable) {
		observable.registerObserver(this);
	}
	
	@Override
	public void update(double temperature, double humidity) {
		this.temperature = temperature ; 
		this.humidity = humidity ; 
		display() ; 
	}
	
	public void display() {
		System.out.println("Current weather condition => Temperature : " + temperature + 
				"humidity : " + humidity);
	}

}
