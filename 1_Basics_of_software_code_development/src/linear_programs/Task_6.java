package linear_programs;

import java.util.Scanner;

/**
 * 
 * 6. Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х, у) принадлежит закрашенной области, и false — в
 * противном случае:
 * 
 * @author Knapp Arthur
 *
 */

public class Task_6 {

	public static void main(String[] args) {
		boolean res = false;
		double x, y;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter x: ");
		x = scan.nextDouble();

		System.out.print("Enter y: ");
		y = scan.nextDouble();

		scan.close();

		if ((y > 0 && y <= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4)) {
			res = true;
			System.out.println("Result:" + res);
		} else {
			System.out.println("Result:" + res);
		}

	}

}
