package by.home.task_1.service;


public interface TreasureService {
	String getAll() throws ServiceException;

	String getByMaxPrice() throws ServiceException;

	String getByGivenAmount(double amount) throws ServiceException;

	

}
