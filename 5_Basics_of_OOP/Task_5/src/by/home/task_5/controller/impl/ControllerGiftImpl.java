package by.home.task_5.controller.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


import by.home.task_5.controller.GiftController;
import by.home.task_5.controller.Validation;
import by.home.task_5.controller.validation.ValidationImpl;
import by.home.task_5.entity.Candy;
import by.home.task_5.entity.Gift;
import by.home.task_5.entity.Packing;
import by.home.task_5.service.ServiceException;
import by.home.task_5.service.ServiceProvidor;

public class ControllerGiftImpl implements GiftController {

	ServiceProvidor providor = ServiceProvidor.getInstance();
	private static final Logger loger = Logger.getGlobal();


	@Override
	public boolean giftAddController(String request) {
		Validation validation = new ValidationImpl();

		if (validation.validationGiftAdd(request)) {

			boolean flag = true;

			List<Candy> candies = new ArrayList<Candy>();

			BufferedReader reader = new BufferedReader(new StringReader(request));

			try {

				while (flag) {

					String reque = reader.readLine();

					if (reque != null) {

						if (reque != null & reque.split("\\s")[0].equals("Candy")) {

							String candis = reque.split("[\\s]")[1];

							double price = Double.parseDouble(reque.split("[\\s]")[3]);

							candies.add(new Candy(candis, price));

						} else if (reque.split("\\s")[0].equals("Packing")) {

							boolean box1 = Boolean.parseBoolean(reque.split("\\s")[2]);
							boolean box2 = Boolean.parseBoolean(reque.split("\\s")[4]);

							providor.getGiftService().addGift(new Gift(candies, new Packing(box1, box2)));

						}
					} else {

						reader.close();

						return true;
					}
				}

			} catch (ServiceException e) {

				loger.info("ERROR giftAddController!");

			} catch (IllegalStateException e) {

				loger.info("ERROR");
			} catch (IOException e) {

				loger.info("ERROR");
			}
		}

		return false;
	}
}