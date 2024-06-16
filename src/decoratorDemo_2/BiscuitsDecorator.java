package decoratorDemo_2;

public class BiscuitsDecorator extends TeaDecorator {
	public BiscuitsDecorator(Tea decoratedTea) {
        super(decoratedTea);
    }
	
	@Override
    public String getDescription() {
        return decoratedTea.getDescription() + ", Biscuits";
    }

    @Override
    public double getCost() {
        return decoratedTea.getCost() + 30.0;
    }
}
