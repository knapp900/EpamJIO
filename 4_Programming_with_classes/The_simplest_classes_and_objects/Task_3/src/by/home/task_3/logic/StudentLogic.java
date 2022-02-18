package by.home.task_3.logic;
import by.home.task_3.entity.*;

public class StudentLogic {
	
	public boolean excellentStudent(Student student) {
		boolean flag = true;
		for (int i = 0; i < student.getProgress().length;i++) {
			if (student.getProgress()[i] < 9) {
				flag = false;
			}
		}
		return flag;
		
	}
	
	 public void printExellentStudent(Student student) {
         if (excellentStudent(student)) {
             System.out.println("Отличник: " + student.getName() + " Номер группы: " + student.getGroupNumber());
         }
     }

}
