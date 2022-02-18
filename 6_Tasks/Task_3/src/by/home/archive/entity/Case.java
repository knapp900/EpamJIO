package by.home.archive.entity;

import java.util.Objects;
import java.util.UUID;

public class Case {

	private String id;
	private String firstName;
	private String lastName;
	private int age;
	

	public Case() {
		
		super();

	}

	public Case(String firstName, String lastName, int age) {
		super();
		this.id = UUID.randomUUID().toString();;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Case other = (Case) obj;
		return age == other.age && Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Case [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	

	
	

}
