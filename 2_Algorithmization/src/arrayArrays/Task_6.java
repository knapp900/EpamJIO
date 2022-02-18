package arrayArrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//{1 1 1 1 1 1 }
//{0 1 1 1 1 0 }
//{0 0 1 1 0 0 }
//{0 0 1 1 0 0 }
//{0 1 1 1 1 0 }
//{1 1 1 1 1 1 }

public class Task_6 {
	public static void main(String[] args) {
		int n = 6;
		int[][] array = new int[n][n];
		for (int i = 0; i < array.length / 2; i++) {
			for (int j = i; j < n - i; j++) {
				array[i][j] = 1;
				array[array.length - i - 1][j] = 1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}

		}
	}

}
