package arrayArrays;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task_1 {

	public static void main(String[] args) {

		int[][] array = new int[10][10];
		array = fillArray(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "|");
			}
		}
		outputDimlArray(array);

	}

	private static int[][] fillArray(int[][] tmpArray) {
		for (int i = 0; i < tmpArray.length; i++) {
			for (int j = 0; j < tmpArray[i].length; j++) {
				tmpArray[i][j] = ((int) (Math.random() * 10));
			}
		}
		return tmpArray;
	}

	private static void outputDimlArray(int[][] tmpArray) {
		for (int i = 1; i < tmpArray[0].length; i += 2) {
			if (tmpArray[0][i] > tmpArray[tmpArray.length - 1][i]) {
				System.out.print('\n' + "Нечетный столбец :" + i + " Элементы столбца : ");
				for (int j = 0; j < tmpArray[i].length; j++) {
					System.out.print(tmpArray[j][i] + " ");
				}
			}

		}
	}
}
