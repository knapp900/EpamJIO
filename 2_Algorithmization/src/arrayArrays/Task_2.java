package arrayArrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task_2 {
	public static void main(String[] args) {
		int[][] array = new int[5][5];

		array = fillArray(array);

		System.out.print("Матрица: ");

		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " | ");
			}

		}
		diagonalArrayOutput(array);
		System.out.println(" Элементы стоящие на диагонали.");

	}

	private static int[][] fillArray(int [][] tmpArray) {
		for (int i = 0; i < tmpArray.length; i++) {
			for (int j = 0; j < tmpArray[i].length; j++) {
				tmpArray[i][j] = ((int) (Math.random() * 10));
			}
		}
		return tmpArray;

	}

	private static void diagonalArrayOutput(int[][] array) {
		for (int i = 0; i < array.length ; i++) {
			System.out.print(" ");
			for (int j = 0; j < array[i].length; j++) {
			}
			System.out.print(array[i][i]);
		}
	}

}
