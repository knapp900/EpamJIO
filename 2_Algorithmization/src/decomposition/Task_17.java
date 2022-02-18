package decomposition;

//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task_17 {
	public static void main(String[] args) {
		int num = 5046;
		System.out.println(amountOfTheNumber(num));
	}

	private static int getCountsOfDigits(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n /= 10;
		}
		return count;
	}

	private static int sumDigitNumbers(int num, int countOfDigit) {
		int sum = 0;
		for (int i = 0; i < countOfDigit; i++) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}

	private static int amountOfTheNumber(int num) {

		int count = 0;
		while (num != 0) {
			count++;
			num = num - sumDigitNumbers(num, getCountsOfDigits(num));
		}
		return count;
	}

}
