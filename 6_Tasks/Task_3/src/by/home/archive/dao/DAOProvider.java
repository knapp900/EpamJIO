package by.home.archive.dao;

import by.home.archive.dao.Impl.DAOArchiveImpl;
import by.home.archive.dao.Impl.DAOUserImpl;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	ArchiveDAO archiveDAO = new DAOArchiveImpl();
	UserDAO userDAO = new DAOUserImpl();

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	private DAOProvider() {

	}

	public static DAOProvider getInstance() {
		return instance;
	}

	public ArchiveDAO getArchiveDAO() {
		return archiveDAO;
	}

	public void setArchiveDAO(ArchiveDAO archiveDAO) {
		this.archiveDAO = archiveDAO;
	}

}
