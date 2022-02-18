package by.home.task_1.entity;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable {

	private static final long serialVersionUID = -7773660332030299554L;

	private String title;
	private String category;
	private double price;

	public Treasure() {
		super();

	}

	public Treasure( String title, String category, double price) {
		super();
		this.title = title;
		this.category = category;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		return Objects.equals(category, other.category)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "title=" + title + " category=" + category + " price=" + price + '\n';
	}

}
