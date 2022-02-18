package decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:HOK(A,B)=A*B/НОД(A*B).

public class Task_1 {
	public static void main(String[] args) {
		int a = 8;
		int b = 12;
		int gcd;
		int lcm;
		findGcd(a, b);
		gcd = findGcd(a, b);
		System.out.println(gcd);
		lcm = findLcm(a, b);
		System.out.println(lcm);

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

	private static int findLcm(int a, int b) {

		return a * b / findGcd(a, b);

	}

}
