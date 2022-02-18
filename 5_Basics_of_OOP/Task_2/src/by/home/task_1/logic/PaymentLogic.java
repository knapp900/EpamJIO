package by.home.task_1.logic;

import java.util.List;
import by.home.task_1.entity.Payment.Purchases;

public class PaymentLogic {
	
	
	/**
	 * Метод возвращает общую стоимость.
	 * @param list
	 * @return double
	 */
	public double totalPrice(List<Purchases> list) {
		double totalPrice = 0;
		for (Purchases purchases : list) {
			totalPrice += purchases.getPrise();
		}

		return totalPrice;

	}

}
