package by.home.task_1;

/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
 * методы изменения этих переменных. Добавьте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение из
 * этих двух переменных.
 * 
 * @author Knapp Arthur
 *
 */

public class Test1 {
	private int one;
	private int two;

	public Test1(int one, int two) {
		this.one = one;
		this.two = two;

	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getOne() {
		return one;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	public int getTwo() {
		return two;
	}

	public int sum(int one, int two) {
		return one + two;

	}

	public int max(int one, int two) {
		return Math.max(one, two);

	}

	public void print(int val) {
		System.out.println(val);

	}

	public static void main(String[] args) {
		Test1 test1 = new Test1(0, 0);
		test1.setOne(44);
		test1.setTwo(22);
		System.out.println("One:" + test1.getOne() + '\n' + "Two:" + test1.getTwo());
		System.out.println("Max:" + test1.max(test1.getOne(), test1.getTwo()));
		System.out.println("Sum:" + test1.sum(test1.getOne(), test1.getTwo()));
	}

}
