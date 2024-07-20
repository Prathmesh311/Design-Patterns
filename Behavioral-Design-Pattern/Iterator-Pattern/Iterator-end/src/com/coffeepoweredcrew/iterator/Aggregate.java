package com.coffeepoweredcrew.iterator;


//Aggregate interface
interface Aggregate<T> {
	Iterator<T> createIterator();
}