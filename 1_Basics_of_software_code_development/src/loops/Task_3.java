package loops;

/**
 * 
 * Найти сумму квадратов первых ста чисел.
 * 
 * @author Knapp Arthur
 *
 */

public class Task_3 {
	public static void main(String[] args) {
		int num = 100;
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum += Math.pow(i, 2);

		}
		System.out.println(sum);
	}

}
