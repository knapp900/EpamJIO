package by.home.task_3;

import by.home.task_3.entity.*;
import by.home.task_3.entity.Calendar.WeekendsAndHolidays;

/**
 *
 * Задача 3. Создать класс Календарь с внутренним классом, с помощью объектов
 * которого можно хранить информацию о выходных и праздничных днях. *
 * 
 * @author Knapp Arthur
 *
 */

public class Main {
	public static void main(String[] args) {
//		Calendar calendar = new Calendar(); 
		WeekendsAndHolidays dayOff = new WeekendsAndHolidays();
		dayOff.addDayOff(new Calendar(1, 1, 2000));
	}

}
