package linear_programs;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 * 
 * @author Knapp Arthur
 *
 */

public class Task_1 {
	public static void main(String[] args) {
		double a, b, c, z;
		Scanner scan = new Scanner(System.in);
		System.out.print("Set a value for a: ");
		a = scan.nextDouble();
		System.out.print("Set a value for b: ");
		b = scan.nextDouble();
		System.out.print("Set a value for c: ");
		c = scan.nextDouble();
		scan.close();

		z = ((a - 3) * b / 2) + c;
		System.out.println("z = " + z);

	}

}
