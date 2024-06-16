package templateDemo;

public class Coffee extends Beverage {
	
	//provide concrete implementations for the abstract methods
	@Override
	void brew() {
		System.out.println("Dripping coffee through filter");

	}

	@Override
	void addCondiments() {
		System.out.println("Adding Milk");

	}

}
