package by.home.task_1.controller.impl;



import java.util.logging.Logger;

import by.home.task_1.controller.Controller;
import by.home.task_1.service.ServiceException;
import by.home.task_1.service.ServiceProvider;

public class TreasureControllerImpl implements Controller {
	
	private static final Logger loger = Logger.getGlobal();
	private final ServiceProvider provider = ServiceProvider.getInstanse();

	@Override
	public String doAction(int request) {
		int reques = request;
		String responce = null;
		switch (reques) {
		case 1:
			try {
				responce = provider.getTreasureService().getAll();
			} catch (ServiceException e) {
				loger.info("ERROR getAll!");
			}

			break;
		case 2:
			try {
				responce = provider.getTreasureService().getByMaxPrice();
			} catch (ServiceException e) {
				loger.info("ERROR getByMaxPrice!");
			}

			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + request);
		}

		return responce;
	}

	@Override
	public String doAction(int request, double amount) {
		int reques = request;
		String responce = null;

		switch (reques) {
		case 3: {

			try {
				responce = provider.getTreasureService().getByGivenAmount(amount);
			} catch (ServiceException e) {
				loger.info("ERROR getByGivenAmount!");
			}

			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + request);
		}

		return responce;
	}

}
