package by.home.task_1.dao;

import by.home.task_1.entity.Book;

public interface LibraryDAO {

	String getAllBooks() throws DAOException;

	String getBook(String title) throws DAOException;

	String findByTitle(String title) throws DAOException;

	boolean addBook(Book book) throws DAOException;

	boolean delBook(String title) throws DAOException;
}
