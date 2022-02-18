package by.home.task_2;
/*
  Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.

 */

public class Test2 {
	private int one;
	private int two;
	
	public Test2 () {
		this.one = 0;
		this.two = 0;
	}
	
	public Test2 (int one, int two) {
		this.one = one;
		this.two = two;
	}
	
	public int getOne() {
		return one;
	}
	public void setOne(int one) {
		this.one = one;
	}
	public int getTwo() {
		return two;
	}
	public void setTwo(int two) {
		this.two = two;
	}
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		test2.setOne(12);
		System.out.println("One " + test2.getOne());
		System.out.println("Two " + test2.getTwo());
	}
	


}
