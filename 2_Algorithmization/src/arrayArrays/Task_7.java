package arrayArrays;

import java.util.Arrays;

//Сформировать квадратную матрицу порядка N по правилу:
//A[I J] = sin((I2 - J2) / n)
//и подсчитать количество положительных элементов в ней.

public class Task_7 {
	public static void main(String[] args) {

		int n = 2;
		int positiveElementCount = 0;
		double[][] array = new double[n][n];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
				if (array[i][j] >= 0) {
					positiveElementCount++;
				}
			}
		}

		System.out.println("Количество положительных элементов: " + positiveElementCount);
		System.out.println(Arrays.deepToString(array));

	}

}
