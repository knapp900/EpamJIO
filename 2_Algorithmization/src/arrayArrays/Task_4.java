package arrayArrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//{1, 2,  3,  4,  5....} 
//{n,n-1,n-2,n-3,n-4...}
//{1, 2,  3,  4,  5....} 
//{n,n-1,n-2,n-3,n-4...}
//{1, 2,  3,  4,  5....} 
//{n,n-1,n-2,n-3,n-4...}

public class Task_4 {
	public static void main(String[] args) {
		int n = 10;
		int[][] array;
		array = twoDimArray(n);
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j]);
			}
		}

	}

	private static int[][] twoDimArray(int n) {
		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = (i % 2 == 0) ? j + 1 : n - j;

			}
		}

		return array;
	}

}
