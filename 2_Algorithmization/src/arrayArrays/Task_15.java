package arrayArrays;

import java.util.Arrays;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task_15 {
	public static void main(String[] args) {
		int[][] array = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 3 } };
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				max = Math.max(max, array[i][j]);

			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 2 == 0) {
					array[i][j] = max;
				}

			}
		}
		System.out.println("Максимальное значение в матрице: " + max);
		System.out.println(Arrays.deepToString(array));

	}

}
