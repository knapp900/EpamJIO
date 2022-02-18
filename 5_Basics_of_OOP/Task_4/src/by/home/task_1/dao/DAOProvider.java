package by.home.task_1.dao;

import by.home.task_1.dao.impl.DAOTreasureImpl;

public class DAOProvider {

	private final static DAOProvider instance = new DAOProvider();

	private TreasureDAO daoTreasure = new DAOTreasureImpl();

	private DAOProvider() {

	}

	public static DAOProvider getInstance() {
		return instance;
	}

	public TreasureDAO getDaoTreasure() {
		return daoTreasure;
	}

	public void setDaoTreasure(TreasureDAO daoTreasure) {
		this.daoTreasure = daoTreasure;
	}

}
