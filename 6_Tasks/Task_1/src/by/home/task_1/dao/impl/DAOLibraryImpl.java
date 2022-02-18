package by.home.task_1.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import by.home.task_1.dao.LibraryDAO;
import by.home.task_1.dao.DAOException;
import by.home.task_1.entity.Book;


public class DAOLibraryImpl implements LibraryDAO {

	@Override
	public String getAllBooks() throws DAOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(getClass().getResourceAsStream("/resources/books.txt")));

		StringBuilder stringBuilder = new StringBuilder();

		String line;

		try {

			while ((line = br.readLine()) != null) {

				stringBuilder.append(line + '\n');

			}

		} catch (IOException e) {

			throw new DAOException(e);
		}
		return stringBuilder.toString();
	}

	@Override
	public boolean addBook(Book book) throws DAOException {

		try {
			File file = new File("resources/books.txt");

			String absalutPuth = file.getAbsolutePath();

			FileWriter writer;

			writer = new FileWriter(absalutPuth, true);

			String bookToAppend = book.toString();

			writer.write(bookToAppend + "\n");

			writer.close();

			return true;

		} catch (IOException e) {

			throw new DAOException(e);
		}

	}

	@Override
	public boolean delBook(String title) throws DAOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(getClass().getResourceAsStream("/resources/books.txt")));

		try {

			File sourceFile = new File("resources/books.txt");

			File outputFile = new File("resources/bookTmp.txt");

			String absalutPuth = outputFile.getAbsolutePath();

			FileWriter writer;

			writer = new FileWriter(absalutPuth, true);

			String line;

			while ((line = br.readLine()) != null) {
				
//				String tmpString = line.split("=")[1];

				if (!line.contains("title="+title)) {

					writer.write(line + "\n");


				}
				
			}
			
			writer.close();
			
			br.close();
			
			sourceFile.delete();
			
			outputFile.renameTo(sourceFile);

		} catch (IOException e) {

			throw new DAOException(e);
		}

		return false;
	}

	@Override
	public String getBook(String title) throws DAOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(getClass().getResourceAsStream("/resources/books.txt")));

		StringBuilder stringBuilder = new StringBuilder();

		String line;

		try {

			while ((line = br.readLine()) != null) {

				if (line.split("=")[1].contains(title)) {

					stringBuilder.append(line);
				}

			}

		} catch (Exception e) {

			throw new DAOException(e);
		}
		return null;
	}

	@Override
	public String findByTitle(String title) throws DAOException {

		BufferedReader br = new BufferedReader(

				new InputStreamReader(getClass().getResourceAsStream("/resources/books.txt")));

		StringBuilder stringBuilder = new StringBuilder();

		String line;

		String titleForSearch = title.toLowerCase();

		try {

			while ((line = br.readLine()) != null) {

				if (line.toLowerCase().contains(titleForSearch)) {

					stringBuilder.append(line + '\n');
				}

			}
			return stringBuilder.toString();

		} catch (Exception e) {

			throw new DAOException(e);
		}

	}

}
