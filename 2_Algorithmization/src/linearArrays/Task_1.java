package linearArrays;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task_1 {
	public static void main(String[] args) {
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = i;
		}
		int k = 3;
		int sum = 0;
		for (int i = 1; i < array.length; i++) {
			if (i % k == 0) {
				sum += i;
				System.out.println("Число кратно " + k + " = " + i);
			}

		}
		System.out.println("Сумма чисел = " + sum);

	}
}
