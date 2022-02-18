package linearArrays;

import java.util.Arrays;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Task_3 {

	public static void main(String[] args) {
		int countNegativValue = 0;
		int countPositiveValue = 0;
		int countNullValue = 0;

		double[] array = new double[] {-10.0, -9.0, -6.0, -1.0, 0.0, 6.0, 15.0, 26.0, 39.0, 54.0, 71.0};

		System.out.println("Массив действительных чисел: " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0.0) {
				countNegativValue++;
			} else if (array[i] == 0.0) {
				countNullValue++;

			} else {
				countPositiveValue++;
			}

		}
		System.out.println("Отрицательных значений: " + countNegativValue);
		System.out.println("Нулевых значений: " + countNullValue);
		System.out.println("Положительных значений: " + countPositiveValue);

	}

}
