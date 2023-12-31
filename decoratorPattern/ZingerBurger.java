package decoratorPattern;

public class ZingerBurger extends Burger {

	@Override
	public double getCost() {
		return 180.0;
	}

	@Override
	public String getDescription() {
		return "Zinger Burger" ; 
	}
	
}
