package by.home.task_1.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import by.home.task_1.entity.Role;
import by.home.task_1.service.ServiceException;

public class MenuController {

	public void entry() throws IOException, ServiceException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		

		UserCommand userCommand = new UserCommand();
		LibraryCommand libraryCommand = new LibraryCommand();

		System.out.println("Введите логин:");
//		String login = reader.readLine();
		String login = "Admin";
//		String login = "User";
		System.out.println("Введите пароль:");
//		String password = reader.readLine();
		String password = "Admin";
//		String password = "User";

		boolean flag = true;

		if (userCommand.checkUser(login, password) == true) {
			if (userCommand.checkRole(login).getRole().equals(Role.ADMIN)) {

				while (flag) {

					System.out.println(
							"Здравствуйте " + login + " вы " + userCommand.checkRole(login).getRole().toString()
									+ "\n\n0.Добавить пользователя" + '\n' + "1.Смотреть книги\n" + "2.Найти книгу\n"
									+ "3.Добавить книгу\n" + "4.Удалить книгу\n" + "9.Выход\n");

					String key = reader.readLine();
					String title;

					switch (key) {

					case "0":
						System.out.println("Введите логин:");
						String newLogin = reader.readLine();
						System.out.println("Введите пароль:");
						String newPassword = reader.readLine();
						System.out.println("Введите Email:");
						String email = reader.readLine();
						System.out.println("Введите роль:\n" + "1.Администратор\n" + "2.Пользователь\n");
						String roleString = reader.readLine();
						Role newRole = null;

						switch (roleString) {
						case "1":
							newRole = Role.ADMIN;
							break;
						case "2":
							newRole = Role.USER;
							break;
						}

						System.out.println(userCommand.addUser(newLogin, newPassword, email, newRole));

						break;

					case "1":

						System.out.println(libraryCommand.getBooks());

						break;
					case "2":

						System.out.println("Введите название книги для поиска.");
						title = reader.readLine();
						System.out.println(libraryCommand.findByTitle(title));

						break;
					case "3":
						System.out.println("Введите название книги: ");
						title = reader.readLine();
						System.out.println("Введите описаниe: ");
						String description = reader.readLine();
						System.out.println("Это электронная книга?: \n" + "1.Да.\n" + "2.Нет.\n");

						boolean eBook = false;

						String key2 = reader.readLine();

						switch (key2) {
						case "1":

							eBook = true;

							if (libraryCommand.addBook(title, description, eBook)) {

								System.out.println("Книга успешно добавлена\n");

							} else {
								System.out.println("Книга не добавлена!\n");
							}

							break;
						case "2":

							eBook = false;

							if (libraryCommand.addBook(title, description, eBook)) {

								System.out.println("Книга успешно добавлена\n");

							} else {
								System.out.println("Книга не добавлена!\n");
							}

							break;

						}

						break;
					case "4":

						System.out.println("Введите название книги для удаления.\n");
						title = reader.readLine();

						System.out.println(libraryCommand.delBook(title));

						break;

					case "9":

						flag = false;

						break;

					}
				}

			}

			else if (userCommand.checkRole(login).getRole().equals(Role.USER)) {

				while (flag) {

					System.out.println(
							"Здравствуйте " + login + " вы " + userCommand.checkRole(login).getRole().toString() + '\n'
									+ "1.Смотреть книги\n" + "2.Найти книгу\n" + "3.Предложить книгу\n" + "9.Выход\n");

					String key = reader.readLine();
					String title;

					switch (key) {

					case "1":

						System.out.println(libraryCommand.getBooks());

						break;
					case "2":

						System.out.println("Введите название книги для поиска.");
						title = reader.readLine();
						System.out.println(libraryCommand.findByTitle(title));

						break;
					case "3":
						System.out.println("Введите название книги: ");
						title = reader.readLine();
						System.out.println("Введите описаниe: ");
						String description = reader.readLine();

						libraryCommand.offerBook(title, description);

						break;
					case "9":

						flag = false;

						break;

					}
				}
			}

		} else {
			System.out.println("Вы не зарегистрированы");
		}
	}
}
