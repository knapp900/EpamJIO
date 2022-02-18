package by.home.archive.controller.impl;

import by.home.archive.controller.Command;
import by.home.archive.entity.Student;
import by.home.archive.service.ServiceException;
import by.home.archive.service.ServiceProvider;

public class AddStudentToArchive implements Command {
	
	

	@Override
	public String exequte(String[] params) {
		ServiceProvider provider = ServiceProvider.getInstance();
		
		String [] param = params;
		
		String firstName = param[1];
		String lastName = param[2];
		int age = Integer.parseInt(param[3]);
		String faculty = param[4];
		int course = Integer.parseInt(param[5]);
		
		Student student = new Student(firstName, lastName, age, faculty, course);
		
		try {
			
			if(provider.getArchiveService().addStudentToXML(student)) {
				
				return "Студент успешно добавлен.";
			}
		} catch (ServiceException e) {
			
			System.err.println("Error: " + e);
		}
		
		return null;
	}
	
	

}
