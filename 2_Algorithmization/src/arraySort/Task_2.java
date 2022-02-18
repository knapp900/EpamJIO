package arraySort;

import java.util.Arrays;

//Даны две последовательности. 
//Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
//Примечание. Дополнительный массив не использовать.

public class Task_2 {
	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 9, 4, 5, 6 };
		int[] arr2 = new int[] { 21, 12, 19, 14, 15, 16 };

		System.out.println("Массив 1: " + Arrays.toString(arr1) + '\n' + "Массив 2: " + Arrays.toString(arr2));

		int position = arr1.length;
		arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
		System.arraycopy(arr2, 0, arr1, position, position);
		Arrays.sort(arr1);
		System.out.println("Массив после изменений: " + Arrays.toString(arr1));

	}
}