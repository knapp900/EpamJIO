package arrayArrays;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task_3 {
	public static void main(String[] args) {
		int k = 2;
		int p = 4;
		int[][] array = new int[5][5];

		array = fillArray(array);

		twoDimArray(array, k, p);

	}

	private static int[][] fillArray(int[][] tmpArray) {
		for (int i = 0; i < tmpArray.length; i++) {
			for (int j = 0; j < tmpArray[i].length; j++) {
				tmpArray[i][j] = ((int) (Math.random() * 10));
			}
		}
		return tmpArray;

	}

	private static void twoDimArray(int[][] tmpArray, int k, int p) {
		for (int i = 0; i < tmpArray.length; i++) {
			System.out.println();
			for (int j = 0; j < tmpArray[i].length; j++) {
				System.out.print(tmpArray[i][j] + " | ");

			}
		}
		System.out.print('\n' + "K равен:" + k + ".K-я строка: ");

		for (int i = 0; i < tmpArray[k].length; i++) {
			System.out.print(tmpArray[k][i]);
		}
		System.out.print('\n' + "P равен:" + p + ".P-й столбец: ");
		for (int i = 0; i < tmpArray.length; i++) {
			System.out.print(tmpArray[i][p]);
		}

	}

}
