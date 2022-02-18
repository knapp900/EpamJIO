package by.home.task_1.service.impl;

import by.home.task_1.dao.DAOException;
import by.home.task_1.dao.DAOProvider;
import by.home.task_1.entity.Role;
import by.home.task_1.entity.User;
import by.home.task_1.service.ServiceException;
import by.home.task_1.service.ServicePassword;
import by.home.task_1.service.UserService;

public class ServiceUserImpl implements UserService {

	DAOProvider provider = DAOProvider.getInstance();

	@Override
	public boolean authorization(String login, String password) throws ServiceException {

		if (login.matches("[\\w]{1,}") & password.matches("[\\w]{1,}")) {

			try {

				return provider.getUserDAO().autorization(login, new ServicePassword().encryptString(login + password));
//		

			} catch (DAOException e) {

				throw new ServiceException(e);
			}
		}
		return false;
	}

	@Override
	public User checkRole(String login) throws ServiceException {

		try {

			String userInDAO = provider.getUserDAO().getUserByLogin(login);

			String user = userInDAO.split("[=\\s]")[1];

			String email = userInDAO.split("[=\\s]")[5];

			String role = userInDAO.split("[=\\s]")[7];

			User userRole = new User(user, email, Role.valueOf(role));

			return userRole;

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

	}

	@Override
	public boolean addUser(String login, String password, String email, Role role) throws ServiceException {

		User user = new User(login, new ServicePassword().encryptString(login + password), email, role);

		try {

			provider.getUserDAO().addUser(user);

			return true;

		} catch (DAOException e) {

			throw new ServiceException(e);

		}

	}

}
