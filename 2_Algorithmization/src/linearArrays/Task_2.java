package linearArrays;

import java.util.Arrays;
import java.util.Scanner;

//Дана последовательность действительных чисел а 1 ,а 2 ,..., а п . Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class Task_2 {

	public static void main(String[] args) {
		int count = 0;
		double[] array = new double[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = (i * i - array.length);

		}
		System.out.println("Массив до изменений: " + Arrays.toString(array));
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число для замены: ");
		double z = scan.nextDouble();
		scan.close();
		System.out.println("Число для замены: " + z);

		for (int i = 0; i < array.length; i++) {
			if (array[i] > z) {
				array[i] = z;
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Замены не произвелась!");
		} else {
			System.out.println("Количество изменений: " + count);
		}
		System.out.println("Массив изменен: " + Arrays.toString(array));
	}

}
