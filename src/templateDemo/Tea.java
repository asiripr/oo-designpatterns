package templateDemo;

public class Tea extends Beverage {
	
	//provide concrete implementations for the abstract methods
	@Override
	void brew() {
		System.out.println("Steeping the tea");

	}

	@Override
	void addCondiments() {
		System.out.println("Adding Nestomolt");

	}

}
