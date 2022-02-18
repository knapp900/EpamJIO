package by.home.archive.service.impl;

import java.util.ArrayList;
import java.util.List;


import by.home.archive.dao.DAOException;
import by.home.archive.dao.DAOProvider;
import by.home.archive.entity.Student;
import by.home.archive.service.ArchiveService;
import by.home.archive.service.ServiceException;

public class ServiceArchiveImpl implements ArchiveService {

	DAOProvider provider = DAOProvider.getInstance();

	@Override
	public List<Student> getAllStudents() throws ServiceException {

		try {

			return provider.getArchiveDAO().getAllListInToXML();

		} catch (DAOException e) {

			throw new ServiceException(e);

		}
	}

	@Override
	public boolean addStudentToXML(Student student) throws ServiceException {

		List<Student> list = new ArrayList<>();

		try {

			list.addAll(provider.getArchiveDAO().getAllListInToXML());

			for (Student student2 : list) {

				if (student2.getId().equals(student.getId())) {
					return false;
				}

			}

			list.add(student);

			return provider.getArchiveDAO().addToArchiveInXML(list);

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

	}

	@Override
	public boolean delStudent(String id) throws ServiceException {

		List<Student> listIn = new ArrayList<>();
		List<Student> listOut = new ArrayList<>();

		try {

			listIn.addAll(provider.getArchiveDAO().getAllListInToXML());

			for (Student student : listIn) {

				if (!student.getId().equals(id)) {
					listOut.add(student);
				}

			}

			return provider.getArchiveDAO().addToArchiveInXML(listOut);

		} catch (DAOException e) {

			throw new ServiceException(e);
		}

	}

}
