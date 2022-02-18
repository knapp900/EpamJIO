package by.home.task_1.dao;

import by.home.task_1.dao.impl.DAOLibraryImpl;
import by.home.task_1.dao.impl.DAOUserImpl;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	private UserDAO userDAO = new DAOUserImpl();

	private LibraryDAO bookDAO = new DAOLibraryImpl();

	private DAOProvider() {
	}

	public static DAOProvider getInstance() {
		return instance;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public LibraryDAO getBookDAO() {
		return bookDAO;
	}

	public void setBookDAO(LibraryDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

}
