package by.home.task_5.main;
import by.home.task_5.entity.*;
import by.home.task_5.logic.*;
import by.home.task_5.view.*;


/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Main {
	public static void main(String[] args) {
		//Инициализация счетчика произвольными значениями.
//		Counter counter = new Counter(0,10,0);
		//Инициализация счетчика значениями по умолчанию.
		Counter counter = new Counter();
		CounterLogic logic = new CounterLogic();
		CounterView view = new CounterView();
		for (int i = 0; i < 11; i++) {
			logic.increasingCount(counter);

		}
		view.printValue(counter);
		//Сброс счетчика до 0.
		logic.resetValueCounter(counter);
		
		for (int i = 0; i < 11; i++) {
			logic.decreaseCounter(counter);

		}
		view.printValue(counter);

	}

}
