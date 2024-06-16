package decoratorDemo_2;

public class PlainTea implements Tea {

	@Override
	public String getDescription() {
		return "Plain Tea";
	}

	@Override
	public double getCost() {
		return 10.0;
	}

}
