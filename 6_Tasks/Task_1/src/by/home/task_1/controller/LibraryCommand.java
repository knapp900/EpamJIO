package by.home.task_1.controller;

import by.home.task_1.service.ServiceException;
import by.home.task_1.service.ServiceProvider;

/**
 * Класс для связи с сервис-классом библиотеки
 * 
 * @author Arthur Knapp
 *
 */

public class LibraryCommand {

	ServiceProvider provider = ServiceProvider.getInstance();

	public String getBooks() {

		try {

			return provider.getLibraryService().getBooks();

		} catch (ServiceException e) {

			System.err.print(e);
		}

		return null;
	}

	String findByTitle(String title) {

		try {

			return provider.getLibraryService().findByTitle(title);

		} catch (ServiceException e) {

			System.err.print(e);

		}

		return null;
	}

	public boolean addBook(String title, String description, boolean eBook) {

		try {

			return provider.getLibraryService().addBook(title,description,eBook);

		} catch (ServiceException e) {

			System.err.print(e);

		}

		return false;
	}

	public boolean offerBook(String title, String description) {

		try {

			return provider.getLibraryService().offerBook(title, description);

		} catch (ServiceException e) {

			System.err.print(e);
		}

		return false;
	}
	
	public boolean delBook(String title) {
		
		try {
			
			return provider.getLibraryService().delBook(title);
			
		} catch (ServiceException e) {
			
			System.err.println(e);
		}
		return false;
	}

}
