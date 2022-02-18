package by.home.task_3.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CountryStorage {

	private List<Country> countries = new ArrayList<Country>();

	public CountryStorage() {

	}

	public List<Country> getCountries() {
		return countries;
	}

	public void addCountries(Country country) {
		countries.add(country);
	}

	@Override
	public int hashCode() {
		return Objects.hash(countries);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryStorage other = (CountryStorage) obj;
		return Objects.equals(countries, other.countries);
	}

	@Override
	public String toString() {
		return "CountryStorage [countries=" + countries + '\n' +"]";
	}

}
