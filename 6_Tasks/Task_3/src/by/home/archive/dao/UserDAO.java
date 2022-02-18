package by.home.archive.dao;

import by.home.archive.entity.user.Role;
import by.home.archive.entity.user.User;

public interface UserDAO {
	
	boolean autorization(String login, String password);

	User getUserByLoginPassword( String login, String password);

	boolean add(User user);

	Role getRoleByLoginPassword( String login,  String password);

	
}
