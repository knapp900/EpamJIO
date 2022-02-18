package arraySort;

import java.util.Arrays;

//Даны дроби - натуральные). Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.

public class Task_8 {
	public static void main(String[] args) {
		int[] numerator = { 1, 3, 8, 3, 5, 8, 2, 7 };
		int[] denominator = { 2, 4, 5, 9, 6, 7, 8, 2 };
		int CommonDenom = 1;
		System.out.println("Данные дроби:");
		System.out.println("Числители:\t  " + Arrays.toString(numerator));
		System.out.println("Знаменатиели: " + Arrays.toString(denominator));
		// находим общий знаменатель
		for (int i = 0; i < denominator.length; i++) {
			CommonDenom *= denominator[i];
		}
		// приводим к общему знаменателю
		int[] givenNumerator = new int[numerator.length];
		for (int i = 0; i < givenNumerator.length; i++) {
			givenNumerator[i] = numerator[i] * (CommonDenom / denominator[i]);
		}
		for (int i = numerator.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (givenNumerator[j] > givenNumerator[j + 1]) {

					int temp = givenNumerator[j];
					givenNumerator[j] = givenNumerator[j + 1];
					givenNumerator[j + 1] = temp;
					// сортируем массив числителей
					int tempNumerator = numerator[j];
					numerator[j] = numerator[j + 1];
					numerator[j + 1] = tempNumerator;
					// сортируем массив знаменателей
					int tempDenominator = denominator[j];
					denominator[j] = denominator[j + 1];
					denominator[j + 1] = tempDenominator;
				}
			}
		}
		System.out.println("Отстортированные дроби:");
		System.out.println("Числители:\t  " + Arrays.toString(numerator));
		System.out.println("Знаменатиели: " + Arrays.toString(denominator));
	}

}
