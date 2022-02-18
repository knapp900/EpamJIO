package by.home.task_2.controller.impl;

import by.home.task_2.controller.Command;
import by.home.task_2.presentation.View;
import by.home.task_2.service.ServiceException;
import by.home.task_2.service.ServiceProvider;

public class GetNotesByEmail implements Command {

	@Override
	public String execute(String[] params) {
		
		ServiceProvider provider = ServiceProvider.getInstance();
		View view = new View();
		
		String email = params[1].split("=")[1];
		
		try {
			
			return view.print(provider.getNoteService().findByEmail(email));
			
		} catch (ServiceException e) {
			
			view.print(e);
		}
		
		return "Ничего не найдено!";
	}

}
