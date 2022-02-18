package by.home.task_5.service;

import by.home.task_5.service.impl.ServiceGiftImpl;

public class ServiceProvidor {
	private final static ServiceProvidor instance = new ServiceProvidor();

	private GiftService giftService = new ServiceGiftImpl();

	private ServiceProvidor() {

	}

	public GiftService getGiftService() {
		return giftService;
	}

	public void setGiftService(GiftService giftService) {
		this.giftService = giftService;
	}

	public static ServiceProvidor getInstance() {
		return instance;
	}

}
