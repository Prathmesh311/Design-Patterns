package com.coffeepoweredcrew.command;

public class RemoveMemberCommand implements Command{
	
	private String email;
	private String list;
	
	private EWSService service;
	
	public RemoveMemberCommand(String email, String list, EWSService service) {
		this.email = email;
		this.list = list;
		this.service = service;
	}

	@Override
	public void execute() {
		service.removeMember(email, list);
		
	}

}
