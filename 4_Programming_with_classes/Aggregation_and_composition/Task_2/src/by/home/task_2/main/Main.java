package by.home.task_2.main;

import by.home.task_2.entity.*;
import by.home.task_2.logic.*;
import by.home.task_2.view.*;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы:
 * ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 * 
 * @author Knapp Arthur
 *
 */

public class Main {

	public static void main(String[] args) {
		CarLogic carLogic = new CarLogic();
		View view = new View();
		// Создает новую машину.
		Car vwCar = new Car("Volkswagen", 10, 14, "KAMA", "Gasoline", "VW CFNA 1.6 MPI", 1.6);

		view.print(vwCar);
		// Меняем колеса.
		carLogic.changeWheel(vwCar, 16, "Bridgestone");

		view.print(vwCar);
		// Заправляемся.
		carLogic.fillTank(vwCar, 10);
		// Начинаем движение.
		carLogic.startMoving(vwCar);
		view.print("___________________");
		// Останавливаемся.
		carLogic.stopMoving(vwCar);
		// Выводим на консоль марку автомобиля.
		carLogic.infoCar(vwCar);

	}

}
