package by.home.task_7.main;

import by.home.task_7.logic.*;
import by.home.task_7.view.*;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания
 * объектов, вычисления площади, периметра и точки пересечения медиан.
 * 
 * @author Knapp Arthur
 */

public class Main {
	public static void main(String[] args) {

		// Создание треугольника и задание ему параметров.
		TriangleLogic triangleLogic = new TriangleLogic(3, 4, 5);
		View view = new View();

		// Вывод информации о треугольнике.
		view.print(triangleLogic);

		// Вычисление площади
		view.print(triangleLogic.areaOfTriangle());

		// Вычисление периметра
		view.print(triangleLogic.perimeterOfTriangle());

		// Вычисление точки пересечения медиан
		view.print(triangleLogic.centroid());

	}

}
