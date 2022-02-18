package loops;

import java.util.Scanner;

/**
 * 
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 * 
 * @author Knapp Arthur
 *
 */

public class Task_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите любое целое положительное число: ");
		int num = scan.nextInt();
		int sum = 0;
		int i;
		scan.close();
		for (i = 1; i <= num; i++) {
			sum = sum + i;

		}
		System.out.println("Сумма числа от 1 до " + num + " равна " + sum);
	}
}
