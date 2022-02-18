package by.home.task_9.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Book: id, название, автор(ы), издательство, год издания, количество страниц,
 * цена, тип переплета. Найти и вывести: a) список книг заданного автора; b)
 * список книг, выпущенных заданным издательством; c) список книг, выпущенных
 * после заданного года.
 */

public class BookStorage {

	private List<Book> books = new ArrayList<Book>();

	public BookStorage() {

	}

	public List<Book> getBooks() {
		return books;
	}

	public void addBooks(Book book) {
		books.add(book);
	}

	@Override
	public int hashCode() {
		return Objects.hash(books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookStorage other = (BookStorage) obj;
		return Objects.equals(books, other.books);
	}

	@Override
	public String toString() {
		return "BookStorage [books=" + books + "]";
	}

}
