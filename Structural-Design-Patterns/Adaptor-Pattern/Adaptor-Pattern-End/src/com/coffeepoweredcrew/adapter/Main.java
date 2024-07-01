package com.coffeepoweredcrew.adapter;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		populateEmployeeData(employee);
		
		EmployeeObjectAdapter adaptor = new EmployeeObjectAdapter(employee);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = designer.designCard(adaptor);
		
		System.out.println(card);
		
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
