package by.home.task_5.dao;

import by.home.task_5.entity.Gift;
import by.home.task_5.entity.Packing;

public interface GiftDAO {

	String getAll() throws DAOException;

	String getByPackage(Packing packing) throws DAOException;
	
	boolean addGifts(Gift gift) throws DAOException;

	
	

}
