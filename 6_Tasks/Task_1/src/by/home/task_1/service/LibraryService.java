package by.home.task_1.service;

public interface LibraryService {

	String getBooks() throws ServiceException;

	boolean addBook(String book,String description, boolean eBook) throws ServiceException;

	boolean delBook(String book) throws ServiceException;
	
	String findByTitle(String title) throws ServiceException;
	
	boolean offerBook(String title, String description) throws ServiceException;

}
