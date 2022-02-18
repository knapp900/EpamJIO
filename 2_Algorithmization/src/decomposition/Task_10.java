package decomposition;

import java.util.Arrays;

//Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.

public class Task_10 {
	public static void main(String[] args) {
		int n = 1256628;
		getCountsOfDigits(n);
		fillArray(n);
	}
	private static int getCountsOfDigits (int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	private static int [] fillArray (int n) {
		int [] array = new int[getCountsOfDigits(n)];
		for (int i = 0;i < array.length;i++) {
			array[i] = n % 10;
			n = n/10;
		}
		for (int i = 0; i < array.length / 2; i++) {
			  int temp = array[i];
			  array[i] = array[array.length - 1 - i];
			  array[array.length - 1 - i] = temp;
			}
		System.out.println(Arrays.toString(array));
		return array;
	}

}
