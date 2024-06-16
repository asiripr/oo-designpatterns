package templateDemo;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		Beverage tea = new Tea();
		System.out.println("Making tea...");
		tea.prepareRecipe();
		
		System.out.println("----------------");
		
		Beverage coffee = new Coffee();
		System.out.println("Making coffee...");
		coffee.prepareRecipe();
	}
}
