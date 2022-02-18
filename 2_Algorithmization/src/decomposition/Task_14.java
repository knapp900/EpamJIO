package decomposition;

//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.

public class Task_14 {
	public static void main(String[] args) {
		int number = 9999;
		PrintArrayNum(number);
		;
	}

	private static void PrintArrayNum(int number) {
		for (int i = 1; i <= number; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + " ");
			}

		}

	}

	private static boolean isArmstrong(int n) {
		int temp, digits = 0, last = 0, sum = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;
			sum += isArmstrongCheck(last, digits);
			temp = temp / 10;
		}
		if (n == sum)
			return true;
		else
			return false;
	}

	private static int isArmstrongCheck(int last, int digits) {
		int sum = (int) (Math.pow(last, digits));
		return sum;
	}

}
