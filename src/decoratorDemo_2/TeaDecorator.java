package decoratorDemo_2;

public abstract class TeaDecorator implements Tea {
	protected Tea decoratedTea;
	
	public TeaDecorator(Tea deacoratedTea) {
		this.decoratedTea = deacoratedTea;
	}
	
	@Override
	public String getDescription() {
		return decoratedTea.getDescription();
	}

	@Override
	public double getCost() {
		return decoratedTea.getCost();
	}

}
