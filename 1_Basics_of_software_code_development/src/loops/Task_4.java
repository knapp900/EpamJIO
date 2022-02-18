package loops;

/**
 * 
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 * 
 * @author Knapp Arthur
 *
 */

public class Task_4 {

	public static void main(String[] args) {
		int num = 200;
		int product = 1;
		for (int i = 1; i <= num; i++) {
			product *= Math.pow(i, 2);

		}
		System.out.println(product);

	}

}
