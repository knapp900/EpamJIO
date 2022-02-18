package decomposition;

import java.util.Arrays;
import java.util.Scanner;

//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task_16 {
	public static void main(String[] args) {
		System.out.print("Введите любое число которое содержит только нечетные цифры: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		int count = getCountsOfDigits(num);
		int sum = sumDigitArray(setNumberToArray(num, count));
		System.out.println("Колличество четных цифр найденных в сумме числа " + num + " равна: "
				+ numberOfEvenNumbers(setNumberToArray(sum, getCountsOfDigits(sum))) + '\n' + "Сумма цифр числа " + num
				+ " равна: " + sum);

	}

	private static int getCountsOfDigits(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	private static int[] setNumberToArray(int num, int count) {
		int[] tmp = new int[count];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = num % 10;
			num = num / 10;
		}
		return tmp;
	}

	private static int sumDigitArray(int[] array) {
		int sum = 0;
		if (Arrays.stream(array).allMatch(i -> i % 2 != 0)) {

			for (int i = 0; i < array.length; i++) {

				sum += array[i];

			}
		}

		return sum;
	}

	private static int numberOfEvenNumbers(int[] array) {
		int count = 0;
		for (int i : array) {
			if (i % 2 == 0) {
				count++;
			}
		}
		return count;
	}

}
