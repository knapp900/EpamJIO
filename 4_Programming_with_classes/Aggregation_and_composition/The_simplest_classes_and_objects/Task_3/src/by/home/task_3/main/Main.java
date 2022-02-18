package by.home.task_3.main;
import by.home.task_3.logic.*;
import by.home.task_3.entity.*;
/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.

Create a class named Student containing fields: last name and initials, group number, grade (array
of five elements). Create an array of ten elements of this type. Add the ability to display surnames and
group numbers of students with grades of only 9 or 10.
*/

public class Main {
	public static void main(String[] args) {

		Student[] students = new Student[10];
		students[0] = new Student("Marley B", new int[] { 1, 4, 7, 8, 5 }, 102);
		students[1] = new Student("Petrov S", new int[] { 1, 4, 7, 8, 5 }, 101);
		students[2] = new Student("Sidorov A", new int[] { 1, 4, 7, 8, 5 }, 101);
		students[3] = new Student("Bach J", new int[] { 1, 4, 7, 8, 5 }, 102);
		students[4] = new Student("Davidoff Z", new int[] { 9, 9, 9, 10, 9 }, 103);
		students[5] = new Student("Einstein A", new int[] { 10, 10, 10, 10, 10 }, 104);
		students[6] = new Student("Turing A", new int[] { 10, 10, 10, 10, 10 }, 104);
		students[7] = new Student("Ben-Gurion D", new int[] { 1, 4, 7, 8, 5 }, 105);
		students[8] = new Student("Perec S", new int[] { 1, 4, 7, 8, 5 }, 105);
		students[9] = new Student("Natanjhy B", new int[] { 1, 4, 7, 8, 5 }, 105);
		
		StudentLogic getExellentStudent = new StudentLogic();
		for (Student student : students) {
			getExellentStudent.printExellentStudent(student);
		}

	}
}
