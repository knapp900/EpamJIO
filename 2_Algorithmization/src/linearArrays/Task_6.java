package linearArrays;

import java.util.Arrays;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class Task_6 {

	public static void main(String[] args) {
		double sum;
		double[] array = new double[20];
//		  Заполняем массив 
		for (int i = 0; i < array.length; i++) {
			array[i] = (i * i - array.length);
		}
		System.out.println("Массив до проверки: " + Arrays.toString(array));
		sum = primeNumbers(array);
		System.out.println("Сумма элементов массива равна: " + sum);

	}

	private static double primeNumbers(double array[]) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {

//			 Количество делителей
			int factors = 0;

//			 Первый делить - единица

//			 обходим все числа от 1 до порядкового номера текущего элемента массива
			for (int j = 1; j <= i; j++) {

//				 Если порядковый номер делиться на число без остатка, значит число является
//				 его делителем.
				if (i % j == 0) {
					// Увеличиваем количество делителей данного числа на 1.
					factors++;
				}
			}

//			 Если количество делителей у числа - 2, т.е. единица и само число, то число
//			 является простым.
			if (factors == 2) {

				System.out.println("Индек " + i + " является простым числом," + "элемент данного индекса " + array[i] );

//				 Добавляем его к сумме
				sum += array[i];
			}
		}
		return sum;
	}
}
