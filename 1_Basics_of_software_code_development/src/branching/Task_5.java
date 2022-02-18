package branching;

/**
 * Вычислить значение функции:
 *F(x) = x2 = x²-3x+9, если x<=3
 *F(x) = 1/(x³ + 6), если x>3
 *
 * @author Knapp Arthur
 */

public class Task_5 {
	public static void main(String[] args) {
		double x = 3.5;
		double res = (x <= 3 ? Math.pow(x, 2) - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6));
		System.out.println(res);
	}

}
