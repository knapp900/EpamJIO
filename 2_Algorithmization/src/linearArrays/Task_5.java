package linearArrays;

import java.util.Arrays;

//Даны целые числа а 1 ,а 2 ,..., а n . Вывести на печать только те числа, для которых а i > i.

public class Task_5 {
	public static void main(String[] args) {
		int[] array = new int[] { 22, 1, 2, 3, 4, 5, 6, 1, 8, 9, 7, 1 ,15};
		System.out.println("Массив чисел: " + Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.println("Числа, для которых ai > i :" + array[i]);

			}
		}

	}
}
