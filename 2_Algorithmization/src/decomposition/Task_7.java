package decomposition;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task_7 {
	public static void main(String[] args) {
		int sumFactorial = 0;
		for (int i = 1; i <= 9; i++) {
			if (i % 2 != 0) {
				sumFactorial += factorial(i);
			}
		}
		System.out.println("Cуммы факториалов всех нечетных чисел от 1 до 9: " + sumFactorial);
	}

	private static int factorial(int f) {
		int res = 1;
		for (int i = 1; i <= f; i++) {
			res = res * i;
		}
		return res;

	}

}
