package linear_programs;

import java.util.Scanner;

/**
 * 2. Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения): z=(b+√(b²+4ac))/2a - a³с + b⁻ ²
 * 
 * @author Knapp Arthur
 */

public class Task_2 {

	public static void main(String[] args) {
		double a, b, c, z;
		Scanner scan = new Scanner(System.in);
		System.out.print("Set a value for a ");
		a = scan.nextDouble();
		System.out.print("Set a value for b ");
		b = scan.nextDouble();
		System.out.print("Set a value for c ");
		c = scan.nextDouble();
		scan.close();

		z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
		System.out.println("z = " + z);

	}

}
