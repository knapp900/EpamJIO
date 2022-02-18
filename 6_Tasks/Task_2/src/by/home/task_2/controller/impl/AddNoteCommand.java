package by.home.task_2.controller.impl;

import by.home.task_2.controller.Command;
import by.home.task_2.presentation.View;
import by.home.task_2.service.ServiceException;
import by.home.task_2.service.ServiceProvider;

public class AddNoteCommand implements Command {

	@Override
	public String execute(String[] params) {

		ServiceProvider provider = ServiceProvider.getInstance();
		View view = new View();

		String topic, email, text;
		topic = params[1].split("=")[1];
		email = params[2].split("=")[1];
		text = params[3].split("=")[1];

		if (email.matches("(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)?")) {

			try {
				
				provider.getNoteService().addNote(topic, email, text);
				
				return view.addNoteView("1");

			} catch (ServiceException e) {

				view.print(e);
			}

		}
		return view.addNoteView("2");

	}

}
