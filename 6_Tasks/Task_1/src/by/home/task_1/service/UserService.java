package by.home.task_1.service;

import by.home.task_1.entity.Role;
import by.home.task_1.entity.User;

public interface UserService {

	boolean authorization(String login, String password) throws ServiceException;

	User checkRole(String login) throws ServiceException;

	boolean addUser(String login, String password, String email, Role role) throws ServiceException;

}
