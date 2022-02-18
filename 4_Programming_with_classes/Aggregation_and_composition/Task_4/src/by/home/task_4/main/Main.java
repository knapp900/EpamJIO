package by.home.task_4.main;

import by.home.task_4.entity.*;
import by.home.task_4.logic.*;
import by.home.task_4.view.*;

import java.util.ArrayList;
import java.util.List;


/**
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
 * Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
 * положительный и отрицательный балансы отдельно.
 *
 * @author Knapp Atrhur
 */

public class Main {

	public static void main(String[] args) {
		CustomerStorage accountStorage = new CustomerStorage();
		CustomerLogic logic = new CustomerLogic();
		View view = new View();

		List<Account> account = new ArrayList<Account>();
		account.add(new Account("Сберегательный счет", 02, 110000.0));
		account.add(new Account("Расчетный счет", 02, 110000.0));
		account.add(new Account("Кредитная линия", 03, -3100.0));

		accountStorage.addUserAccounts(new Customer(false, 1, "John Stark", account));

		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("Сберегательный счет", 03, 10000.0));
		accounts.add(new Account("Расчетный счет", 02, 10000.0));
		accounts.add(new Account("Кредитная линия", 03, -300.0));

		accountStorage.addUserAccounts(new Customer(false, 3, "John Smith", accounts));

		List<Account> account2 = new ArrayList<Account>();
		account2.add(new Account("Сберегательный счет", 04, 9000.0));
		account2.add(new Account("Расчетный счет", 02, 9000.0));
		account2.add(new Account("Кредитная линия", 02, -1200.0));

		accountStorage.addUserAccounts(new Customer(false, 2, "Clark Kent", account2));

		// Поиск по ID
		view.print("Поиск по ID", logic.findCustomers(accountStorage.getUserAccounts(), 2));

		// Сортировка по ID
		view.print("Сортировка по ID \n", logic.sortCustomers(accountStorage.getUserAccounts()));

		// Сумма по всем счетам пользователя
		view.print(
				"Сумма по всем счетам пользователя: \n"
						+ logic.totalAmountCustomer(logic.findCustomers(accountStorage.getUserAccounts(), 2)),
				logic.findCustomers(accountStorage.getUserAccounts(), 2));

		// Блокировать пользователя
		logic.blockAccount(logic.findCustomers(accountStorage.getUserAccounts(), 1));
		// Разблокировать пользователя
		logic.unblockedAccount(logic.findCustomers(accountStorage.getUserAccounts(), 1));

		// Cуммы по всем счетам, имеющим положительный и отрицательный балансы отдельно
		logic.totalAmountAll(accountStorage.getUserAccounts());

	}

}
