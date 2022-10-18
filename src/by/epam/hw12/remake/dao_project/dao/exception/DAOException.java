package by.epam.hw12.remake.dao_project.dao.exception;

public class DAOException extends Exception {

	private static final long serialVersionUID = 1979972122353974265L;

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
