package by.home.task_4.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
	private boolean isBlocked;
	private int ID;
	private String fullName;
	private List<Account> accounts = new ArrayList<Account>();
	private Account account;

	public Customer() {
		super();

	}

	public Customer(boolean isBlocked, int iD, String fullName, List<Account> accounts) {
		super();
		this.isBlocked = isBlocked;
		ID = iD;
		this.fullName = fullName;
		this.accounts = accounts;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public int getID() {
		return ID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void addAccounts(Account account) {
		accounts.add(account);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, accounts, fullName, isBlocked);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return ID == other.ID && Objects.equals(accounts, other.accounts) && Objects.equals(fullName, other.fullName)
				&& isBlocked == other.isBlocked;
	}

	@Override
	public String toString() {
		return '\n' + "Customer isBlocked = " + isBlocked + ", ID пользователя = " + ID + ", Ф.И.О = " + fullName
				+ accounts + '\n';
	}

}
