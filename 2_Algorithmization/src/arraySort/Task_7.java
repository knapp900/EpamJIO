package arraySort;

//Пусть даны две неубывающие последовательности действительных чисел.
//Требуется указать те места, на которые нужно вставлять элементы последовательности в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

public class Task_7 {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 3, 5, 7 };
		int[] arr2 = new int[] { 2, 4, 6, 8 };
		int[] newArray = arr1;

		System.out.println("Даны последовательность A:");
		printArray(arr1);
		System.out.println("\nи последовательность B:");
		printArray(arr2);

		for (int element : arr2) {
			int pointInsert = nextInsert(newArray, element);
			int[] arrayTemp = new int[newArray.length + 1];

			for (int i = 0; i < newArray.length; i++) {
				if (pointInsert > i) {
					arrayTemp[i] = newArray[i];
				} else if (pointInsert == i) {
					arrayTemp[i] = element;
					arrayTemp[i + 1] = newArray[i];
				} else {
					arrayTemp[i + 1] = newArray[i];
				}
			}

			newArray = arrayTemp;
			System.out.printf("%n%nПозиция вставки нового элемента \"%d\": i = %d", element, pointInsert);
			System.out.println("\nНовая последовательность:");
			printArray(newArray);
		}
	}

	private static int nextInsert(int[] array, int element) {
		int j = 0;
		int firstIndex = 0;
		int lastIndex = array.length - 1;

		while (firstIndex <= lastIndex) {
			j = (firstIndex + lastIndex) / 2;
			if (array[j] == element) {
				return j;
			} else if (array[j] < element) {
				firstIndex = j + 1;
			} else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
				lastIndex = j - 1;
			} else {
				break;
			}
		}
		return j;
	}

	private static void printArray(int[] a) {
		for (int element : a) {
			System.out.printf("%d ", element);
		}
	}

}
