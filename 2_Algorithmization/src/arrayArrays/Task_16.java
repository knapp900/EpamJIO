package arrayArrays;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,2
//n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
//6 1 8
//7 5 3
//2 9 4

public class Task_16 {
	public static void main(String[] args) {

		int n;
		n = 3; // 3, 5, 7, ....
		if (n % 2 == 0 || n < 3) {
			System.out.println("Incorrect input, try again");

		}
		int[][] a = new int[n][n];

		int i = 0, j = n / 2;

		for (int k = 1; k <= n * n; k++) {
			a[i][j] = k;
			i--;
			j++;
			if (k % n == 0) {
				i += 2;
				j--;
			} else {
				if (j == n) {
					j -= n;
				} else if (i < 0) {
					i += n;
				}
			}

		}

		for (int z = 0; z < a.length; z++) {
			System.out.println("  ");

			for (int x = 0; x < a[z].length; x++) {
				System.out.print(a[z][x] + " ");
			}

		}
	}

}
