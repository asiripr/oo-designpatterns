package templateDemo;

public abstract class Beverage {
	
	// this is template method
	final void prepareRecipe() { // declared as final to prevent subclasses from changing the algorithm’s structure.
		// concrete methods that are common to all subclasses
		boilWater(); 
		pourInCup();
		
		// abstract methods subclasses can override
		brew();
		addCondiments();
	}
	
	void boilWater() {
		System.out.println("Boiling Water");
	}
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	abstract void brew();
	abstract void addCondiments();

}
