package by.home.task_8.entity;

public class Customer {
	private String id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private String address;
	private long creditCardNumber;
	private String bankAccountNumber;

	public Customer(String id, String lastName, String firstName, String patronymic, String address,
			long creditCardNumber, String bankAccountNumber) {

		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	
	/**
	 * Метод переопределен для вывода только полного имени покупателя.
	 */
	@Override
	public String toString() {
		return "Customer " + lastName + " " + firstName + " " + patronymic +'\n';
	}

//	@Override
//	public String toString() {
//		return "Customer id= " + id + ", lastName= " + lastName + ", firstName= " + firstName + ", patronymic="
//				+ patronymic + ", address= " + address + ", creditCardNumber= " + creditCardNumber
//				+ ", bankAccountNumber= " + bankAccountNumber +'\n';
//	}
}
