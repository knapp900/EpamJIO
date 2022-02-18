package by.home.task_7.logic;

import by.home.task_7.entity.*;

public class TriangleLogic extends Triangle {

	public TriangleLogic(int sideA, int sideB, int sideC) {
		super(sideA, sideB, sideC);

	}

	/**
	 * Вычисление площади треугольника по формуле Герона/
	 * 
	 * @return Площадь треугольника.
	 */

	public double areaOfTriangle() {

		return Math.sqrt(semiPerimeter() * (semiPerimeter() - getSideA())
				* ((semiPerimeter() - getSideB()) * ((semiPerimeter() - getSideC()))));
	}

	/**
	 * Вычисление перимтра треугольника.
	 * 
	 * @return - периметр.
	 */

	public double perimeterOfTriangle() {

		return getSideA() + getSideB() + getSideC();
	}

	/**
	 * Вычисление полупериметра.
	 * 
	 * @return - полупериметр.
	 */

	public double semiPerimeter() {

		return (getSideA() + getSideB() + getSideC()) / 2;
	}

	/**
	 * Вычисление декартовых координат точки пересечения медиан для случая, когда
	 * треугольник лежит в I четверти, сторона a лежит на оси абсцисс, сторона c
	 * выходит из начала координат.
	 * 
	 * @return Точка пересечения медиан
	 */

	public Point centroid() {
		// Координата x вершины, противолежащей стороне a
//      double bcX = getSideA * getSideC / (getSideB + getSideC);
//      double resultX = getSideA / 2 - (getSideA / 2 - bcX) / 3;
		double resultX = getSideA() * (1 + getSideC() / (getSideB() + getSideC())) / 3;
//      //Высота, опущенная на сторону a
//      double aH = 2 * areaOfTringle() / getSideA;
//      double resultY = aH / 3;
		double resultY = 2 * areaOfTriangle() / (getSideA() * 3);
		return new Point(resultX, resultY);
	}

}
