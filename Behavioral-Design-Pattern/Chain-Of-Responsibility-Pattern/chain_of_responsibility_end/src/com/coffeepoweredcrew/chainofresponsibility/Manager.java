package com.coffeepoweredcrew.chainofresponsibility;
//A concrete handler

public class Manager extends Employee {

	public Manager(LeaveApprover nextApprover) {
		super("Manager", nextApprover);
	}
	
	@Override
	protected boolean processRequest(LeaveApplication application) {
		switch (application.getType()) {
			case Sick:
				application.approve(getApprover());
				return true;
			case PTO:
				if(application.getNoOfDays() <= 5) {
					application.approve(getApprover());
					return true;
				}
		}
		return false;
	}
	
}