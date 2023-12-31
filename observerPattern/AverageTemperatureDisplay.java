package observerPattern;

public class AverageTemperatureDisplay implements Observer {

	private double sumOfTemperature, totalTemperatures ; 
	
	public AverageTemperatureDisplay(Observable observable) {
		sumOfTemperature = 0 ; 
		totalTemperatures = 0 ; 
		observable.registerObserver(this); 
	}
	
	@Override
	public void update(double temperature, double humidity) {
		sumOfTemperature += temperature ; 
		totalTemperatures++; 
		display() ; 
	}
	
	public void display() {
		System.out.println("Average temperature for past " + (sumOfTemperature / totalTemperatures) + " is " 
				+ sumOfTemperature);
	}

}
