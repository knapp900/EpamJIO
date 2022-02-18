package by.home.task_2.menu;

import java.io.IOException;
import java.util.Scanner;

import by.home.task_2.controller.Controller;
import by.home.task_2.controller.impl.NotepadController;

public class Menu {

	Scanner scanner = new Scanner(System.in);

	private void print(String response) {

		System.out.println(response);

	}

	public void startMenu() throws IOException {

		Controller controller = new NotepadController();

		boolean flag = true;

		while (flag) {

			print("""
					Блокнот:
					1.Показать заметки
					2.Добавить заметку
					Поиск по:
					3.Теме
					4.Email
					5.Дате
					6.Тексту
					7.Выход
					""");

			switch (scanner.nextInt()) {

			case 1 -> print(controller.doAction("[getNotepad]"));

			case 2 -> {

				String request = addNote();

				if (request != null) {

					print(controller.doAction(request));

				} else {

					print("Не все поля заполненны!");
				}

			}
			case 3 -> {
				print("Введите тему для поиска:");
				print(controller.doAction("[topicSearch][topic=" + scanner.nextLine() + "]"));
			}
			case 4 -> {
				print("Введите адрес электронной почты для поиска:");
				print(controller.doAction("[emailSearch][email=" + scanner.nextLine() + "]"));
			}
			case 5 -> {
				print("Введите дату для поиска:");
				print(controller.doAction("[dateSearch][date=" + scanner.nextLine() + "]"));
			}
			case 6 -> {
				print("Введите текст для поиска:");
				print(controller.doAction("[textSearch][text=" + scanner.nextLine() + "]"));
			}
			case 7 -> System.exit(0);

			default -> print("Введено неверное значение");

			}
			print("press Enter to continue");
			scanner.nextLine();
		}
	}

	private String addNote() {

		String request, topic, email, text;

		scanner.nextLine();
		print("Введите тему:");
		topic = scanner.nextLine();

		print("Введите адрес электронной почты:");
		email = scanner.nextLine();

		print("Введите текст заметки:");
		text = scanner.nextLine();

		if (!topic.isEmpty() & !email.isEmpty() & !text.isEmpty()) {

			request = "[addNote][topic=" + topic + "][email=" + email + "][text=" + text + "]";

			return request;
		}

		return null;

	}

}
