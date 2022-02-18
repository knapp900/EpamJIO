package by.home.task_1.service.impl;

import by.home.task_1.dao.*;
import by.home.task_1.entity.Treasure;
import by.home.task_1.service.*;
import java.util.ArrayList;
import java.util.List;

public class TreasureServiceImpl implements TreasureService {

	private final DAOProvider provider = DAOProvider.getInstance();

	/**
	 * Метод возвращает строку со всеми сокровищами.
	 */
	@Override
	public String getAll() throws ServiceException {

		List<Treasure> listAll = new ArrayList<Treasure>();
		try {
			listAll.addAll(provider.getDaoTreasure().getAll());

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

		return listAll.toString();

	}

	/**
	 * Метод возвращает строку с максимальной ценой сокровищь.
	 */

	@Override
	public String getByMaxPrice() throws ServiceException {
		List<Treasure> list = new ArrayList<Treasure>();

		try {
			list.addAll(provider.getDaoTreasure().getByPrice(provider.getDaoTreasure().getByMaxPrice()));

		} catch (DAOException e) {

			throw new ServiceException();
		}

		return list.toString();
	}

	/**
	 * Метод возвращает строку по заданному ценовому значению.
	 */

	@Override
	public String getByGivenAmount(double amount) throws ServiceException {

		List<Treasure> list = new ArrayList<Treasure>();

		try {
			list.addAll(provider.getDaoTreasure().getByGivenAmount(amount));

		} catch (DAOException e) {

			throw new ServiceException();
		}

		return list.toString();
	}

}
