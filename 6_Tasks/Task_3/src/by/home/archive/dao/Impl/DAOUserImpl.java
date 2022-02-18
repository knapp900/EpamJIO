package by.home.archive.dao.Impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import by.home.archive.dao.UserDAO;
import by.home.archive.entity.user.Role;
import by.home.archive.entity.user.User;

public class DAOUserImpl implements UserDAO {

	@Override
	public boolean autorization(String login, String password) {
		
		ClassLoader loader = getClass().getClassLoader();

		String path = loader.getResource("resourse/users.txt").getPath();

		File file = new File(path);

		try {
			FileReader reader = new FileReader(file);
			try (BufferedReader br = new BufferedReader(reader)) {
				String line;
				while ((line = br.readLine()) != null) {
					
					String login2 = line.split("[\\s=]")[4];
					String password2 = line.split("[\\s=]")[6];
					
					

					if (login.equals(login2) && password.equals(password2)) {

						return true;
					}
				}
			}

		} catch (FileNotFoundException e) {

			System.err.println(e);

		} catch (IOException e) {

			System.err.println(e);

		} catch (NullPointerException e) {

			System.err.println(e);
		}
		return false;
	}

	@Override
	public User getUserByLoginPassword(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(User user) {
		try {

			File file = new File("users.txt");

			String absalutPuth = file.getAbsolutePath();

			FileWriter writer;

			writer = new FileWriter(absalutPuth, true);

			String userForAppend = user.toString();

			writer.write(userForAppend + "\n");

			writer.close();

			return true;

		} catch (IOException e) {

			System.err.println(e);
		}

		return false;
	}

	@Override
	public Role getRoleByLoginPassword(String login, String password) {

		StringBuilder sb = new StringBuilder("login=" + login + " password=" + password);

		File file = new File("users.txt");

		try {
			FileReader reader = new FileReader(file);
			try (BufferedReader br = new BufferedReader(reader)) {
				String line;
				while ((line = br.readLine()) != null) {

					if (line.contains(sb)) {

						String role = line.split("\\s")[4];

						if (role.contains("ADMIN")) {

							Role result = Role.ADMIN;
							return result;

						}

					}
				}
			}

		} catch (FileNotFoundException e) {

			System.err.println(e);

		} catch (IOException e) {

			System.err.println(e);

		} catch (NullPointerException e) {

			System.err.println(e);
		}
		Role result = Role.USER;
		return result;
	}

}
