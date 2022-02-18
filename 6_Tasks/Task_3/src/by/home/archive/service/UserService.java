package by.home.archive.service;

import by.home.archive.entity.user.Role;

public interface UserService {
	
	boolean logination (String login, String password);
	
	Role checkRole(String login, String password);

}
