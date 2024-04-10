package com.coffeepoweredcrew.singleton;

public class Client {

	public static void main(String[] args) {
		EagerRegistry eagerInstance1 = EagerRegistry.getInstance();
		EagerRegistry eagerInstance2 = EagerRegistry.getInstance();
		
		System.out.println(eagerInstance1 == eagerInstance2);
		
		
		LazyRegistryWithDCL lazyInstance1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazyInstance2 = LazyRegistryWithDCL.getInstance();
		System.out.println(lazyInstance1 == lazyInstance2);

	}

}
