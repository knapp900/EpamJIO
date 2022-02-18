package branching;

/**
 * Найти max{min(a, b), min(c, d)}.
 * 
 * @author Knapp Arthur
 *
 */

public class Task_2 {

	public static void main(String[] args) {

		int a = 1, b = 2, c = 3, d = 4;
		
		System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));

	}
}
