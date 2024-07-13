package com.coffeepoweredcrew.command;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();
		
		Command c1 = new AddMemberCommand("noreply@gmail.com", "spam", service);
		MailTasksRunner.getInstance().addCommand(c1);
		
		Command c2 = new AddMemberCommand("ad@gmail.com", "spam", service);
		MailTasksRunner.getInstance().addCommand(c2);
		
		Command c3 = new RemoveMemberCommand("noreply@gmail.com", "spam", service);
		MailTasksRunner.getInstance().addCommand(c3);
		
		Thread.sleep(3000);
		MailTasksRunner.getInstance().shutdown();
	}

}
