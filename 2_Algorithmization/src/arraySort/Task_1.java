package arraySort;

import java.util.Arrays;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

//Two one-dimensional arrays with different number of elements and a natural number k are given. Combine them into
//one array, including the second array between the kth and (k + 1) - th elements of the first, while not using
//additional array.

public class Task_1 {
	public static void main(String[] args) {
		int k = 4;
		int[] arr1 = new int[] { 1, 2, 9, 4, 5, 6 };
		int[] arr2 = new int[] { 1, 1, 1, 1 };
		arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
		for (int i = arr1.length - 1 - arr2.length;i >= k; i--) {
			int temp;
			temp = arr1[i];
			arr1[i] = arr1[i + arr2.length];
			arr1[i + arr2.length] = temp; 
		}
		for (int i = 0;i < arr2.length;i++) {
			arr1[i + k] = arr2[i];
		}
		System.out.println(Arrays.toString(arr1));
	}

}
