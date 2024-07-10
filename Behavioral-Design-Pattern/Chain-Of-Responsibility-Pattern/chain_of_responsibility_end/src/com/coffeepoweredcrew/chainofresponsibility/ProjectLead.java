package com.coffeepoweredcrew.chainofresponsibility;

//A concrete handler
public class ProjectLead extends Employee{

	public ProjectLead(LeaveApprover successor) {
		super("Project Lead", successor);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		// If leave is of type sick and under 2 days then lean approves it
		if(application.getType() == LeaveApplication.Type.Sick){
			if(application.getNoOfDays() <= 2) {
				application.approve(getApprover());
				return true;
			}
		}
		return false;
	}

}
