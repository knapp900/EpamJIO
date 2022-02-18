package by.home.task_5.dao;

public class DAOException extends Exception {

	private static final long serialVersionUID = 8031354946392017332L;

	public DAOException() {
		super();
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Exception e) { 
		super(e);
	}

	public DAOException(String message, Exception e) { 
		super(message, e);
	}


}
