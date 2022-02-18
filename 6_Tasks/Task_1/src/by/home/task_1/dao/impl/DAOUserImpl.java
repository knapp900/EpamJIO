package by.home.task_1.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import by.home.task_1.dao.UserDAO;
import by.home.task_1.entity.User;
import by.home.task_1.dao.DAOException;

public class DAOUserImpl implements UserDAO {

	@Override
	public boolean autorization(String login, String password) throws DAOException {

		StringBuilder sb = new StringBuilder("login=" + login + " password=" + password);

		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream("/by/home/task_1/resources/accounts.txt")));

			String line;
			while ((line = br.readLine()) != null) {

				if (line.contains(sb)) {

					return true;
				}
			}

			return false;

		} catch (FileNotFoundException e) {

			throw new DAOException(e);

		} catch (IOException e) {

			throw new DAOException(e);

		} catch (NullPointerException e) {

			throw new DAOException(e);
		}

	}

	@Override
	public String getUserByLogin(String login) throws DAOException {

		StringBuilder sb = new StringBuilder("login=" + login);

		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream("/by/home/task_1/resources/accounts.txt")));

			String line;
			while ((line = br.readLine()) != null) {

				if (line.contains(sb)) {

					return line;
				}
			}

		} catch (FileNotFoundException e) {

			throw new DAOException(e);

		} catch (IOException e) {

			throw new DAOException(e);

		} catch (NullPointerException e) {

			throw new DAOException(e);
		}
		return null;
	}

	@Override
	public List<String> getAllEmail() throws DAOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(getClass().getResourceAsStream("/by/home/task_1/resources/accounts.txt")));

		List<String> list = new ArrayList<String>();

		String line;

		try {

			while ((line = br.readLine()) != null) {

				list.add(line.split("[=\\s]")[5] + '\n');

			}

			return list;

		} catch (IOException e) {

			throw new DAOException(e);
		}

	}

	@Override
	public boolean addUser(User user) throws DAOException {


		try {

			File file = new File("by/home/task_1/resources/accounts.txt");

			String absalutPuth = file.getAbsolutePath();

			FileWriter writer;

			writer = new FileWriter(absalutPuth, true);

			String userForAppend = user.toString();

			writer.write(userForAppend + "\n");

			writer.close();

			return true;

		} catch (IOException e) {

			throw new DAOException(e);
		}

	}

	@Override
	public String getAdminEmail() throws DAOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(getClass().getResourceAsStream("/by/home/task_1/resources/accounts.txt")));

		String line;

		String email = null;

		try {

			while ((line = br.readLine()) != null) {

				if (line.split("[=\\s]")[7].equals("ADMIN")) {

					email = line.split("[=\\s]")[5];

					return email;

				}

			}

			return email;

		} catch (IOException e) {

			throw new DAOException(e);
		}

	}

}
