package arraySort;

import java.util.Arrays;

//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента.Если а, то продвигаются
//на один элемент вперед. Если a,то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

public class Task_6 {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 9, 4, 5, 6 };
		System.out.println("Массив до сортировки: " + Arrays.toString(arr1));

		shellSort(arr1);
		System.out.println("Массив после сортировки: " + Arrays.toString(arr1));

	}

	private static int[] shellSort(int[] arr) {

		int temp;
		int i = 0;

		while (i < arr.length - 1) {
			if (arr[i] <= arr[i + 1]) {
				i++;
			} else {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = i == 0 ? 0 : i - 1;
			}
		}

		return arr;
	}

}
