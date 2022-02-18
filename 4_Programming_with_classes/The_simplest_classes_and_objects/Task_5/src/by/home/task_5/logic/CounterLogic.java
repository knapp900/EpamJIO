package by.home.task_5.logic;

import by.home.task_5.entity.*;


public class CounterLogic {

	public Counter increasingCount(Counter counter) {
		int tmp = counter.getValue();
		if ((tmp + 1) > counter.getMaxRange()) {
			System.out.println("Выход за верхнюю границу счетчика!");

		} else {
			counter.setValue(++tmp);
		}
		return counter;

	}

	public Counter decreaseCounter(Counter counter) {
		int tmp = counter.getValue();
		if ((tmp - 1) < counter.getMinRange()) {
			System.out.println("Выход за нижнюю границу счетчика!");

		} else {
			counter.setValue(--tmp);
		}
		return counter;

	}

	public Counter resetValueCounter(Counter counter) {
		counter.setValue(0);
		return counter;
	}

}
