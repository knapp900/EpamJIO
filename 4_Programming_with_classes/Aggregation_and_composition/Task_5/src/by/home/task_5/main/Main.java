package by.home.task_5.main;

import by.home.task_5.entity.*;
import by.home.task_5.logic.*;
import by.home.task_5.view.*;


import java.time.LocalDate;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по
 * выборутуристической путевки различного типа (отдых, экскурсии, лечение,
 * шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
 * транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 * 
 * @author Knapp Arthur
 *
 */

public class Main {

	public static void main(String[] args) {
		TourStorage tourStorage = new TourStorage();
		TourSearchLogic logic = new TourSearchLogic();
		View view = new View();

		tourStorage.AddTours(
				new Tour(2, "Belarus", TypeTour.EXCURSION, LocalDate.of(2021, 10, 1), LocalDate.of(2021, 10, 6),
						TypeTransport.BUS, "МАЗ-251", 2, "национальная", "Экскурсия по замкам Белоруссии", 5000));
		tourStorage
				.AddTours(new Tour(1, "Israel", TypeTour.MEDICAL, LocalDate.of(2021, 11, 1), LocalDate.of(2021, 11, 25),
						TypeTransport.AIRPLANE, "Боинг 747", 3, "кухня кошерная", "Лечение в больнице Рамбам", 45000));
		tourStorage
				.AddTours(new Tour(3, "Israel", TypeTour.MEDICAL, LocalDate.of(2021, 10, 1), LocalDate.of(2021, 10, 20),
						TypeTransport.AIRPLANE, "Боинг 747", 3, "кухня кошерная", "Лечение в больнице Рамбам", 45000));
		tourStorage
				.AddTours(new Tour(4, "Israel", TypeTour.MEDICAL, LocalDate.of(2021, 11, 1), LocalDate.of(2021, 11, 5),
						TypeTransport.AIRPLANE, "Боинг 747", 3, "кухня кошерная", "Лечение в больнице Рамбам", 45000));
		tourStorage
				.AddTours(new Tour(5, "Israel", TypeTour.MEDICAL, LocalDate.of(2021, 11, 1), LocalDate.of(2021, 12, 25),
						TypeTransport.AIRPLANE, "Боинг 747", 3, "кухня кошерная", "Лечение в больнице Рамбам", 45000));
		tourStorage
				.AddTours(new Tour(6, "Israel", TypeTour.MEDICAL, LocalDate.of(2021, 11, 1), LocalDate.of(2021, 11, 6),
						TypeTransport.AIRPLANE, "Боинг 747", 3, "кухня кошерная", "Лечение в больнице Рамбам", 45000));
		tourStorage
				.AddTours(new Tour(7, "Israel", TypeTour.MEDICAL, LocalDate.of(2021, 11, 1), LocalDate.of(2021, 11, 9),
						TypeTransport.AIRPLANE, "Боинг 747", 3, "кухня кошерная", "Лечение в больнице Рамбам", 45000));
		tourStorage
				.AddTours(new Tour(8, "Israel", TypeTour.MEDICAL, LocalDate.of(2021, 11, 1), LocalDate.of(2021, 11, 15),
						TypeTransport.AIRPLANE, "Боинг 747", 3, "кухня кошерная", "Лечение в больнице Рамбам", 45000));
		tourStorage
				.AddTours(new Tour(9, "Israel", TypeTour.MEDICAL, LocalDate.of(2021, 11, 1), LocalDate.of(2021, 11, 10),
						TypeTransport.AIRPLANE, "Боинг 747", 3, "кухня кошерная", "Лечение в больнице Рамбам", 45000));

		
		view.print("Выбор по номеру: \n", logic.getTourToNumber(tourStorage.getTours(), 1));
		view.print("Сортировка по номеру: \n", logic.sortByNumber(tourStorage.getTours()));
		view.print("Поиск по виду транспорта: \n", logic.findByTransport(tourStorage.getTours(), "Автобус"));
		view.print("Поиск по количеству дней в туре: \n", logic.findByDay(tourStorage.getTours(), 1, 5));
		view.print("Поиск по количеству приемов пищи: \n", logic.findBynumberOfMeals(tourStorage.getTours(), 1, 2));

	}

}
