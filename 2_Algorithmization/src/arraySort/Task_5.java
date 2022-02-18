package arraySort;

import java.util.Arrays;

//Сортировка вставками. Дана последовательность чисел
//. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть
//- упорядоченная последовательность, т. е.
//. Берется следующее число
//и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

//Sort by inserts. Given a sequence of numbers
//. Required to rearrange numbers in order
//ascending. This is done as follows. Let be
//is an ordered sequence, i.e.
//. The next number is taken
//and inserted into the sequence so that the new
//the sequence was also ascending. The process is carried out until all elements from i +1 to n
//will not be enumerated. Note. Place the next element in the sorted part to produce
//using binary search. Binary search should be presented as a separate function.

public class Task_5 {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 9, 4, 5, 6 };
		System.out.println("Массив до сортировки: " + Arrays.toString(arr1));

	
		System.out.printf("%nAnswer fifthTask: %n");

		int i = 0;
		int n = 0;
		int temp;

		while (arr1[i] <= arr1[i + 1]) {
			i++;
		}

		for (int j = i + 1; j < arr1.length; j++) {
			n = Arrays.binarySearch(arr1, 0, j, arr1[j]);
			temp = arr1[j];
			for (int k = j; k > n + 1; k--) {
				arr1[k] = arr1[k - 1];
			}
			arr1[n + 1] = temp;
		}
		System.out.println("Массив до сортировки: " + Arrays.toString(arr1));


	}

}
