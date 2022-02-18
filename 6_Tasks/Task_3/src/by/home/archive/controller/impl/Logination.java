package by.home.archive.controller.impl;

import by.home.archive.controller.Command;
import by.home.archive.presentation.UserActionViewer;
import by.home.archive.service.ServiceProvider;

public class Logination implements Command {

	@Override
	public String exequte(String[] params) {

		ServiceProvider provider = ServiceProvider.getInstance();

		String login = params[1].split("=")[1];
		String password = params[2].split("=")[1];

		try {
			
			if(provider.getUserService().logination(login, password)) {
				
				return UserActionViewer.roleAnswer(provider.getUserService().checkRole(login, password));
				
			}
			else {
				
				return UserActionViewer.loginationAnswer(false);
			}
			
		} catch (Exception e) {
			
			System.err.println("Error: " + e);
			
		}

		return null;
	}

}
