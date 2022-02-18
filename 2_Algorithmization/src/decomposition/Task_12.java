package decomposition;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

public class Task_12 {
	public static void main(String[] args) {
		int k = 60;
		int n = 5;
		printArray(createArray(k, n));

	}

	static int[] createArray(int k, int n) {
		int[] array = new int[k];
		int tmp = 0;
		while (sum(array) != k) {
			array[tmp] = (int) (Math.random() * (n + 1));
			if (sum(array) <= k && array[tmp] != 0) {
				tmp++;
			}
		}
		int counter = 0;
		int[] b = new int[tmp];
		for (int j : array) {
			if (j > 0) {
				b[counter] = j;
				counter++;
			}
		}

		return b;

	}

	static int sum(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}

	static void printArray(int[] array) {

		for (int i : array) {
			System.out.print(i + " ");
		}
	}

}
