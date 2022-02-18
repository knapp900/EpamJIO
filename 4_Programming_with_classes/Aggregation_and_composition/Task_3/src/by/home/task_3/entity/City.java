package by.home.task_3.entity;

import java.util.Objects;

public class City {
	private String nameCity;
	private boolean capital;

	public City(String nameCity, boolean capital) {
		super();
		this.nameCity = nameCity;
		this.capital = capital;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(capital, nameCity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return capital == other.capital && Objects.equals(nameCity, other.nameCity);
	}

	@Override
	public String toString() {
		return "City [nameCity=" + nameCity +  " capital " + capital + "]";
	}

}
