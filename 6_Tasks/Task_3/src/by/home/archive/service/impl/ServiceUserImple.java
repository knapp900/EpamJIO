package by.home.archive.service.impl;

import by.home.archive.dao.DAOProvider;
import by.home.archive.dao.UserDAO;
import by.home.archive.entity.user.Role;
import by.home.archive.service.UserService;

public class ServiceUserImple implements UserService {
	
	private final DAOProvider provider = DAOProvider.getInstance();

	@Override
	public boolean logination(String login, String password) {
		
		UserDAO userDAO = provider.getUserDAO();
		
		try {
			boolean result = userDAO.autorization(login, password);
            return result;
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return false;
	}

	@Override
	public Role checkRole(String login, String password) {
		
		UserDAO userDAO = provider.getUserDAO();
		
		try {
			
			Role result = userDAO.getRoleByLoginPassword(login, password);
			
			return result;
			
 		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return null;
	}

}
