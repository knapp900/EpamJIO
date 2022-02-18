package linear_programs;

import java.util.Scanner;

/**
 * 3. Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения):
 * 
 * z = ((sin x + cos y) / (cos x - sin y)) * tg xy
 * 
 * @author knapp
 *
 */

public class Task_3 {
	public static void main(String[] args) {
		double x, y, z;
		Scanner scan = new Scanner(System.in);
		System.out.print("Set a value for x: ");
		x = scan.nextDouble();
		System.out.print("Set a value for y: ");
		y = scan.nextDouble();
		scan.close();

		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println("z = " + z);
	}

}
