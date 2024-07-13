package com.coffeepoweredcrew.command;

//A Concrete implementation of Command.
public class AddMemberCommand implements Command{
	
	private String emailAddress;
	private String listName;
	
	private EWSService service;
	
	public AddMemberCommand(String email, String list, EWSService service) {
		this.emailAddress = email;
		this.listName = list;
		this.service = service;
	}

	@Override
	public void execute() {
		service.addMember(emailAddress, listName);
	}
		
}
