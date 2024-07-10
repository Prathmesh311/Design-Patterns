package com.coffeepoweredcrew.chainofresponsibility;

import java.time.LocalDate;

import com.coffeepoweredcrew.chainofresponsibility.LeaveApplication.Type;

public class Client {

	public static void main(String[] args) {
	   LeaveApplication application = LeaveApplication.getBuilder().
			   							withType(Type.PTO).
			   							from(LocalDate.of(2024, 06, 2)).
			   							to(LocalDate.now()).build();
	   
	   
	   System.out.println(application);
	   System.out.println("-------------------------");
	   
	   LeaveApprover approver = createChain();
	   approver.processLeaveApplication(application);
	   System.out.println(application);
	   
	}
	
	private static LeaveApprover createChain() {
		Employee director = new Director(null);
		Employee manager = new Manager(director);
		Employee lead = new ProjectLead(manager);
		
		return lead;
	}

	
}
