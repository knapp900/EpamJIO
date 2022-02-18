package decomposition;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

public class Task_6 {
	public static void main(String[] args) {
		int a, b, c, res;
		a = 9;
		b = 15;
		c = 49;
		findGcd(a, b);
		res = findGCD(a, b, c);
		coPrimeNumbers(res);

	}

	private static int findGcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else if (b > a) {
				b = b - a;

			}
		}
		return a;

	}

	private static int findGCD(int x, int y, int z) {
		return findGcd(findGcd(x, y), z);
	}

	private static void coPrimeNumbers(int res) {
		if (res == 1) {
			System.out.println("Числа взоимно простые.");
		} else {
			System.out.println("Числа не взоимно простые.");

		}

	}
}
