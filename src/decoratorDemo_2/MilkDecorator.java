package decoratorDemo_2;

public class MilkDecorator extends TeaDecorator {
	public MilkDecorator(Tea decoratedTea) {
		super(decoratedTea);
	}
	
	@Override
    public String getDescription() {
        return decoratedTea.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedTea.getCost() + 80.0;
    }
	
}
