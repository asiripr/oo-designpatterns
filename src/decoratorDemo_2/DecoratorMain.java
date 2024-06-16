package decoratorDemo_2;
//step 1 : create component interface  --> Tea.java
//step 2 : create concrete classes implementing the same interface --> PlainTea.java
//step 3 : create an abstract decorator class implementing the above same interface --> TeaDecorator.java
//step 4 : create concrete decorator class extending the above abstract decorator class --> MilkDecoratorr.java
//step 5 : now use the concrete decorator class created above to decorate interface objects --> BiscuitsDecorator.java
//step 6 : complete the main class to demonstrate the pattern --> this file

public class DecoratorMain {

	public static void main(String[] args) {
		// Plain Tea
        Tea Tea = new PlainTea();
        System.out.println("Description: " + Tea.getDescription());
        System.out.println("Cost: Rs" + Tea.getCost());

        // Tea with Milk
        Tea milkTea = new MilkDecorator(new PlainTea());
        System.out.println("\nDescription: " + milkTea.getDescription());
        System.out.println("Cost: Rs" + milkTea.getCost());

        // Tea with Biscuits and Milk
        Tea biscuitsMilkTea = new BiscuitsDecorator(new MilkDecorator(new PlainTea()));
        System.out.println("\nDescription: " + biscuitsMilkTea.getDescription());
        System.out.println("Cost: Rs" + biscuitsMilkTea.getCost());
	}

}
