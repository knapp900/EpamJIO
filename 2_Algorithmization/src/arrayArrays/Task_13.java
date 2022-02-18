package arrayArrays;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task_13 {
	public static void main(String args[]) {

		int[][] a = { { 1, 7, 3, -2, 7 }, { 4, -5, 6, 7, 1 }, { -4, 5, 6, 7, 1 }, { 4, 5, 6, -7, 1 },
				{ 7, -2, 4, 3, 8 }, { 7, 8, 9, -1, 3 } };
		int val;
		boolean isSorted = false;

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

		for (int i = 0; i < a[0].length; i++) {

			while (!isSorted) {

				isSorted = true;
				for (int j = 0; j < a.length - 1; j++) {

					if (a[j][i] > a[j + 1][i]) {

						isSorted = false;
						val = a[j][i];
						a[j][i] = a[j + 1][i];
						a[j + 1][i] = val;
					}
				}
			}
			isSorted = false;
		}

		System.out.println("Matrix positively sorted by column: ");
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {

				if (a[i][j] >= 0) {

					System.out.print(" ");
				}
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}

		System.out.println("Matrix negatively sorted by column: ");
		for (int i = a.length - 1; i >= 0; i--) {

			for (int j = 0; j < a[0].length; j++) {

				if (a[i][j] >= 0) {

					System.out.print(" ");
				}
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
	}

}
