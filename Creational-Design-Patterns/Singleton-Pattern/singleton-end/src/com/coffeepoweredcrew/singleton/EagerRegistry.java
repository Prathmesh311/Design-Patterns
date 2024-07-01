package com.coffeepoweredcrew.singleton;
/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {
	
	private EagerRegistry() {
		
	}
	
	private static final EagerRegistry Instance = new EagerRegistry();
	
	public static EagerRegistry getInstance() {
		return Instance;
	}

}