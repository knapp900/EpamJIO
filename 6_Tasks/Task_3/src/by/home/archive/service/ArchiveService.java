package by.home.archive.service;

import java.util.List;

import by.home.archive.entity.Student;

public interface ArchiveService {

	List<Student> getAllStudents() throws ServiceException;

	boolean addStudentToXML(Student student) throws ServiceException;
	
	boolean delStudent(String id) throws ServiceException;

}
