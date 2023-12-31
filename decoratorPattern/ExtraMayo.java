package decoratorPattern;

public class ExtraMayo extends BurgerDecorator {

	public Burger burger ; 
	
	public ExtraMayo(Burger burger) {
		this.burger = burger ; 
	}
	
	@Override
	public double getCost() {
		return burger.getCost() + 30.0 ; 
	}

	@Override
	public String getDescription() {
		return burger.getDescription() + " with extra mayoneese " ; 
	}

}
