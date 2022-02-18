package by.home.task_1.service;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -1518829303545166885L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Exception e) {
		super(e);
	}

	public ServiceException(String message, Exception e) {
		super(message, e);
	}

}
