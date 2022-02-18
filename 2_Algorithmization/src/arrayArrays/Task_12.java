package arrayArrays;

import java.util.Arrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task_12 {
	public static void main(String args[]) {

		int[][] a = { { 1, 7, 3, -2, 7 }, { 4, -5, 6, 7, 1 }, { -4, 5, 6, 7, 1 }, { 4, 5, 6, -7, 1 },
				{ 4, 2, 5, -4, 7 }, { 7, 8, 9, -1, 3 } };

		System.out.println("Original matrix: ");
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {

				if (a[i][j] >= 0) {

					System.out.print(" ");
				}
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < a.length; i++) {

			Arrays.sort(a[i]);
		}

		System.out.println("Matrix positively sorted by row: ");
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {

				if (a[i][j] >= 0) {

					System.out.print(" ");
				}
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}

		System.out.println("Matrix negatively sorted by row: ");
		for (int i = 0; i < a.length; i++) {

			for (int j = a[0].length - 1; j >= 0; j--) {

				if (a[i][j] >= 0) {

					System.out.print(" ");
				}
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
	}

}
