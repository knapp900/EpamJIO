package branching;

import java.util.Scanner;

/**
 * 1. Даны два угла треугольника (в градусах). Определить, существует ли такой
 * треугольник, и если да, то будет ли он прямоугольным.
 * 
 * @author Knapp Arthur
 *
 */

public class Task_1 {

	public static void main(String[] args) {
		double angle1;
		double angle2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите значение угла №1 ");
		angle1 = scan.nextDouble();
		System.out.print("Введите значение угла №2 ");
		angle2 = scan.nextDouble();
		scan.close();
		if (angle1 + angle2 >= 360) {
			System.out.println("Треугольник не существует");
		} else if (angle1 == 90 || angle2 == 90 || 360 * angle1 * angle2 == 90) {
			System.out.println("Треугольник прямоугольный");
		} else {
			System.out.println("Треугольник не прямоугольный");
		}

	}

}
