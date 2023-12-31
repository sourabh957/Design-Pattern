package observerPattern;

public class Driver {
	
	private static void delay() {
		try {
			Thread.sleep(1000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		WeatherStation weatherStation = new WeatherStation() ; 
		
		CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay(weatherStation) ; 
		
		AverageTemperatureDisplay averageTemperatureDisplay = new AverageTemperatureDisplay(weatherStation) ; 
		
		weatherStation.changeParameters(20, 10);
		
		delay() ; 
		
		weatherStation.changeParameters(10, 30);
		
		delay() ; 
		
		weatherStation.changeParameters(50, 60); 
		
	}
	
}
