package by.home.task_4.entity;

import java.util.Objects;

public class Account {
	private String title;
	private int ID;
	private double amount;

	public Account() {
		super();

	}

	public Account(String title, int ID, double amount) {
		super();
		this.title = title;
		this.ID = ID;
		this.amount = amount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, ID, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount) && Objects.equals(ID, other.ID)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return '\n' + "title " + title + ", idNumber= " + ID + ", amount= " + amount;
	}

}
