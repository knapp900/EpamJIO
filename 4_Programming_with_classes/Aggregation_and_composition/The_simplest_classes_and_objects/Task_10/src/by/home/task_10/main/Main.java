package by.home.task_10.main;

import by.home.task_10.entity.*;
import by.home.task_10.logic.*;
import by.home.task_10.view.*;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;


/**
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 *и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 *методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 *Найти и вывести:
 *a) список рейсов для заданного пункта назначения;
 *b) список рейсов для заданного дня недели;
 *c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 * 
 * @author knapp
 */

public class Main {
	
	public static void main(String[] args) {
		
		AirlineLogic logic = new AirlineLogic();
		AirlineStorage storage = new AirlineStorage();
		View view = new View();
		
		storage.addAirlines(new Airline("Tel-Aviv", "TU 0889", "Boing 747",LocalTime.of(23, 45), DayOfWeek.FRIDAY));
		storage.addAirlines(new Airline("Minsk", "TU 0889", "Boing 747",LocalTime.of(21, 45), DayOfWeek.FRIDAY));
		storage.addAirlines(new Airline("Moskow", "TU 0889", "Boing 747",LocalTime.of(22, 45), DayOfWeek.FRIDAY));
		storage.addAirlines(new Airline("Berlin", "TU 0889", "Boing 747",LocalTime.of(20, 45), DayOfWeek.FRIDAY));
		storage.addAirlines(new Airline("Frankfurt", "TU 0889", "Boing 747",LocalTime.of(23, 45), DayOfWeek.MONDAY));
		storage.addAirlines(new Airline("London", "TU 0889", "Boing 747",LocalTime.of(19, 45), DayOfWeek.FRIDAY));
		storage.addAirlines(new Airline("Eilat", "TU 0889", "Boing 747",LocalTime.of(18, 45), DayOfWeek.FRIDAY));
		
		//Вызов списока рейсов для заданного пункта назначения
		List<Airline> findToDestination;
		findToDestination = logic.findToDestination(storage.getAirlines(), "Tel");
		view.print(findToDestination);
		
		//Вызов списока рейсов для заданного дня недели
		List<Airline> findByDay;
		findByDay = logic.findToDay(storage.getAirlines(), DayOfWeek.MONDAY);
		view.print(findByDay);
		
		//Вызов списока рейсов для заданного дня недели, время вылета для которых больше заданного
		List<Airline> findToDayAndTime;
		findToDayAndTime = logic.findToDayAndTime(storage.getAirlines(), DayOfWeek.FRIDAY, LocalTime.of(20,00));
		view.print(findToDayAndTime);
		
	}

}
