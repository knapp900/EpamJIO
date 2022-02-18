package arrayArrays;

import java.util.Arrays;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class Task_10 {
	public static void main(String[] args) {
		int[][] array = new int[][] { { -1, 2, 3, 4 },
			                           { 1, 0, 1, 1 },
			                           { 2, 2, 2, 33 },
			                           { 0, 0, 0, 10 } };
		System.out.println(
				Arrays.deepToString(array) + '\n' + "Положительные элементы главной диагонали квадратной матрицы: ");

		for (int i = 0; i < array.length; i++) {

			if (array[i][i] >= 0) {

				System.out.print(array[i][i] + " ");
			}
		}
	}

}
