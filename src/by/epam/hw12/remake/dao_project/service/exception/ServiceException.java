package by.epam.hw12.remake.dao_project.service.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -7795023076747315973L;

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
