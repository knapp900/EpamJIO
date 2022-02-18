package by.home.task_8.main;

import by.home.task_8.entity.*;
import by.home.task_8.logic.*;
import by.home.task_8.view.*;


import java.util.List;

/**
 *	Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 *и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 *и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * 		Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * 		Найти и вывести:
 * 		a) список покупателей в алфавитном порядке;
 *		b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 *
 *  @author Knapp Arthur
 */

public class Main {
	public static void main(String[] args) {
		
		CustomerLogic customerLogic = new CustomerLogic();
		CustomerStorage customerStorage = new CustomerStorage();
		CustomerView customerView = new CustomerView();
		
		customerStorage.addCustomers(new Customer("3", "Ivaniv", "Ivan", "Ivanovich", "Moskow",45691111,"BY20 OLMP 3135 0000 0010 0000 5933"));
		customerStorage.addCustomers(new Customer("2", "Petrov", "Petr", "Petrovich", "Minsk", 45698161, "BY20 OLMP 3135 0000 0010 0000 2933"));
		customerStorage.addCustomers(new Customer("1", "Sidorov", "Sidr", "Sidorovich", "Tokio",45695111, "BY20 OLMP 3135 0000 0010 0000 1933"));
		//Вызов сортировки по алфавиту.
		List<Customer> getListCustomer;
		getListCustomer = customerLogic.sortCustomersByName(customerStorage.getCustomers());
		customerView.print("Cписок покупателей в алфавитном порядке \n", getListCustomer);
		//Вызов поиска по диапазону карт
		List<Customer> findByCreditCardCustomers;
		findByCreditCardCustomers = customerLogic.findByCreditCard(customerStorage.getCustomers(), 0,45698111);
		customerView.print("Cписок покупателей, у которых номер кредитной карточки находится в заданном интервале \n", findByCreditCardCustomers);
	}

}
