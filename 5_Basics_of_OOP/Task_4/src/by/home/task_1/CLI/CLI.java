package by.home.task_1.CLI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import by.home.task_1.controller.impl.TreasureControllerImpl;

public class CLI {
	TreasureControllerImpl controller = new TreasureControllerImpl();

	public void start() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int request;
		boolean flag = false;

		while (!flag) {

			System.out.println("Меню:\n" + "0.Выход.\n" + "1.Вывести в кансоль все сакровища.\n"
					+ "2.Вывести на кансоль самого дорогого по стоимости сокровища.\n"
					+ "3.Выбора сокровищ на заданную сумму.\n");

			String key = reader.readLine();

			switch (key) {
			case "1":
				request = Integer.parseInt(key);
				System.out.println(controller.doAction(request));
				;
				break;
			case "2":
				request = Integer.parseInt(key);
				System.out.println(controller.doAction(request));

				break;
			case "3":
				System.out.println("Введите значение: ");
				double amount = Double.parseDouble(reader.readLine());
				request = Integer.parseInt(key);
				System.out.println(controller.doAction(request, amount));

				break;

			case "0":
				request = Integer.parseInt(key);
				if (request == 0) {
					flag = true;
				}

				break;

			}
		}

	}

}
