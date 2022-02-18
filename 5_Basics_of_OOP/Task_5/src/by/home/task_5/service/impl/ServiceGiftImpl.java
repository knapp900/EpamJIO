package by.home.task_5.service.impl;

import by.home.task_5.dao.DAOException;
import by.home.task_5.dao.DAOProvider;
import by.home.task_5.entity.Gift;
import by.home.task_5.service.GiftService;
import by.home.task_5.service.ServiceException;

public class ServiceGiftImpl implements GiftService {

	DAOProvider provider = DAOProvider.getInstance();

	@Override
	public boolean addGift(Gift gift) throws ServiceException {
		try {
			provider.getGiftDao().addGifts(gift);

			return true;

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

	}

}
