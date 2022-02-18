package by.home.task_1.controller;

import by.home.task_1.entity.Role;
import by.home.task_1.entity.User;
import by.home.task_1.service.ServiceException;
import by.home.task_1.service.ServiceProvider;

/**
 * Класс для связи с сервис-классом пользователя
 * 
 * @author Arthur Knapp
 *
 */

public class UserCommand {

	ServiceProvider provider = ServiceProvider.getInstance();

	public boolean addUser(String login, String password, String email, Role role) {

		try {
			
			provider.getUserService().addUser(login, password, email, role);
			
			return true;
			
		} catch (ServiceException e) {
			
			System.err.println(e);
		}
		
		return false;

	}

	public boolean checkUser(String login, String password) {

		try {

			return provider.getUserService().authorization(login, password);

		} catch (ServiceException e) {

			e.printStackTrace();
		}

		return false;

	}

	public User checkRole(String login) {

		try {

			return provider.getUserService().checkRole(login);

		} catch (ServiceException e) {

			e.printStackTrace();
		}

		return null;
	}

}
