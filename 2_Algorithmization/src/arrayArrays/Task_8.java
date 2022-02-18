package arrayArrays;

import java.util.Scanner;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

public class Task_8 {
	public static void main(String[] args) {
		int[][] array = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 1 }, { 2, 3, 4, 5, 6 } };
		System.out.print("Программа заменяет местами столбцы массива." + '\n' + "Массив до изменения: ");
		printArray(array);
		array = changeArrayColumn(array, 0);
		System.out.println("Массив после изменения: ");
		printArray(array);

	}

	private static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println();

			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}

	}

	private static int[][] changeArrayColumn(int[][] tmpArray, int length) {
		Scanner scan = new Scanner(System.in);
		System.out.println('\n' + "Введите номер столбца для замены." + '\n' + "Первый столбц для замены: ");
		int columnForChange1 = scan.nextInt();
		System.out.println("Второй столбц для замены: ");

		int columnForChange2 = scan.nextInt();
		scan.close();
		for (int i = 0; i < tmpArray.length; i++) {
			for (int j = 0; j < tmpArray[i].length; j++) {
				int temp = tmpArray[i][columnForChange1 - 1];
				tmpArray[i][columnForChange1 - 1] = tmpArray[i][columnForChange2 - 1];
				tmpArray[i][columnForChange2 - 1] = temp;

			}
		}
		return tmpArray;

	}

}
