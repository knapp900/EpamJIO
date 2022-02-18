package linearArrays;

import java.util.Arrays;
//Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами наибольший и наименьший элементы.

public class Task_4 {

	public static void main(String[] args) {
		double[] array = new double[] { -10.0, -9.0, -6.0, -1.0, 0.0, 6.0, 15.0, 26.0, 39.0, 54.0, 71.0 };

		System.out.println("Массив до изменения: " + Arrays.toString(array));

		double temp = array[0];
		array[0] = array[array.length - 1];
		array[array.length - 1] = temp;

		System.out.println("Массив после изменения: " + Arrays.toString(array));

	}
}
