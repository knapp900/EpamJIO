package decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

public class Task_2 {
	public static void main(String[] args) {
		int a, b, c, d;
		int gcd1, gcd2, gcd3;
		a = 125;
		b = 20;
		c = 30;
		d = 40;
		gcd1 = findGcd(a, b);
		gcd2 = findGcd(c, d);
		gcd3 = findGcd(gcd1, gcd2);

		System.out.println(gcd3);

	}

	private static int findGcd(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else if (b > a) {
				b = b - a;

			}
		}
		return a;

	}

}
