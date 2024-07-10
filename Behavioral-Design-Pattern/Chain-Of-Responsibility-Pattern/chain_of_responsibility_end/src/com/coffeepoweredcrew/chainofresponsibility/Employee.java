package com.coffeepoweredcrew.chainofresponsibility;

//Abstract handler
public  abstract class Employee implements LeaveApprover{
	
	private String type;
	
	private LeaveApprover successor;
	
	public Employee(String type, LeaveApprover successor) {
		this.type = type;
		this.successor = successor;
	}

	@Override
	public void processLeaveApplication(LeaveApplication application) {
		if(!processRequest(application) && successor != null) {
			successor.processLeaveApplication(application);
		}
	}
	
	protected abstract boolean processRequest(LeaveApplication application);

	@Override
	public String getApprover() {
		return this.type;
	}

}