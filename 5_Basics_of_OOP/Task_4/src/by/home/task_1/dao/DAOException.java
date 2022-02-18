package by.home.task_1.dao;

public class DAOException extends Exception {

	private static final long serialVersionUID = -2269003827377363635L;

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
