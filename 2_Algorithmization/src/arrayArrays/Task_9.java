package arrayArrays;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class Task_9 {
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
				System.out.print(array[i][j] + " ");

			}
		}
		maxColumnValue(array);

	}

	private static int[][] maxColumnValue(int[][] array) {
		int columnNumber = 0;
		int sum = 0;
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[j][i];
			}
			if (sum > max) {
				max = sum;
				columnNumber = i + 1;
			}
			sum = 0;

		}
		System.out.println('\n' + "Max value column: " + max + '\n' + "Column number: " + columnNumber);
		return array;

	}
}
