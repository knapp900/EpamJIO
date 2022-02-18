package by.home.task_1.service;

import by.home.task_1.entity.Treasure;
import by.home.task_1.service.impl.TreasureServiceImpl;

public final class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	
	Treasure treasure = new Treasure();

	public Treasure getTreasure() {
		return treasure;
	}

	public void setTreasure(Treasure treasure) {
		this.treasure = treasure;
	}

	private ServiceProvider() {
	}

	public static ServiceProvider getInstanse() {
		return instance;
	}

	private final TreasureService treasureService = new TreasureServiceImpl();

	public TreasureService getTreasureService() {
		return treasureService;
	}

}
