package decomposition;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task_11 {
	public static void main(String[] args) {
		int numOne = 545;
		int numTwo = 35535;
		System.out.println("Первое число:"+ numOne + '\n' + "Второе число:"+ numTwo);
		numbersMoreOfDigits(numOne, numTwo);
	}

	private static int getCountsOfDigits(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}

	private static void numbersMoreOfDigits(int numOne, int numTwo) {
		if (getCountsOfDigits(numOne) > getCountsOfDigits(numTwo)) {
			System.out.println("Первое число содержит больше чисел чем второе");
		} else {
			System.out.println("Второе число содержит больше чисел чем первое");

		}
		return;
	}

}
