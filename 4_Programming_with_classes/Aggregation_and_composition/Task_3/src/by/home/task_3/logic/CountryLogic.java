package by.home.task_3.logic;

import by.home.task_3.entity.*;


import java.util.ArrayList;
import java.util.List;

/**
 * Методы: 1.вывести на консоль столицу, 2.количество областей, 3.площадь,
 * 4.областные центры.
 * 
 * @author knapp
 *
 */

public class CountryLogic {

	// Ищет в списке столицу.
	public List<Country> getCapital(List<Country> countries) {
		List<Country> getCapitalList = new ArrayList<Country>();
		for (Country country : countries) {
			if (country.getCity().isCapital()) {
				getCapitalList.add(country);

			}
		}
		return getCapitalList;

	}

	// Выводит количество областей.
	public int numberOfRegions(List<Country> countries) {
		int counter = 0;
		for (Country country : countries) {
			if (country.getRegion().getNameRegion() != null) {
				counter++;

			}
		}
		return counter;
	}

	// Считает площадь страны сумируя области.
	public double square(List<Country> countries) {
		double square = 0;
		for (Country country : countries) {
			square += country.getRegion().getSquareOfRegion();

		}
		return square;

	}

	// Ищет в списке областные центры.
	public List<String> findDistrictСenter(List<Country> countries) {
		List<String> findCenrArrayList = new ArrayList<String>();
		for (Country country : countries) {

			if (country.getDistrict().getDistrictСenter() != null) {
				findCenrArrayList.add(country.getDistrict().getDistrictСenter());
			}

		}
		return findCenrArrayList;

	}
}
