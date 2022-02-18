package by.home.task_1.main;

import by.home.task_1.entity.*;
import by.home.task_1.entity.Payment.Purchases;
import by.home.task_1.logic.PaymentLogic;

/**
 * Задача 2. Создать класс Payment с внутренним классом, с помощью объектов
 * которого можно сформировать покупку из нескольких товаров.
 * 
 * @author Knapp Arthur
 *
 */

public class Main {
	public static void main(String[] args) {
		Payment payment = new Payment();
		PaymentLogic logic = new PaymentLogic(); 
		payment.addPurchases(new Purchases("Cofe", 10, 1));
		payment.addPurchases(new Purchases("Tea", 9.5, 1));
		payment.addPurchases(new Purchases("Donut", 11.2, 1));
		payment.addPurchases(new Purchases("Donut", 9.7, 1));
		logic.totalPrice(payment.getPurchases());
		

		System.out.println(payment.getPurchases() + " \n  Итого: "+ logic.totalPrice(payment.getPurchases()));

	}

}
