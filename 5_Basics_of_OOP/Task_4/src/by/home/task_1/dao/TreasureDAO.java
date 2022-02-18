package by.home.task_1.dao;

import java.util.List;
import by.home.task_1.entity.Treasure;

public interface TreasureDAO {

	List<Treasure> getAll() throws DAOException;

	List<Treasure> getString(String searchAttribute) throws DAOException;

	List<Treasure> getByPrice(String searchAttribute) throws DAOException;

	List<Treasure> getByName(String searchAttribute) throws DAOException;
	
	String getByMaxPrice() throws DAOException;
	
	List<Treasure> getByGivenAmount(double amount) throws DAOException;

	boolean addString(Treasure treasure) throws DAOException;

	boolean removeString() throws DAOException;
}
