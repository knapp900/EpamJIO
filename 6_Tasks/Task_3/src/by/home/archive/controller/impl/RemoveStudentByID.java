package by.home.archive.controller.impl;

import by.home.archive.controller.Command;
import by.home.archive.service.ServiceException;
import by.home.archive.service.ServiceProvider;

public class RemoveStudentByID implements Command {

	@Override
	public String exequte(String[] params) {

		ServiceProvider provider = ServiceProvider.getInstance();

		String ID = params[1];

		try {

			provider.getArchiveService().delStudent(ID);

			return "Дело удаленно.";

		} catch (ServiceException e) {
			
			System.err.println("Что-то пошло не так!" + e);
		}

		return "Что-то пошло не так!";
	}

}
