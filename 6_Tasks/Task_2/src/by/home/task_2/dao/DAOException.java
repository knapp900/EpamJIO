package by.home.task_2.dao;

public class DAOException extends Exception {

	private static final long serialVersionUID = 7559397977059900172L;

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
