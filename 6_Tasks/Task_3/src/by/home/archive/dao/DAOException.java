package by.home.archive.dao;

public class DAOException extends Exception {
	
	private static final long serialVersionUID = 543430074122940622L;

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
