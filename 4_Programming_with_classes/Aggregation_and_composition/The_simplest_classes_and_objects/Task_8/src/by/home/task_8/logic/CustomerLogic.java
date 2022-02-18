package by.home.task_8.logic;

import by.home.task_8.entity.*;


/**
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerLogic {

	/**
	 * Сортирует по алфавиту имена пользователей.
	 * 
	 * @param customers
	 * @return sortCustomer
	 */
	public List<Customer> sortCustomersByName(List<Customer> customers) {
		List<Customer> sortCustomers = new ArrayList<Customer>();
		sortCustomers.addAll(customers);

		Collections.sort(sortCustomers, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {

				return (o1.getFirstName().compareTo(o2.getFirstName()));
			}
		});

		return sortCustomers;
	}

	/**
	 * Ищет в customers совпадние в заданном min Range и max Range диапазоне и
	 * складывает их лист findByCreditCard.
	 * 
	 * @param customers
	 * @param minRange
	 * @param maxRange
	 * @return findByCreditCard
	 */
	public List<Customer> findByCreditCard(List<Customer> customers, long minRange, long maxRange) {
		List<Customer> findByCreditCard = new ArrayList<Customer>();
		for (Customer customerString : customers) {
			if (customerString.getCreditCardNumber() >= minRange && customerString.getCreditCardNumber() <= maxRange) {
				findByCreditCard.add(customerString);

			}

		}

		return findByCreditCard;

	}

}
