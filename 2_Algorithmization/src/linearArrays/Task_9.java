package linearArrays;

import java.util.Arrays;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

public class Task_9 {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 1, 1, 2, 2, 2, 35, 4, 66, 4, 1, 2 };
		System.out.println("Массив до изменения: " + Arrays.toString(a));

		int count1 = 0;
		int count2 = 0;
		int duplicateNamberOne;
		int duplicateNamberTwo = 0;

		for (int i = 0; i < a.length; i++) {
			duplicateNamberOne = a[i];
			count1 = 0;

			for (int j = i + 1; j < a.length; j++) {
				if (duplicateNamberOne == a[j])
					count1++;
			}

			if (count1 > count2) {
				duplicateNamberTwo = duplicateNamberOne;
				count2 = count1;
			} else if (count1 == count2) {
				duplicateNamberTwo = Math.min(duplicateNamberTwo, duplicateNamberOne);
			}
		}
		System.out.println("Часто встречающееся минимальное число = " + duplicateNamberTwo + ". Встречается " + (count2 + 1) + " раз(а)");
	}

}
