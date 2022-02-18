package arraySort;

import java.util.Arrays;

//Сортировка обменами. Дана последовательность чисел.Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа,то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

public class Task_4 {

	public static void main(String[] args) {
		int[] array = new int[] { 12, 23, 5, 1, 5, 2, 3, 55, 65, 4, 6, 88, 7, 8, 0 };
		System.out.println(Arrays.toString(array));
		int count = 0;

		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;

			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					int tmp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = tmp;
					count++;
					
					isSorted = false;
					
				}
			}
		}

		System.out.println(Arrays.toString(array) + '\n' + "Количество перестановок: " + count);
	}

}
