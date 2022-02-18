package by.home.archive.controller.impl;

import by.home.archive.controller.Command;
import by.home.archive.service.ServiceException;
import by.home.archive.service.ServiceProvider;

public class GetAllArchive implements Command {

	@Override
	public String exequte(String[] params) {

		ServiceProvider provider = ServiceProvider.getInstance();

		try {

			return provider.getArchiveService().getAllStudents().toString();

		} catch (ServiceException e) {
			
			System.err.println("Error: " + e);
			
		}
		
		return null;

	}

}
