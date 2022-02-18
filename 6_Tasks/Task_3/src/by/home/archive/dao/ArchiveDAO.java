package by.home.archive.dao;


import java.util.List;

import by.home.archive.entity.Student;

public interface ArchiveDAO {
	
	
	List<Student> getAllListInToXML() throws DAOException;

	boolean addToArchiveInXML(List<Student> list) throws DAOException;
	
	boolean delStudent(String id) throws DAOException;

}
