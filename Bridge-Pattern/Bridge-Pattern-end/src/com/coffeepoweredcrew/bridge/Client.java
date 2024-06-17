package com.coffeepoweredcrew.bridge;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<Integer>(new SinglyLinkedList());
		
		collection.offer(10);
		collection.offer(23);
		collection.offer(105);
		
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
	}

}
