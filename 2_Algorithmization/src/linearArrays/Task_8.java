package linearArrays;

import java.util.Arrays;

//Дана последовательность целых чисел a 1 , a 2 ,..., a n . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min( a 1 , a 2 ,..., a n ) .

public class Task_8 {

	public static void main(String[] args) {
		int count = 0;
		int[] a = new int[] { 22, 1, 2, 3, 4, 5, 6, 1, 8, 9, 7, 1 };
		Arrays.sort(a);
		System.out.println("Массив до удаления min:" + Arrays.toString(a) + " Длинна массива: " + a.length);
		int min = a[0];

		System.out.println("Минимальное значение: " + min);
		for (int k = 0; k < a.length; k++) {
			while (a[k] == min) {
				count++;

				for (int i = 0; i < a.length; i++) {
					if (a[i] == min) {
						for (int j = i; j < a.length - 1; j++) {
							a[j] = a[j + 1];
						}
						break;
					}
				}
			}

		}
		int[] b = new int[a.length - count];
		for (int i = 0; i < a.length - count; i++) {
			b[i] = a[i];

		}
		System.out.print("Массив после удаления min" + Arrays.toString(b) + " Длинна массива: " + b.length);

	}
}
