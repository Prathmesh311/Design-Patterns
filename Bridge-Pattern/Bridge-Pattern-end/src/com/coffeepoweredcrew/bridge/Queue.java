package com.coffeepoweredcrew.bridge;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T>{
	
	private LinkedList list;
	
	public Queue(LinkedList<T> list) {
		this.list = list;
	}

	@Override
	public void offer(T element) {
		list.addLast(element);
		
	}

	@Override
	public T poll() {
		return (T) list.removeFirst();
	}
	
	
}
