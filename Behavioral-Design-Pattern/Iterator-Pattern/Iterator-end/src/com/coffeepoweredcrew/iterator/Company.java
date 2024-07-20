package com.coffeepoweredcrew.iterator;

import java.util.List;

//Concrete Aggregate
class Company implements Aggregate<Employee> {
	 private List<Employee> employees;
	
	 public Company(List<Employee> employees) {
	     this.employees = employees;
	 }
	
	 @Override
	 public Iterator<Employee> createIterator() {
	     return new EmployeeIterator(employees);
	 }
}
