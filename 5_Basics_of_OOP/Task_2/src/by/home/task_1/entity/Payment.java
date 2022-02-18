package by.home.task_1.entity;

/**
 * Задача 2.
 *Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 *нескольких товаров.
 *
 * @author Arthur Knapp
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {
	/**
	 * Список для хранения покупок.
	 */
	List<Purchases> purchases = new ArrayList<Payment.Purchases>();

	/**
	 * Конструктор без параметров.
	 */
	public Payment() {

	}

	/**
	 * Метод возвращающий список покупок.
	 */
	public List<Purchases> getPurchases() {
		return purchases;
	}

	public void setPurchases(List<Purchases> purchases) {
		this.purchases = purchases;
	}

	/**
	 * Метод добавляет покупки в список используя внутренний класс.
	 * 
	 * @param Purchases purchase
	 */
	public void addPurchases(Purchases purchase) {
		purchases.add(purchase);

	}

	public void removePurchases(Purchases purchase) {
		purchases.remove(purchase);

	}

	public static class Purchases {

		String itemTitle;
		double prise;
		int quantity;

		// Конструктор класса Purchases
		public Purchases(String itemTitle, double prise, int quantity) {
			super();
			this.itemTitle = itemTitle;
			this.prise = prise;
			this.quantity = quantity;
		}

		public String getItemTitle() {
			return itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public double getPrise() {
			return prise;
		}

		public void setPrise(double prise) {
			this.prise = prise;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		@Override
		public int hashCode() {
			return Objects.hash(itemTitle, prise, quantity);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Purchases other = (Purchases) obj;
			return Objects.equals(itemTitle, other.itemTitle)
					&& Double.doubleToLongBits(prise) == Double.doubleToLongBits(other.prise)
					&& quantity == other.quantity;
		}

		@Override
		public String toString() {
			return " Наименование: " + itemTitle + ", Цена: " + prise + ", Количество: " + quantity + '\n';
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(purchases);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(purchases, other.purchases);
	}

	
}
