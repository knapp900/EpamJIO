package by.home.task_5.dao;

import by.home.task_5.dao.impl.DAOGiftImpl;

public class DAOProvider {
	private final static DAOProvider instance = new DAOProvider();

	private GiftDAO giftDao = new DAOGiftImpl();

	private DAOProvider() {

	}

	public GiftDAO getGiftDao() {
		return giftDao;
	}

	public void setGiftDao(GiftDAO giftDao) {
		this.giftDao = giftDao;
	}

	public static DAOProvider getInstance() {
		return instance;
	}

}
