package arrayArrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//{1 1 1 1}
//{2 2 2 0}
//{3 3 0 0}
//{4 0 0 0}


public class Task_5 {
	public static void main(String[] args) {
		int n = 4;
		int[][] array = new int[n][n];
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n - i; j++) {
				array[i][j] = 1 + i;
				System.out.print(array[i][j] + " ");
			}
			for (int j = n - i; j < n; j++) {
				array[i][j] = 0;
				System.out.print(array[i][j] + " ");
			}
		}
	}

}
