package by.home.task_8.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * Класс хранит в себе всех пользователей.
 * @author knapp
 *
 */
public class CustomerStorage {
	
	private List<Customer> customers = new ArrayList<Customer>();
	
	public CustomerStorage() {
		
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void addCustomers(Customer customer) {
		customers.add(customer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customers);
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
		return Objects.equals(customers, other.customers);
	}

	@Override
	public String toString() {
		return "CustomerStorage customers=" + customers ;
	}
	
	
	
	

}
