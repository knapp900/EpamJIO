package by.home.task_4.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerStorage {
	private List<Customer> userAccounts = new ArrayList<Customer>();

	public CustomerStorage() {
		super();
	}

	public CustomerStorage(List<Customer> userAccounts) {
		super();
		this.userAccounts = userAccounts;
	}

	public List<Customer> getUserAccounts() {
		return userAccounts;
	}

	public void addUserAccounts(Customer userAccount) {
		userAccounts.add(userAccount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userAccounts);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerStorage other = (CustomerStorage) obj;
		return Objects.equals(userAccounts, other.userAccounts);
	}

	@Override
	public String toString() {
		return "AccountStorage [userAccounts=" + userAccounts + "]";
	}

}
