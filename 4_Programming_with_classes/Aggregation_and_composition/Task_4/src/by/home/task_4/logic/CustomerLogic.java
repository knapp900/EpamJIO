package by.home.task_4.logic;

import by.home.task_4.entity.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Счета. Клиент может иметь несколько счетов в банке. 1.Учитывать
 * возможностьблокировки/разблокировки счета. 2.Реализовать поиск и сортировку
 * счетов. 3.Вычисление общей суммы по счетам. 4.Вычисление суммы по всем
 * счетам, имеющим положительный и отрицательный балансы отдельно.
 *
 * @author Knapp Atrhur
 */

public class CustomerLogic {

	public void unblockedAccount(Customer customer) {

		customer.setBlocked(false);

	}

	public void blockAccount(Customer customer) {

		customer.setBlocked(true);

	}

	/**
	 * Поиск по id
	 * 
	 * @param list
	 * @param ID
	 * @return
	 */

	public Customer findCustomers(List<Customer> list, int ID) {
		for (Customer customer2 : list) {
			if (customer2.getID() == ID) {

				return customer2;
			}

		}
		return null;
	}

	/**
	 * Сортировка по id
	 * 
	 * @param list
	 * @return
	 */

	public List<Customer> sortCustomers(List<Customer> list) {
		List<Customer> sortCustomers = new ArrayList<Customer>();

		sortCustomers.addAll(list);
		Collections.sort(sortCustomers, new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {

				return o1.getID() - o2.getID();
			}
		});

		return sortCustomers;

	}

	/**
	 * Вычисление общей суммы по счетам выбранного пользователя.
	 * 
	 * @param customer приходит из метода findCustomers
	 * @return double
	 */

	public double totalAmountCustomer(Customer customer) {
		List<Account> customers = new ArrayList<Account>();
		customers.addAll(customer.getAccounts());
		double totalAmount = 0;
		for (Account account : customers) {
			totalAmount += account.getAmount();
		}

		return totalAmount;
	}

	/**
	 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный
	 * балансы отдельно
	 * 
	 * @param list
	 */

	public void totalAmountAll(List<Customer> list) {
		double positiveAmount = 0;
		double negativeAmount = 0;
		List<Account> accounts = new ArrayList<Account>();
		for (Customer customer : list) {
			accounts.addAll(customer.getAccounts());

		}
		for (Account account : accounts) {
			if (account.getAmount() > 0) {
				positiveAmount += account.getAmount();
			} else {
				negativeAmount += account.getAmount();
			}

		}
		System.out
				.println("Положительный баланс: " + positiveAmount + '\n' + "Oтрицательный баланс: " + negativeAmount);

	}

}
