package by.home.task_5.logic;

import by.home.task_5.entity.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по
 * выборутуристической путевки различного типа (отдых, экскурсии, лечение,
 * шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
 * транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 * 
 * @author Knapp Arthur
 *
 */

public class TourSearchLogic {
	/**
	 * Выбор путевок по номеру
	 * 
	 * @param list
	 * @param number
	 * @return
	 */
	public Tour getTourToNumber(List<Tour> list, int number) {
		for (Tour tour : list) {
			if (tour.getNumber() == number) {
				return tour;
			}
		}

		return null;
	}

	/**
	 * Сортировка по номеру
	 * 
	 * @param list
	 * @return
	 */
	public List<Tour> sortByNumber(List<Tour> list) {
		List<Tour> sortByNumber = new ArrayList<Tour>();
		sortByNumber.addAll(list);
		Collections.sort(sortByNumber, new Comparator<Tour>() {

			public int compare(Tour o1, Tour o2) {

				return o1.getNumber() - o2.getNumber();
			}
		});

		return sortByNumber;
	}

	/**
	 * Поиск по транспорту
	 * 
	 * @param list
	 * @param type
	 * @return
	 */
	public List<Tour> findByTransport(List<Tour> list, String type) {
		List<Tour> tours = new ArrayList<Tour>();

		for (Tour tour : list) {
			if (tour.getTransport().getTransport().equals(type)) {
				tours.add(tour);
			}
		}

		return tours;
	}

	/**
	 * Поиск по диапазону дней
	 * 
	 * @param list
	 * @param dayMin
	 * @param dayMax
	 * @return
	 */
	public List<Tour> findByDay(List<Tour> list, int dayMin, int dayMax) {
		List<Tour> tours = new ArrayList<Tour>();

		for (Tour tour : list) {
			if (tour.getNumbersOfDay() >= dayMin && tour.getNumbersOfDay() <= dayMax) {
				tours.add(tour);
			}
		}

		return tours;
	}

	/**
	 * Поиск по количеству раз питания
	 * 
	 * @param list
	 * @param numMin
	 * @param numMax
	 * @return
	 */
	public List<Tour> findBynumberOfMeals(List<Tour> list, int numMin, int numMax) {
		List<Tour> tours = new ArrayList<Tour>();

		for (Tour tour : list) {
			if (tour.getFood().getNumberOfMeals() >= numMin && tour.getFood().getNumberOfMeals() <= numMax) {
				tours.add(tour);
			}
		}

		return tours;
	}
}
