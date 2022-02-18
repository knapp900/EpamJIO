package decomposition;

//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.

public class Task_8 {
	public static void main(String[] args) {

		int[] array = new int[] { 1, 12, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		int k = 2;
		int m = 4;
		
		partArraySum(array, k, m);
	}

	private static void partArraySum(int[] array, int k, int m) {
		int sum = 0;
		
		for (int i = k; i <= m; i++) {

			sum += array[i - 1];
		}
		System.out.println(sum);
	}
}
