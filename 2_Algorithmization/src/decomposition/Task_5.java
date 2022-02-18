package decomposition;

import java.util.Arrays;

//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).

public class Task_5 {
	public static void main(String[] args) {
		int[] array = new int[] { 43,1, 2, 5, 33, 57, 1, 5, 6 };
		int res = penultimateMaximum(array);
		System.out.println(res);
	}

	private static int penultimateMaximum(int[] array) {
		int res = 0;
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {

			res = array[array.length - 2];
		}
		return res;

	}

}
