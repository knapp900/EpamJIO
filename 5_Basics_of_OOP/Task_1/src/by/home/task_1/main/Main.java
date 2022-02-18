package by.home.task_1.main;

import by.home.task_1.logic.TextFile;
import java.io.IOException;
import java.util.Scanner;

/**
 * Задача  1. Создать объект класса Текстовый файл, используя классы Файл,
 * Директория. Методы: создать, переименовать, вывести на консоль содержимое,
 * дополнить, удалить.
 * 
 * @author Knapp Arthur
 *
 */

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		TextFile textFile = new TextFile();
		boolean flag = true;

		while (flag) {

			System.out.println("1: Создать файл" + '\n' + "2: Переименовать Файл" + '\n'
					+ "3: Вывести на консоль содержимое" + '\n' + "4: Дополнить контент файла" + '\n'
					+ "5: Удалить содержимое файла" + '\n' + "6: Удалить файл" + '\n' +  "0: Закончить" + '\n');

			int key = scanner.nextInt();
			switch (key) {
			case (1):
				System.out.println("Введите название файла ");
				String name = scanner.next();
				System.out.println("Введите директорию файла ");
				String dir = scanner.next();
				textFile.setDir(dir);
				textFile.setFileName(name);
				textFile.create();

				break;

			case (2):
				System.out.println("Введите новое название файла ");
				String newName = scanner.next();
				textFile.rename(newName);

				break;

			case (3):

				try {
					textFile.print();
				} catch (IOException e) {

					e.printStackTrace();
				}

				break;

			case (4):

				System.out.println("Дополните контент");
				String content = scanner.next();
				textFile.fill(content);

				break;

			case (5):
				textFile.del();

				break;

			case (6):
				textFile.delFile();
			
			break;
			
			case (0):
				flag = false;
				break;

			default:
				System.out.println("Введите правельный номер!");
				break;
			}

		}
		scanner.close();

	}
}