package observerPattern;

import java.util.*;

public class WeatherStation implements Observable {

	private List<Observer> observerList ; 
	private double temperature ; 
	private double humidity ; 
	
	public WeatherStation() {
		this.observerList = new ArrayList<>() ; 
	}
	
	private boolean hasObserver(Observer observer) {
		int index = observerList.indexOf(observer); 
		return index >= 0 ; 
	}
	
	@Override
	public void registerObserver(Observer observer) {
		if(!hasObserver(observer)) {
			observerList.add(observer) ; 
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if(hasObserver(observer)) {
			observerList.remove(observerList.indexOf(observer)) ; 
		}
	}

	@Override
	public void notifyObserver() {
		observerList.forEach(observer -> observer.update(temperature, humidity)); 
	}
	
	public void changeParameters(double temperature, double humidity) {
		this.temperature = temperature ; 
		this.humidity = humidity ; 
		notifyObserver() ; 
	}

}
