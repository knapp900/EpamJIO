package arraySort;

import java.util.Arrays;

//Сортировка выбором. Дана последовательность чисел
//.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

public class Task_3 {
	public static void main(String[] args) {
		int [] array = new int [] {12,23,5,1,5,2,3,55,65,4,6,88,7,8,0};
		
		for (int stap = 0;stap < array.length;stap++) {
//			int index = min(array,stap);
			int index = max(array,stap);

			int tmp = array[stap];
			array[stap] = array[index];
			array[index] = tmp;
		}
	
		System.out.println(Arrays.toString(array));
	}
	private static int max(int [] array,int start) {
		int minIndex = start;
		int minValue = array[start];
		for (int i = start + 1;i < array.length;i++) {
			if (array[i] > minValue) {
				minValue = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
//	private static int min(int [] array,int start) {
//		int minIndex = start;
//		int minValue = array[start];
//		for (int i = start + 1;i < array.length;i++) {
//			if (array[i] < minValue) {
//				minValue = array[i];
//				minIndex = i;
//			}
//		}
//		return minIndex;
//	}

}
