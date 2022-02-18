package loops;

/**
 *
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
 * которых больше или равен заданному е. Общий член ряда имеет вид:aₙ = 1/2ₙ + 1/3ₙ
 * 
 * @author Knapp Arthur
 *
 */

public class Task_5 {
	public static void main(String[] args) {

		double n = 0.1;
		double elem = 2;
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			double a = ((1 / (Math.pow(2, i))) + ((1 / (Math.pow(3, i)))));
			double modul = Math.abs(a);
			if (modul >= elem)
				sum += a;
		}
		System.out.println(sum);

	}
}
