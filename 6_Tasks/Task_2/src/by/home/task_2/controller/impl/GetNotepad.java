package by.home.task_2.controller.impl;

import by.home.task_2.controller.Command;
import by.home.task_2.presentation.View;
import by.home.task_2.service.ServiceException;
import by.home.task_2.service.ServiceProvider;

public class GetNotepad implements Command{

	@Override
	public String execute(String[] params) {
		
		ServiceProvider provider = ServiceProvider.getInstance();
		View view = new View(); 		
		try {
			
			return view.print(provider.getNoteService().getNotepad());
			
		} catch (ServiceException e) {
			
			System.err.println(e);
		}
		
		return "У вас нет заметок!";
	}
	
	

}
