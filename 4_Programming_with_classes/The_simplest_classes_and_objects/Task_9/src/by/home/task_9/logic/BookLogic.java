package by.home.task_9.logic;

import by.home.task_9.entity.*;


import java.util.ArrayList;
import java.util.List;

/**
 * Book: id, название, автор(ы), издательство, год издания, количество страниц,
 * цена, тип переплета. Найти и вывести:
 *  a) список книг заданного автора; 
 *  b) список книг, выпущенных заданным издательством; 
 *  c) список книг, выпущенных после заданного года.
 */

public class BookLogic {
	
	/**
	 * Поиск по автору.
	 * @param лист books
	 * @param строка author
	 * @return список книг заданного автора findByAuthorBooks
	 */

	public List<Book> findByAuthor(List<Book> books, String author) {
		List<Book> findByAuthorBooks = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getAuthor().contains(author)) {
				findByAuthorBooks.add(book);

			}

		}

		return findByAuthorBooks;

	}
	
	/**
	 * Поиск по издательству.
	 * @param лист books
	 * @param строка PublishingHouse
	 * @return список книг, выпущенных заданным издательством findByPublishingHouse
	 */
	public List<Book> findByPublishingHouse(List<Book> books, String PublishingHouse) {
		List<Book> findByPublishingHouse = new ArrayList<Book>();
		
		for (Book book : books) {
			if (book.getPublishingHouse().contains(PublishingHouse)) {
				findByPublishingHouse.add(book);
				
			}
			
		}
		
		return findByPublishingHouse;
		
	}
	/**
	 * Поиск книг выпущенных после заданного года. 
	 * @param лист books
	 * @param число year
	 * @return список книг, выпущенных после заданного года.
	 */
	public List<Book> findByYearOfPublishing(List<Book> books, int year) {
		List<Book> findByYearOfPublishing = new ArrayList<Book>();
		
		for (Book book : books) {
			if (book.getYearOfPublishing() > year) {
				findByYearOfPublishing.add(book);
				
			}
			
		}
		
		return findByYearOfPublishing;
		
	}

}
