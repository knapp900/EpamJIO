package by.home.task_9.main;

import by.home.task_9.entity.*;
import by.home.task_9.logic.*;
import by.home.task_9.view.*;

import java.util.List;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 *метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 *методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 *	Найти и вывести:
 *	a) список книг заданного автора;
 *	b) список книг, выпущенных заданным издательством;
 *	c) список книг, выпущенных после заданного года.
 */

public class Main {
	
	public static void main(String[] args) {
		
		BookStorage bookStorage = new BookStorage();
		BookLogic bookLogic = new BookLogic();
		View view = new View();
		
		bookStorage.addBooks(new Book(1, "Java SE9", "Кей С.Хорстманн", "Диалектика", 2018, 563, 55.00, "мягкий"));
		bookStorage.addBooks(new Book(2, "Философия Java", "Брюс Эккель", "Диалектика", 2016, 503, 55.00, "мягкий"));
		bookStorage.addBooks(new Book(3, "Java from EPAM", "И.Н.Блинов , В.С.Романчик", "Четыре четверти", 2020, 540, 55.00, "мягкий"));
		bookStorage.addBooks(new Book(4, "Java SE9", "Кей С.Хорстманн", "Диалектика", 2014, 500, 55.00, "мягкий"));
		bookStorage.addBooks(new Book(5, "Java SE9", "Кей С.Хорстманн", "Диалектика", 2013, 566, 55.00, "мягкий"));
		bookStorage.addBooks(new Book(6, "Java SE9", "Кей С.Хорстманн", "Диалектика", 2017, 560, 55.00, "мягкий"));
		
		//Вызов поиска по автору.
		List<Book> findByAuthorBooks;
		findByAuthorBooks = bookLogic.findByAuthor(bookStorage.getBooks(), "Эккель");
		view.print(findByAuthorBooks);
		
		//Вызов поиска по издательству.
		List<Book> findByPublishingHouse;
		findByPublishingHouse = bookLogic.findByPublishingHouse(bookStorage.getBooks(), "Четыре четверти");
		view.print(findByPublishingHouse);
		
		//Вызов поиска книг выпущенных после заданного года
		List<Book> findByYearOfPublishing;
		findByYearOfPublishing = bookLogic.findByYearOfPublishing(bookStorage.getBooks(), 2014);
		view.print(findByYearOfPublishing);
		
	}

}
