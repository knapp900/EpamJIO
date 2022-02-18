package linearArrays;

//Даны действительные числа a 1 , a 2 ,..., a n . Найти max( a 1 + a 2 n , a 2 + a 2 n − 1 ,..., a n + a n + 1 ) .

public class Task_7 {

	public static void main(String[] args) {
		double[] a = new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 90.0,0.0};
		double max = 0;
		if (a.length % 2 == 0) {

			for (int i = 0, j = a.length - 1;i < a.length / 2; i++, j--) {
				if (a[i] + a[j] > max) {
					max = a[i] + a[j];

				}
			}
			System.out.println("Мax " + max);
		}
		else {
			
			System.out.println("Количество элементов массива должно быть четным!");
		}

	}
	
}
