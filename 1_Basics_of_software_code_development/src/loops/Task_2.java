package loops;

/**
 * 
 * Вычислить значения функции на отрезке [а,b] c шагом h: y = x, x > 2 y =-x, x <= 2
 * 
 * @author Knapp Arthur
 *
 */

public class Task_2 {
	public static void main(String[] args) {
		double a = 5.0;
		double b = 10.0;
		double h = 10.0;
		double res = 0;
		for (double i = a; i <= b; i += h) {
			res = i > 2 ? i : -i;
		}
		System.out.println(res);

	}

}
