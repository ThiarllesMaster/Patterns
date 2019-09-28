package creational.singleton;

public class BasicSingleton {
	
	private BasicSingleton() {
		
	}
	
	private static final BasicSingleton INSTANCE = new BasicSingleton();
	
	public static BasicSingleton getInstance() {
		return INSTANCE;
	}

}
