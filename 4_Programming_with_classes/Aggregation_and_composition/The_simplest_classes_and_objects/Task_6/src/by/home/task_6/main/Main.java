package by.home.task_6.main;

import by.home.task_6.entity.*;
import by.home.task_6.logic.*;
import by.home.task_6.view.*;

/**
 * Составьте описание класса для представления времени. Предусмотрте возможности
 * установки времени и изменения его отдельных полей (час, минута, секунда) с
 * проверкой допустимости вводимых значений. В случае недопустимых значений
 * полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд.
 * 
 * @author Knapp Arthur
 *
 */

public class Main {

	public static void main(String[] args) {
		TimeView timeView = new TimeView();
		Time time = new Time();
		TimeLogic timeLogic = new TimeLogic(time);

		time.setHours(2);
		time.setMinute(12);
		time.setSecond(12);
		timeView.print(time);
		timeLogic.setTime(2, 2, 2);
		time.toString();
		timeView.print(time);

	}

}
