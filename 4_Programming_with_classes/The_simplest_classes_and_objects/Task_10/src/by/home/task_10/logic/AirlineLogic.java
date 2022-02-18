package by.home.task_10.logic;

import by.home.task_10.entity.*;


import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {

	/**
	 * Поиск в списоке рейсов для заданного пункта назначения.
	 * 
	 * @param список airline
	 * @param строка destination
	 * @return
	 */

	public List<Airline> findToDestination(List<Airline> airline, String destination) {
		List<Airline> findToDestination = new ArrayList<Airline>();
		for (Airline airline2 : airline) {
			if (airline2.getDestination().contains(destination)) {
				findToDestination.add(airline2);
			}

		}

		return findToDestination;
	}

	/**
	 * Поиск в списоке рейсов для заданного дня недели.
	 * 
	 * @param список airline
	 * @param метод  DayOfWeek day
	 * @return
	 */

	public List<Airline> findToDay(List<Airline> airline, DayOfWeek day) {
		List<Airline> findToDay = new ArrayList<Airline>();
		for (Airline airline2 : airline) {
			if (airline2.getDaysOfWeek().equals(day)) {
				findToDay.add(airline2);
			}

		}

		return findToDay;
	}

	/**
	 * Поиск в списоке рейсов для заданного дня недели, время вылета для которых
	 * больше заданного
	 * 
	 * @param список airline
	 * @param метод  DayOfWeek day
	 * @param метод  LocalTime time
	 * @return
	 */

	public List<Airline> findToDayAndTime(List<Airline> airline, DayOfWeek day, LocalTime time) {
		List<Airline> findToDayAndTime = new ArrayList<Airline>();
		for (Airline airline2 : airline) {
			if (airline2.getDaysOfWeek().equals(day) && airline2.getDepartureTime1().isAfter(time)) {
				findToDayAndTime.add(airline2);
			}

		}

		return findToDayAndTime;
	}

}
