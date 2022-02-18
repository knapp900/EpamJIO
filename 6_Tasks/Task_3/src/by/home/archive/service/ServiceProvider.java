package by.home.archive.service;

import by.home.archive.service.impl.ServiceArchiveImpl;
import by.home.archive.service.impl.ServiceUserImple;

public class ServiceProvider {

	private final static ServiceProvider instance = new ServiceProvider();

	ArchiveService archiveService = new ServiceArchiveImpl();
	UserService userService = new ServiceUserImple();

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private ServiceProvider() {

	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public ArchiveService getArchiveService() {
		return archiveService;
	}

	public void setArchiveService(ArchiveService archiveService) {
		this.archiveService = archiveService;
	}

}
