package singletonDemo;

class Singleton{
	// create the private static instance
	private static Singleton singleton_instance = null; 
	
	// create private constructor to prevent external instantiation
	private Singleton() {}
	
	//create a public static method --> this acts as a gateway, providing a global point of access to the Singleton object
	public static Singleton getInstance() {
		
		if(singleton_instance == null) {
			singleton_instance = new Singleton();	
			System.out.println("Singleton instance was created.");
		}
		System.out.println("Singleton instance returned.");
		return singleton_instance;
	}
	
	//create a method for this singleton class
	public void demoMethod() {
		System.out.println("This is my demostration");
	}
}
public class SingletonDemo {
	public static void main(String[] args) {
		//Singleton object01 = new Singleton(); we can't create objects using this way
		
		// creating objects
		Singleton object01 = Singleton.getInstance();
		Singleton object02 = Singleton.getInstance(); // all objects are using same instance.
		Singleton object03 = Singleton.getInstance();
		
		// ensure whether they use same instance
		// the hashCode method returns an integer value that is unique to the object instance in the memory.

		System.out.println(object01.hashCode());
		System.out.println(object02.hashCode());
		System.out.println(object03.hashCode());
	
	}
}
