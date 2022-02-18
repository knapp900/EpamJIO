package by.home.task_1.service;

import by.home.task_1.service.impl.ServiceLibraryImpl;
import by.home.task_1.service.impl.ServiceUserImpl;

public class ServiceProvider {

	private static final ServiceProvider instance = new ServiceProvider();

	private UserService userService = new ServiceUserImpl();

	private LibraryService libraryService = new ServiceLibraryImpl();

	private ServiceProvider() {

	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public LibraryService getLibraryService() {
		return libraryService;
	}

	public void setLibraryService(LibraryService libraryService) {
		this.libraryService = libraryService;
	}

	public static ServiceProvider getInstance() {
		return instance;
	}
}
