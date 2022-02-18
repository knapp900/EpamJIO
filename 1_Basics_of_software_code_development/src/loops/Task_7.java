package loops;

import java.util.Scanner;

/**
 * 
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 * 
 * @author Knapp Arthur
 *
 */

public class Task_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = m; i <= n; i++) {
			printDivisor(i);
		}
		sc.close();
	}

	private static void printDivisor(int i) {
		System.out.print("For " + i + ": ");
		boolean noDivisor = true;
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				System.out.print(j + " ");
				noDivisor = false;
			}
		}
		if (noDivisor) {
			System.out.print("no delimiters.");
		}
		System.out.println();
	}

}
