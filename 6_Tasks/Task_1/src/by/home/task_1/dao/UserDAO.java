package by.home.task_1.dao;

import java.util.List;

import by.home.task_1.entity.User;

public interface UserDAO {

	List<String> getAllEmail() throws DAOException;

	boolean autorization(String login, String password) throws DAOException;

	boolean addUser(User user) throws DAOException;

	String getUserByLogin(String login) throws DAOException;

	String getAdminEmail() throws DAOException;

}
