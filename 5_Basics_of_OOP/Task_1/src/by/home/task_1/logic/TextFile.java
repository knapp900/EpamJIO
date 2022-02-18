package by.home.task_1.logic;

import by.home.task_1.entity.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Задача  1. Создать объект класса Текстовый файл, используя классы Файл,
 * Директория. Методы: создать, переименовать, вывести на консоль содержимое,
 * дополнить, удалить.
 * 
 * @author Knapp Arthur
 *
 */

public class TextFile extends File {

	/**
	 * Метод создает файл.
	 */
	public void create() {
		Path path = Paths.get(getDir() + getFileName());
		boolean flag = Files.notExists(path);
		if (flag) {
			try {
				Path p = Files.createFile(path);
				System.out.println("Файл создан: " + p + '\n');

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Файл с таким именем уже существует: " + path + '\n');
		}
	}

	/**
	 * Метод переименовывает файл.
	 * 
	 * @param newName
	 */
	public void rename(String newName) {
		Path path = Paths.get(getDir() + getFileName());
		if (getDir() != null) {

			try {
				setFileName(newName);
				Files.move(path, path.resolveSibling(newName));
				System.out.println("Файл переименован: " + getFileName() + '\n');
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Файл еще не создан!" + '\n');
		}

	}

	/**
	 * Метод выводит на консоль содержимое файла.
	 * 
	 * @throws IOException
	 */
	public void print() throws IOException {
		Path path = Paths.get(getDir() + getFileName());
		if (!Files.readString(path).isEmpty()) {
			try {
				String content = Files.readString(path);
				System.out.println("Содержимое файла " + getFileName() + ": " + content);

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Файл пуст! \n");
		}

	}

	/**
	 * Метод дополняет содержимое файла.
	 * 
	 * @param content
	 */
	public void fill(String content) {
		Path path = Paths.get(getDir() + getFileName());
		try {
			Files.write(path, content.getBytes(), StandardOpenOption.APPEND);
			System.out.println("Контент файла дополнен" + '\n');
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	/**
	 * Метод удаляет содержимое файла.
	 */
	public void del() {
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter(getDir() + getFileName());
			printWriter.flush();
			printWriter.close();
			System.out.println("Содержимое файла: " + getFileName() + " удалено!" + '\n');
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	/**
	 * Метод удаляет файл.
	 */
	public void delFile() {
		Path path = Paths.get(getDir() + getFileName());
		try {
			Files.delete(path);
			System.out.println("Файл удален! \n");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

//	public void del() {
//		Path path = Paths.get(getDir() + getFileName());
//		String tmpString = "";
//		try {
//			Files.write(path, tmpString.getBytes());
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
//	}
}