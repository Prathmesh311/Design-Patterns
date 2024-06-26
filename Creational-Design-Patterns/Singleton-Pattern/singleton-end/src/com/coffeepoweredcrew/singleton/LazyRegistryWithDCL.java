package com.coffeepoweredcrew.singleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazyRegistryWithDCL {
	
	private LazyRegistryWithDCL() {
		
	}
	
	private static volatile LazyRegistryWithDCL Instance;
	
	public static LazyRegistryWithDCL getInstance() {
		
		if(Instance == null) {
			synchronized (LazyRegistryWithDCL.class) {
				if(Instance == null) {
					Instance = new LazyRegistryWithDCL();
				}
			}
		}
		
		
		return Instance;
	}

 
}
